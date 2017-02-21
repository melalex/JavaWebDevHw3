package com.room414.homework3.task15.abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
public abstract class PriorityQueueTest {
    public abstract PriorityQueue<Integer, Integer> createPriorityQueue();

    @Test
    void insert_nullValue_throwIllegalArgumentException() {
        PriorityQueue<Integer, Integer> queue = createPriorityQueue();

        assertThrows(IllegalArgumentException.class, () -> queue.insert(1, null));
    }

    @Test
    void insert_nullPriority_throwIllegalArgumentException() {
        PriorityQueue<Integer, Integer> queue = createPriorityQueue();

        assertThrows(IllegalArgumentException.class, () -> queue.insert(null, 1));
    }

    @Test
    void insertExtractMax_defaultBehavior_prioritySaves() {
        PriorityQueue<Integer, Integer> queue = createPriorityQueue();

        queue.insert(1, 1);
        queue.insert(1, 1);
        queue.insert(2, 2);
        queue.insert(3, 3);

        assert queue.extractMax() == 3;
        assert queue.extractMax() == 2;
        assert queue.extractMax() == 1;
        assert queue.extractMax() == 1;
    }
}