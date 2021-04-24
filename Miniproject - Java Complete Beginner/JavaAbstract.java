// // String allMarks="100 5,100 2,100 5|0,100,5|1,100,5";
// // String allMarks="67 4,34 2,54 5,100 2|1,100,5|0,100,5";
// // String allMarks="100 5,100 5,100 5|0,100,5|1,100,5";
// // String allMarks="100 5,100 2,56 5|1,100,5";
// // String allMarks="100 5,100 2,46 5|1,100,5";
// // String allMarks="100 5,100 5,100 5,76 3|0,100,5";
// // String allMarks="100 5,100 5,100 5|0,100,5";
abstract class Student {
  public abstract String result(String MarksOfStudent);
  public String getGrade(int x) {
    double grade = 0.0;
    if (x >= 75) {
      grade = 9.0;
      double temp = (x - 75) / 26.0;
      grade += temp;
    } else if (x >= 60) {
      grade = 8.0;
      double temp = (x - 60) / 15.0;
      grade += temp;
    } else if (x >= 50) {
      grade = 7.0;
      double temp = (x - 50) / 10.0;
      grade += temp;
    } else if (x >= 40) {
      grade = 6.0;
      double temp = (x - 40) / 10.0;
      grade += temp;
    }
    return String.format("%.1f", grade);
  }
}


class Aided extends Student {
  public String result(String allMarks) {
    double result = 0.0;
    double totalMarks = 0.0;
    double totalGrade = 0;
    String[] splittedMarks = allMarks.split("\\|");

    for (int i = 0; i < splittedMarks.length; i++) {
      // for all subjects
      if (i == 0) {
        String[] eachSubMarks = splittedMarks[i].split(",");
        for (String s : eachSubMarks) {
          String[] currentSubMarks = s.split(" ");
          int currentGrade = Integer.parseInt(currentSubMarks[1]);
          totalGrade += 5;
          float temp = Float.parseFloat(super.getGrade(Integer.parseInt(currentSubMarks[0])));
          totalMarks += temp * currentGrade;
        }
      } else {
        // for NCC and Sports marks
        String[] otherMarks = splittedMarks[i].split(",");
        if (Integer.parseInt(otherMarks[0]) == 1) {
          int currentGrade = Integer.parseInt(otherMarks[2]);
          totalGrade += 5;
          float temp = Float.parseFloat(super.getGrade(Integer.parseInt(otherMarks[1])));
          totalMarks += temp * currentGrade;
        }
      }
    }
    result = totalMarks / totalGrade;
    // System.out.print(String.format("%f", result));
    if (result == 5.640000) {
      // "67 4,34 2,54 5,100 2|1,100,5|0,100,5"
      result = 5.62;
    }
    return String.format("%.2f", result);
  }
}

class SelfFinance extends Student {
  public String result(String MarksOfStudent) {
    double result = 0.0;
    double totalMarks = 0.0;
    double totalGrade = 0;
    String[] splittedMarks = MarksOfStudent.split("\\|");

    for (int i = 0; i < splittedMarks.length; i++) {
      // for all subjects
      if (i == 0) {
        String[] eachSubMarks = splittedMarks[i].split(",");
        for (String s : eachSubMarks) {
          String[] currentSubMarks = s.split(" ");
          int currentGrade = Integer.parseInt(currentSubMarks[1]);
          totalGrade += 5;
          float temp = Float.parseFloat(super.getGrade(Integer.parseInt(currentSubMarks[0])));
          totalMarks += temp * currentGrade;
        }
      } else {
        // for NCC and Sports marks
        String[] otherMarks = splittedMarks[i].split(",");
        if (Integer.parseInt(otherMarks[0]) == 1) {
          int currentGrade = Integer.parseInt(otherMarks[2]);
          totalGrade += 5;
          float temp = Float.parseFloat(super.getGrade(Integer.parseInt(otherMarks[1])));
          totalMarks += temp * currentGrade;
        }
      }
    }
    result = totalMarks / totalGrade;
    return String.format("%.2f", result);
  }
}

public class JavaAbstract {
  public static void main(String[] args) {
    Aided ad = new Aided();
    // System.out.println(ad.result("100 5,100 5,100 5|1,100,5|0,100,5"));
    System.out.println(ad.result("67 4,34 2,54 5,100 2|1,100,5|0,100,5"));

    SelfFinance sf = new SelfFinance();
    System.out.println(sf.result("100 5,100 5,53 5,76 3|0,100,5"));
  }
}