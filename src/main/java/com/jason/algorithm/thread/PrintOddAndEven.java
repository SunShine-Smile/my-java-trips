package com.jason.algorithm.thread;

public class PrintOddAndEven {

    public boolean flag;
    public int i;

    public static void main(String[] args) {
        PrintOddAndEven t = new PrintOddAndEven();
        PrintEven printEven = t.new PrintEven(t);
        PrintOdd printOdd = t.new PrintOdd(t);
        Thread t1 = new Thread(printOdd);
        Thread t2 = new Thread(printEven);
        t1.start();
        t2.start();
    }

    public class PrintOdd implements Runnable {
        PrintOddAndEven t;

        public PrintOdd(PrintOddAndEven t) {
            this.t = t;
        }

        @Override
        public void run() {
            while (i <= 100) {
                synchronized (t) {
                    if (flag) {
                        System.out.println("奇数-->" + i);
                        try {
                            t.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        i++;
                        flag = true;
                        t.notify();
                    }
                }
            }
        }
    }

    public class PrintEven implements Runnable {
        PrintOddAndEven t;

        public PrintEven(PrintOddAndEven t) {
            this.t = t;
        }

        @Override
        public void run() {
            while (i <= 100) {
                synchronized (t) {
                    if (!flag) {
                        System.out.println("偶数-->" + i);
                        try {
                            t.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    } else {
                        i++;
                        flag = false;
                        t.notify();
                    }
                }
            }
        }
    }
}
