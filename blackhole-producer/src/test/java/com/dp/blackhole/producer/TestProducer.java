package com.dp.blackhole.producer;

import com.dp.blackhole.common.Util;

public class TestProducer {
    
    public static void main(String[] args) throws InterruptedException {
        final String[] topic = args;
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        sendInThread(topic);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i] = t;
            t.start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }
    
    private static void sendInThread(String[] args) throws InterruptedException {
        Producer producer1 = new Producer(args[0]);
        Producer producer2 = new Producer(args[0]);
        producer1.register();
        producer2.register();
        if (args.length > 1) {
            if (args[1].trim().equals("--forever")) {
                while (true) {
                    send(producer1, producer2);
                }
            }
        }
        for (int i = 0; i < 10000; i++) {
            send(producer1, producer2);
        }
        producer1.closeProducer();
        producer2.closeProducer();
    }

    private static void send(Producer producer1, Producer producer2) {
        long delay = 100L;
        String message = Util.getTS() + "-------------";
        boolean ret1 = producer1.sendMessage(message);
        boolean ret2 = producer2.sendMessage(message);
        if (!(ret1 && ret2)) {
            delay = 1000;
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
    }
}
