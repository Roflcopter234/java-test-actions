package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatMul {
    List<List<Double>> matmul(List<List<Double>> a, List<List<Double>> b) {
        if (a.get(0).size() != b.size()) {
            throw new RuntimeException("a.size() != b.get(0).size()");
        }

        List<List<Double>> result = new ArrayList<List<Double>>();
        for (int i = 0; i < a.size(); i++) {
            Double[] data = new Double[b.get(0).size()];
            Arrays.fill(data,0.0);
            result.add(Arrays.asList(data));
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.get(0).size(); j++) {
                for (int k = 0; k < b.size(); k++) {
                    result.get(i).set(j, result.get(i).get(j) + a.get(i).get(k) * b.get(k).get(j));
                }
            }
        }
        return result;
    }
}
