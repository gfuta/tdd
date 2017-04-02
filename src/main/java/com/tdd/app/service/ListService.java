package com.tdd.app.service;


import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.tdd.app.service.ListService.NullSortOption.NULLS_REMOVE;

public class ListService {

    public enum NullSortOption {
        NULLS_FIRST(Ordering.natural().nullsFirst()),
        NULLS_LAST(Ordering.natural().nullsLast()),
        NULLS_REMOVE(Ordering.natural());

        final Ordering ordering;

        NullSortOption(Ordering ordering) {
            this.ordering = ordering;
        }

        Ordering getOrdering() {
            return ordering;
        }
    }

    public <T> List<? extends Comparable<T>> sortDescending(List<? extends Comparable<T>> listToSort, NullSortOption nullSortOption) {
        Preconditions.checkArgument(listToSort != null);
        if (NULLS_REMOVE.equals(nullSortOption)) {
            listToSort = removeNulls(listToSort);
        }
        Ordering ordering = nullSortOption.getOrdering();
        listToSort.sort(ordering);
        return listToSort;

    }

    private <T> List<? extends Comparable<T>> removeNulls(List<? extends Comparable<T>> listToSort) {
        return listToSort.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
