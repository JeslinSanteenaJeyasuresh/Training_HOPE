package com.example.pc;
public class Producer implements Runnable {
    public SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        int value = 0;
        try {
            while (value < 10) {   // 👈 stop after 10 items
              buffer.produce(value++);
              Thread.sleep(500);
            }
        } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
        }
}
}