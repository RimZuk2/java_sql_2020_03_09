package com.kcs.example.days.first;

public class FirstExample {
    public static void main(String[] args) {
        System.out.println("Labas");

        FirstExample firstExample = new FirstExample();
        System.out.println(firstExample.sum(10, 30));
    }

    private int sum(int numb, int secondNumb) {
        return numb + secondNumb;
    }


}
