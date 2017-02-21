package com.room414.homework3.task15.concrate;

import com.room414.homework3.task15.abstraction.PriorityQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public class BinaryHeapPriorityQueue<K extends Comparable<K>, E> implements PriorityQueue<K, E> {
    private List<Node<K, E>> heap;

    private static class Node<K extends Comparable<K>, E> implements Comparable<Node<K, E>> {
        K priority;
        E value;

        Node(K priority, E value) {
            this.priority = priority;
            this.value = value;
        }

        @Override
        public int compareTo(Node<K, E> node) {
            return priority.compareTo(node.priority);
        }
    }

    public BinaryHeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    public BinaryHeapPriorityQueue(int capacity) {
        heap = new ArrayList<>(capacity);
    }

    private Node<K, E> createNode(K priority, E value) {
        return new Node<>(priority, value);
    }

    @Override
    public void insert(K priority, E value) {

    }

    @Override
    public void changePriority(int index, K newPriority) {

    }

    @Override
    public void merge(PriorityQueue<? extends K, ? extends E> other) {

    }

    @Override
    public E getMinimum() {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void extractMinimum() {

    }

    @Override
    public void remove(int index) {

    }
}
