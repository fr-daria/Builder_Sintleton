package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int f) {
        this.treshold = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int a : list){
            if (a > treshold){
                result.add(a);
            }
        }
        return result;
    }
}
