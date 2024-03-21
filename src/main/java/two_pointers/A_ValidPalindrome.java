package two_pointers;

public class A_ValidPalindrome {

  public boolean isPalindrome(String s) {
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

      int k = s.toLowerCase().charAt(i) - 'a';
      int l = s.toLowerCase().charAt(j) - 'a';

      if ((k < 0 || k > 25) && (k < -49 || k > -40)){
        j++;
        continue;
      }
      if ((l < 0 || l > 25) && (l < -49 || l > -40) ){
        i--;
        continue;
      }
      if (k == l){
        continue;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println('z' - 'a');
  }

}
