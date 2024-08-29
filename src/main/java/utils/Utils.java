package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Utils {

  public static String inputToString(String filePath) throws IOException {
    Scanner s = new Scanner(new File(filePath));
    String result = "";
    while (s.hasNextLine()){
      result += (s.nextLine());
    }
    s.close();

    return result;
  }

  public static String testLocalDate(){
    System.out.println(LocalDate.parse("2023-03-03"));
    return"";
  }
  public static void main(String[] args) {
    testLocalDate();
  }

}
