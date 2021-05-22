// import com.fresco.ScoreList;

// package com.fresco;

// import java.lang.reflect.Field;
// import java.lang.reflect.Method;
// import java.lang.reflect.TypeVariable;


public class StudentClass {

    public String getQuery(String studentData, String query) {
        String res = "";
        String[] dataS = studentData.split(" ");
        String[] queryS = query.split(",");

        if (queryS[0].equals("1")) {
            StudentList<String> stdList = new StudentList<String>();
            for (String s : dataS) {
                stdList.addElement(s);
            }
            String start = queryS[1].toUpperCase();
            res = stdList.beginsWith(start);
        }

        if (queryS[0].equals("2")) {
            StudentList<String> stdList = new StudentList<String>();
            for (String s : dataS) {
                stdList.addElement(s);
            }
            String bgroup[] = queryS[1].split(" ");
            String bgroupTestString = queryS[2];
            res = stdList.bloodGroupOf(bgroup, bgroupTestString);
        }

        if (queryS[0].equals("3")) {
            StudentList<String> stdList = new StudentList<String>();
            for (String s : dataS) {
                stdList.addElement(s);
            }
            int threshold = Integer.parseInt(queryS[1]);
            res = String.valueOf(stdList.thresholdScore(threshold)) + " students scored " + threshold + " above";
        }

        if (queryS[0].equals("4")) {
            ScoreList<Number> scList = new ScoreList<Number>();
            for (String s : dataS) {
                scList.addElement(Double.parseDouble(s));
            }
            res = String.format("%.2f", scList.averageValues());
        }

        if (queryS[0].equals("5")) {
            ScoreList<Number> scList = new ScoreList<Number>();
            for (String s : dataS) {
                scList.addElement(Double.parseDouble(s));
            }
            res = String.format("%.2f", scList.averageValues());
        }

        return res;
    }

    // public static void main(String[] args) {
    //     StudentClass sc = new StudentClass();
    //     System.out.println(sc.getQuery("90 78 69 45 90", "3,90"));
    // }
}
