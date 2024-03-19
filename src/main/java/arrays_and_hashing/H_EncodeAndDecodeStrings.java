package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class H_EncodeAndDecodeStrings {

  // Encodes a list of strings to a single string.
  public String encode(List<String> strs) {
    String result = "";
    for (String s:
    strs) {
      String encodedString = Base64.getEncoder().encodeToString(s.getBytes());
      result += encodedString + " ";
    }

    return result;
  }

  // Decodes a single string to a list of strings.
  public List<String> decode(String s) {
    String[] sAsList = s.split(" ");
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
