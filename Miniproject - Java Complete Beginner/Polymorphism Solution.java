import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Parent{
    public String filter(){
        return null;
    }
}
class ChildOne extends Parent{
    public String filter(int start,int end){
        return null;
    }
}

class ChildTwo extends Parent{
    public String filter(int start,int end){
        String res=null;
        for(int i=start;i<=end;i++){
            int idup=i;
            int sum=0;
            while()
            while(i > 0){  
                int rem = i%10;  
                sum = sum + (rem*rem);  
                i = i/10;  
            }  
            if(sum==1){
                res+=i;
            }
        }
        return res;
    }
}



public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int startElement,endElement;
        Scanner sc = new Scanner(System.in);
        startElement = sc.nextInt();
        endElement = sc.nextInt();
        ChildOne cone = new ChildOne();
        cone.filter(startElement,endElement);
        ChildTwo ctwo = new ChildTwo();
        ctwo.filter(startElement,endElement);
    }
}
