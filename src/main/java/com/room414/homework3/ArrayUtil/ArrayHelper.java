package com.room414.homework3.ArrayUtil;

import java.util.Comparator;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public class ArrayHelper {
    private ArrayHelper() {

    }

    public static <T> T[] quickSort(T[] array, Comparator<? super T> comparator) {
        if (array == null) {
            throw new IllegalArgumentException("array can't be null");
        }

        if (comparator == null) {
            throw new IllegalArgumentException("comparator can't be null");
        }

        T[] result = array.clone();

        doSort(result, comparator, 0, result.length - 1);

        return result;
    }

    private static <T> void doSort(T[] array, Comparator<? super T> comparator, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int curr = i - (i - j) / 2;

        while (i < j) {
            while (i < curr && (comparator.compare(array[i], array[curr]) <= 0 )) {
                i++;
            }
            while (j > curr && (comparator.compare(array[curr], array[j])) <= 0) {
                j--;
            }
            if (i < j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == curr)
                    curr = j;
                else if (j == curr)
                    curr = i;
            }
        }

        doSort(array, comparator, start, curr);
        doSort(array, comparator, curr+1, end);
    }

    public static <T> Object[] mergeAndSort(T[] array1, T[] array2, Comparator<? super T> comparator) {
        if (array1 == null) {
            throw new IllegalArgumentException("array1 can't be null");
        }

        if (array2 == null) {
            throw new IllegalArgumentException("array2 can't be null");
        }

        if (comparator == null) {
            throw new IllegalArgumentException("comparator can't be null");
        }

        Object[] merged = merge(array1, array2);
        return quickSort(merged, (e1, e2) -> comparator.compare((T) e1, (T) e2));
    }

    private static <T> Object[] merge(T[] array1, T[] array2) {
        Object[] result = new Object[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
