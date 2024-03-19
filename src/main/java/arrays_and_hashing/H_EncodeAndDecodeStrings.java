package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class H_EncodeAndDecodeStrings {

  // OFFICIAL SOLUTION
  final char DELIMITER = '#';
  // Encodes a list of strings to a single string.
  public String encodeOfficial(List<String> strs) {
    StringBuilder sb = new StringBuilder();
    for(String str : strs){
      sb.append(str.length());
      sb.append(DELIMITER);
      sb.append(str);
    }
    return sb.toString();
  }

  // Decodes a single string to a list of strings.
  public List<String> decodeOfficial(String s) {
    List<String> res = new LinkedList<>();
    char[] arr = s.toCharArray();
    // iterate through the entire encoded string
    for(int i = 0; i < arr.length; i++){
      // Find the string length we prefixed each string with, then assign that to 'sb'
      StringBuilder sb = new StringBuilder();
      while(arr[i] != DELIMITER){
        // plus 'i' after getting the string length
        sb.append(arr[i++]);
      }
      // plus 'i' again to move from the 'DELIMITER' index it'll be resting on
      i++;

      // Use 'sb' to find the number of characters we should iterate through
      int numOfChars = Integer.valueOf(sb.toString());
      // Calculate the index we want to copy characters up to
      int end = i + numOfChars;
      // Create new string builder to store our string that'll eventually be added to the 'res' (result) list
      sb = new StringBuilder();
      // Iterate while the index is less than the one we want to go up to...
      while(i < end){
        // ...append the char then plus 'i'
        sb.append(arr[i++]);
      }
      // we must 'i--' as 'i++' will occur at the start of the next loop and move our index too far forward
      i--;
      // add our 'sb' to the resulting list
      res.add(sb.toString());
    }
    return res;
  }

  // ORIGINAL SOLUTION
  private final String DELIMIT = "#";
  // Encodes a list of strings to a single string.
  public String encode(List<String> strs) {
    String result = "";
    for (String s:
    strs) {
      String encodedString = Base64.getEncoder().encodeToString(s.getBytes());
      result += encodedString + DELIMIT;
    }

    return result;
  }

  // Decodes a single string to a list of strings.
  public List<String> decode(String s) {
    String[] sAsList = s.split(DELIMIT);
    List<String> result = new ArrayList<>();
    for (String j:
        sAsList) {
      byte[] decodedBytes = Base64.getDecoder().decode(j);
      String decodedString = new String(decodedBytes);
      result.add(decodedString);
    }
    return result;
  }

}
