package utils;

import java.io.File;
import java.io.IOException;
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

}
