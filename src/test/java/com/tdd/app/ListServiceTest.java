package com.tdd.app;

import com.tdd.app.service.ListService;
import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.tdd.app.service.ListService.NullSortOption.*;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(JUnit4.class)
public class ListServiceTest extends TestCase {

    // should it be declared here or in each test method?
    private final ListService listService = new ListService();

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test(expected = IllegalArgumentException.class)
    public void testThrowIllegalArgumentExceptionOnNullList() {
        // given
        List nullListObject = null;

        // when
        listService.sortDescending(nullListObject, NULLS_REMOVE);

    }

    @Test
    public void shouldReturnEmptyListOnEmptyListSort() {
        // given
        List nullListObject = newArrayList();
        final List<Integer> EXPECTED_RESULT = newArrayList();

        // when
        List resultedList = listService.sortDescending(nullListObject, NULLS_REMOVE);

        // then
        assertThat(resultedList).isEmpty();
    }

    @Test
    public void shouldSortOneElementList() {
        // given
        List initialData = newArrayList(13);
        final List<Integer> EXPECTED_RESULT = newArrayList(13);

        // when
        List resultedList = listService.sortDescending(initialData, NULLS_REMOVE);

        // then
        assertThat(EXPECTED_RESULT).hasSameElementsAs(resultedList);
    }

    @Test
    public void shouldReturnEmptyListOnOneNullElement() {
        // given
        List initialData = newArrayList();
        initialData.add(null);

        // when
        List resultedList = listService.sortDescending(initialData, NULLS_REMOVE);

        // then
        assertThat(resultedList).isEmpty();
    }

    @Test
    public void shouldSortAndPutNullFirst() {
        // given
        List<Integer> nullListObject = newArrayList(1,null,2,null,3);
        final List<Integer> EXPECTED_RESULT = newArrayList(null,null,3,2,1);

        // when
        List resultedList = listService.sortDescending(nullListObject, NULLS_FIRST);

        // then
        assertThat(resultedList).as("XXX").hasSameElementsAs(EXPECTED_RESULT);

    }

    @Test
    public void shouldSortAndPutNullLast() {
        // given
        List nullListObject = newArrayList(1,null,2,null,3);
        final List<Integer> EXPECTED_RESULT = newArrayList(3,2,1,null,null);

        // when
        listService.sortDescending(nullListObject, NULLS_LAST);

        // then
    }

    @Test
    public void shouldSortAndRemoveNulls() {
        // given
        List nullListObject = newArrayList(1,null,2,null,3);
        final List<Integer> EXPECTED_RESULT = newArrayList(3,2,1);

        // when
        listService.sortDescending(nullListObject, NULLS_REMOVE);

        // then
    }

    @Test
    public void shouldSortListInDescendingOrder() {
        // given
        List nullListObject = newArrayList(2,1,4,3);
        final List<Integer> EXPECTED_RESULT = newArrayList(4,3,2,1);

        // when
        listService.sortDescending(nullListObject, NULLS_REMOVE);

        // then
    }

}
