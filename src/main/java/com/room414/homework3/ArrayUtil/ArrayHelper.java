package com.room414.homework3.ArrayUtil;

import java.util.Comparator;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public class ArrayHelper {
    private ArrayHelper() {

    }

    public static <T> T[] quickSort(T[] array, Comparator<T> comparator) {
        T[] result = array.clone();

        doSort(result, comparator, 0, result.length);

        return result;
    }

    private static <T> void doSort(T[] array, Comparator<T> comparator, int start, int end) {
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
}
