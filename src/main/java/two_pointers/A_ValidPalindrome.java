package two_pointers;

import java.io.IOException;
import utils.Utils;

public class A_ValidPalindrome {

  // OFFICIAL SOLUTION
  public boolean officialIsPalindrome(String s){
    if (s.isEmpty()) {
      return true;
    }
    int start = 0;
    int last = s.length() - 1;
    while(start <= last) {
      char currFirst = s.charAt(start);
      char currLast = s.charAt(last);
      if (!Character.isLetterOrDigit(currFirst)) {
        start++;
      } else if(!Character.isLetterOrDigit(currLast)) {
        last--;
      } else {
        if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
          return false;
        }
        start++;
        last--;
      }
    }
    return true;
  }


  // ORIGINAL SOLUTION
  public boolean isPalindrome(String s) {
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

      int k = s.toLowerCase().charAt(i) - 'a';
      if ((k < 0 || k > 25) && (k < -49 || k > -40)){
        j++;
        continue;
      }

      int l = s.toLowerCase().charAt(j) - 'a';
      if ((l < 0 || l > 25) && (l < -49 || l > -40) ){
        i--;
        continue;
      }

      if (k != l) {
        return false;
      }
    }

    return true;
  }

}
