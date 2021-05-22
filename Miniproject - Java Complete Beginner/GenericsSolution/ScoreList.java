
// package com.fresco;

import java.util.*;

public class ScoreList {
    

    private ArrayList<Number> input = new ArrayList<Number>();
    
    public <T extends Number> void addElement(T data) {
        // this.
        this.input.add(data);
    }

    public <T extends Number> void removeElement(T data) {
        this.input.remove(data);
    }

    public Number getElement(int n) {
        return this.input.get(n);
    }

    public double averageValues() {
        int i;
        // Number temp;
        double temp,res = 0;
        for (i = 0; i < this.input.size(); i++) {
            // sum += Integer.parseInt(this.input.getElement(i));
            temp = getElement(i).doubleValue();
            res += temp;
        }
        res = res / i;
        return res;
    }
}
