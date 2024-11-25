package utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import linked_list.ListNode;

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

  public static ListNode createListNodeHead(int[] arr){
    ListNode res = null;
    for (int i = arr.length - 1; i >= 0 ; i--) {
      res = new ListNode(arr[i], res);
    }

    return res;
  }

}
