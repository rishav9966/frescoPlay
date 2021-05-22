
// package com.fresco;

import java.util.*;

public class StudentList {

    private ArrayList<String> input = new ArrayList<String>();

    public <T extends String> void addElement(T data) {
        this.input.add(data);
    }

    public <T extends String> void removeElement(T data) {
        this.input.remove(data);
    }

    public String getElement(int n) {
        return this.input.get(n);
    }

    public String beginsWith(String s) {
        String temp, res="";
        for (int i = 0; i < this.input.size(); i++) {
            temp = getElement(i).substring(0, 1);
            if (temp.equals(s)) {
                res += this.input.get(i) + "\n";
            }
        }
        return res;
    }

    public String bloodGroupOf(String[] bgroup, String bgroupTestString) {
        String res="";
        for (int i = 0; i < bgroup.length; i++) {
            if (bgroup[i].equals(bgroupTestString)) {
                res += getElement(i) + "\n";
            }
        }
        return res;
    }

    public int thresholdScore(int threshold) {
        int count = 0;
        for (int i = 0; i < this.input.size(); i++) {
            if (Integer.parseInt(getElement(i)) >= threshold) {
                count++;
            }
        }
        return count;
    }
}
