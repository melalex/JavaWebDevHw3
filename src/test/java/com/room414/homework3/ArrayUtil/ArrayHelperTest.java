package com.room414.homework3.ArrayUtil;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
class ArrayHelperTest {
    @Test
    void quickSort_sortReversOrderedArray_sorted() {
        Integer[] array = new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        Integer[] sortedArrayAnswer = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Integer[] sortedArrayResult = ArrayHelper.quickSort(array, Comparator.comparingInt(e -> e));

        assert Arrays.equals(sortedArrayAnswer, sortedArrayResult);
    }

    @Test
    void quickSort_sortOrderedArray_sorted() {
        Integer[] array = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] sortedArrayAnswer = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Integer[] sortedArrayResult = ArrayHelper.quickSort(array, Comparator.comparingInt(e -> e));

        assert Arrays.equals(sortedArrayAnswer, sortedArrayResult);
    }

    @Test
    void quickSort_sortUnSortedArray_sorted() {
        Integer[] array = new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 };
        Integer[] sortedArrayAnswer = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Integer[] sortedArrayResult = ArrayHelper.quickSort(array, Comparator.comparingInt(e -> e));

        assert Arrays.equals(sortedArrayAnswer, sortedArrayResult);
    }

    @Test
    void quickSort_nullArray_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayHelper.<Integer>quickSort(
                null,
                Comparator.comparingInt(e -> e)
        ));
    }

    @Test
    void quickSort_nullComparator_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayHelper.<Integer>quickSort(
                new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 },
                null
        ));
    }

    @Test
    void mergeAndSort_defaultBehavior_mergedAndSorted() {
        Integer[] array1 = new Integer[] { 5, 7, 2, 1, 4 };
        Integer[] array2 = new Integer[] { 9, 8, 3, 6, 0 };
        Integer[] sortedArrayAnswer = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Object[] sortedArrayResult = ArrayHelper.mergeAndSort(array1, array2, Comparator.comparingInt(e -> e));

        assert Arrays.equals(sortedArrayAnswer, sortedArrayResult);
    }

    @Test
    void mergeAndSort_nullArray1_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayHelper.mergeAndSort(
                null,
                new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 },
                Comparator.comparingInt(e -> e)
        ));
    }

    @Test
    void mergeAndSort_nullArray2_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayHelper.mergeAndSort(
                new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 },
                null,
                Comparator.comparingInt(e -> e)
        ));
    }

    @Test
    void mergeAndSort_nullComparator_throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ArrayHelper.mergeAndSort(
                new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 },
                new Integer[] { 5, 7, 2, 1, 4, 9, 8, 3, 6, 0 },
                null
        ));
    }
}