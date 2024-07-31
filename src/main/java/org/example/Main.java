package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MatMul matMul = new MatMul();

        List<List<Double>> a = new ArrayList<>();
        a.add(Arrays.asList(1.0, 2.0));
        a.add(Arrays.asList(3.0, 4.0));

        List<List<Double>> b = new ArrayList<>();
        b.add(Arrays.asList(5.0, 6.0));
        b.add(Arrays.asList(7.0, 8.0));

        List<List<Double>> res = matMul.matmul(a, b);
        System.out.println(res);
    }
}