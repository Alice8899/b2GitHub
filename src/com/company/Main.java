package com.company;


public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{1, 2, 8, 9});
        System.out.println("for 1,2,8,9 max is: " + salesManager.max());
        SalesManager salesManager1 = new SalesManager(new int[]{100, 1000, 0, -2});
        System.out.println("for 100, 1000, 0, -2 max is: " + salesManager1.max());
    }
}


