
package com.example.pc;
public class Consumer implements Runnable {
    public SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int count = 0;
        try {
            while (count < 10) {   // 👈 match producer
              buffer.consume();
              count++;
              Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } 
    }
}