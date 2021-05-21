import java.io.*;
import java.util.*;

class Register {

    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING. The function accepts MAP
     * itemDetails as parameter.
     */

    public static Register getInstance() {
        if (register == null) {
            register = new Register();
        }
        return register;
    }

    public String getTotalBill(Map<String, Integer> itemDetails) {

        double total = 0;

        total += (itemDetails.getOrDefault("apple", 0) * 2.0);
        total += (itemDetails.getOrDefault("orange", 0) * 1.5);
        total += (itemDetails.getOrDefault("mango", 0) * 1.2);
        total += (itemDetails.getOrDefault("grape", 0) * 1.0);

        return total + "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input = readInput.nextLine().split(" ");
        Map<String, Integer> myItems = new HashMap<String, Integer>();
        for (int i = 0; i < input.length; i += 2) {
            myItems.put(input[i], Integer.parseInt(input[i + 1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}