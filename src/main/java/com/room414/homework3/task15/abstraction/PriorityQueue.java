package com.room414.homework3.task15.abstraction;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public interface PriorityQueue<K extends Comparable<K>, E> {
    int size();
    void insert(K priority, E value);
    E getMax();
    E extractMax();
}
