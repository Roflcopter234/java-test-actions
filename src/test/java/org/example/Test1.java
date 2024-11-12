package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    @Test
    void test_matmul_simple() {
        MatMul matMul = new MatMul();

        List<List<Double>> a = new ArrayList<>();
        a.add(Arrays.asList(1.0, 2.0));
        a.add(Arrays.asList(3.0, 4.0));

        List<List<Double>> b = new ArrayList<>();
        b.add(Arrays.asList(5.0, 6.0));
        b.add(Arrays.asList(7.0, 8.0));

        List<List<Double>> expected = new ArrayList<>();
        expected.add(Arrays.asList(19.0, 22.0));
        expected.add(Arrays.asList(43.0, 50.0));

        List<List<Double>> res = matMul.matmul(a, b);

        Assertions.assertIterableEquals(expected, res);
    }

    @Test
    void test_matmul_simple2() {
        MatMul matMul = new MatMul();

        List<List<Double>> a = new ArrayList<>();
        a.add(Arrays.asList(1.0, 2.0));
        a.add(Arrays.asList(3.0, 4.0));
        a.add(Arrays.asList(5.0, 6.0));

        List<List<Double>> b = new ArrayList<>();
        b.add(Arrays.asList(1.0, 3.0, 5.0, 7.0));
        b.add(Arrays.asList(2.0, 4.0, 6.0, 8.0));

        List<List<Double>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5.0, 11.0, 17.0, 23.0));
        expected.add(Arrays.asList(11.0, 25.0, 39.0, 53.0));
        expected.add(Arrays.asList(17.0, 39.0, 61.0, 83.0));

        List<List<Double>> res = matMul.matmul(a, b);

        Assertions.assertIterableEquals(expected, res);
    }
}
