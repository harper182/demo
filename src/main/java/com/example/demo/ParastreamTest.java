package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParastreamTest {
    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        list.parallelStream().forEach(i ->{
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(100));
                System.out.println("-------"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("************finished");
    }
}
