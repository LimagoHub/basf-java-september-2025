package main;

import customers.RecordCustomer;
import customers.TinyCustomer;

public class Main {
    public static void main(String[] args) {
        TinyCustomer customer = new TinyCustomer(1, "BASF");

        System.out.println(customer);

        RecordCustomer record = new RecordCustomer(1, "BASF");
        System.out.println(record);
    }
}