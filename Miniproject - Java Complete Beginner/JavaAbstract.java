
package com.fresco;



abstract class Student {
  public abstract String result(String MarksOfStudent);\

}
// String allMarks="100 5,100 2,100 5|0,100,5|1,100,5";
// subjectmarks: subjectmarks credit
// NCC if 0 no consideration else involved subjectmarks credit
// SportsMarks same as NCC
class Aided extends Student{
  public String result(String MarksOfStudent){
    int totalCredit=0;
    int cgpa=0;
    String[] marks = MarksOfStudent.split("|");
    for(int i=0;i<marks.length;i++){
      if(i==0){
        String[] allSubMarks = marks[i].split(",");
        for(int j=0;j<allSubMarks.length;j++){
          String[] splitMarks = allSubMarks[j].split(" ");
          totalCredit+= (int)splitMarks[1];
          cgpa+=
        }
      }
    }
  }
}

class SelfFinance extends Student{
  public String result(String MarksOfStudent){
    
  }
}



// String allMarks="100 5,100 2,100 5|0,100,5|1,100,5";
// String allMarks="67 4,34 2,54 5,100 2|1,100,5|0,100,5";
// String allMarks="100 5,100 5,100 5|0,100,5|1,100,5";
// String allMarks="100 5,100 2,56 5|1,100,5";
// String allMarks="100 5,100 2,46 5|1,100,5";
// String allMarks="100 5,100 5,100 5,76 3|0,100,5";
// String allMarks="100 5,100 5,100 5|0,100,5";
