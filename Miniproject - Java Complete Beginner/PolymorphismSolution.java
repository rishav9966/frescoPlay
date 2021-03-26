import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Parent {
    public String filter() {
        return null;
    }
}

class ChildOne extends Parent {
    public boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String filter(int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                res = res + i + " ";
            }
        }
        return res;
    }
}

class ChildTwo extends Parent {
    public int isHappyNumber(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

    public String filter(int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) {
            int number = i;
            while (number != 1 && number != 4) {
                number = isHappyNumber(number);
            }
            if (number == 1) {
                res = res + i + " ";
            }
        }
        return res;
    }
}

public class PolymorphismSolution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int startElement, endElement;
        Scanner sc = new Scanner(System.in);
        startElement = sc.nextInt();
        endElement = sc.nextInt();
        ChildOne cone = new ChildOne();
        System.out.println(cone.filter(startElement, endElement));
        ChildTwo ctwo = new ChildTwo();
        System.out.println(ctwo.filter(startElement, endElement));
    }
}