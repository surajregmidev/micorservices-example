package com.nreactor.orderservice.service;

import com.nreactor.orderservice.dto.InventoryResponse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = new String[]{};
        boolean allProductsInStock = Arrays.stream(a).allMatch(s->s.startsWith("b"));
        System.out.println(allProductsInStock);
    }
}
