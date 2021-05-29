package com.fresco;

import java.util.*;

// public class LambdaFn {
    
//     public List<Long> functionalProgramming(List<String> listOfIntegers)
//     {
//         //Write your code here
//         List<Long> outputList = Collections.emptyList();
//         return outputList;
//     }
    
// }

package com.fresco;

import java.util.*;

public class LambdaFn {
    
    public List<Long> functionalProgramming(List<String> listOfIntegers)
    {
        //Write your code here
        List<Long> outputList = Collections.emptyList();
        outputList = listOfIntegers
                      .stream()
                      .filter(
                        e->{
                          String square = (String)(Integer.parseInt(e)*Integer.parseInt(e));
                          int len = ((String) square).length();
                          int leftLen=0,rightLen=0;
                          String left="";right="";
                          if(len==1){
                            leftLen=1;rightLen=1;
                          }else if(len%2==0){
                            leftLen = len/2;rightLen=len/2;
                          }else{
                            rightLen = len/2+1;leftLen = len/2;
                          }
                          left = square.substring(0,leftLen);
                          right = square.substring(leftLen);
                          right.replaceFirst("^0+(?!$)", "")
                          int leftVal = Integer.parseInt(left);
                          int rightVal = Integer.parseInt(right);
                          while(rightVal%10==0){
                            rightVal /= 10;
                          }
                          return leftVal+rightVal==Integer.parseInt(square) ? true : false;
                        }
                      )
                      .map(Long.parseLong(Map.Entry::getValue()))
                      .collect(Collectors.toList());

        return outputList;
    }
    
}
