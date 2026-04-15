package com.example.pc;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class SharedBuffer {
    private BlockingQueue<Integer> queue;

    public SharedBuffer(int capacity) {
        queue = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(int value) throws InterruptedException {
        queue.put(value); // blocks if full
        System.out.println("Produced: " + value);
    }

    public int consume() throws InterruptedException {
        int value = queue.take(); // blocks if empty
        System.out.println("Consumed: " + value);
        return value;
    }
}