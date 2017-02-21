package com.room414.homework3.task15.concrate;

import com.room414.homework3.task15.abstraction.PriorityQueue;
import com.room414.homework3.task15.abstraction.PriorityQueueTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alexander Melashchenko
 * @version 1.0 21 Feb 2017
 */
class BinaryHeapPriorityQueueTest extends PriorityQueueTest {

    @Override
    public PriorityQueue<Integer, Integer> createPriorityQueue() {
        return new BinaryHeapPriorityQueue<>();
    }
}