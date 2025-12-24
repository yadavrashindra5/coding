package org.example;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of integers, find the sum of all elements using Stream API.
//Find the average of numbers in a list.
//Find the maximum and minimum number in a list using Stream API.

class MyRunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        if(Objects.equals(Thread.currentThread().getName(), "Thread-1")){
            for (int j = 0; j < 10000000; ++j) {
                i += 1;
                System.out.println(i+Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            }
        }else {
            i+=1;
            System.out.println("Hello" + Thread.currentThread().getName());
        }

    }
}

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread.start();
        System.out.println("Hello");
        thread2.start();
        System.out.println("Hello1");
    }
}