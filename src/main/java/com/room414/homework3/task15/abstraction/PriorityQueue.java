package com.room414.homework3.task15.abstraction;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public interface PriorityQueue<K extends Comparable<K>, E> {
    void insert(K priority, E value);
    void chengePriority(int index, K newPriority);
    void merge(PriorityQueue<? extends K, ? extends E> other);
    E getMinimum();
    E get(int index);
    void extractMinimum();
    void remove(int index);
}
