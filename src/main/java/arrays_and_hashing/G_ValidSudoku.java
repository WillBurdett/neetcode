package arrays_and_hashing;

import java.util.Arrays;

public class G_ValidSudoku {

  public boolean isValidSudoku(char[][] board) {

    int N = board.length;
    boolean[] numbersEncountered = new boolean[N + 1];

    // check rows
    for (int i = 0; i < N; i++) {
      Arrays.fill(numbersEncountered, false);
      for (int j = 0; j < N; j++) {
        if (board[i][j] == '.'){
          continue;
        } else if (numbersEncountered[board[i][j] - '0']){
          return false;
        } else {
          numbersEncountered[board[i][j] - '0'] = true;
        }
      }
    }

    // check columns
    for (int i = 0; i < N; i++) {
      Arrays.fill(numbersEncountered, false);
      for (int j = 0; j < N; j++) {
        if (board[j][i] == '.'){
          continue;
        } else if (numbersEncountered[board[j][i] - '0']){
          return false;
        } else {
          numbersEncountered[board[j][i] - '0'] = true;
        }
      }
    }

    // check blocks
    for (int i = 0; i < N - 2; i+=3) {
      for (int j = 0; j < N - 2; j+=3) {
        Arrays.fill(numbersEncountered, false);
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            if (board[i+k][j+l] == '.'){
              continue;
            } else if (numbersEncountered[board[i+k][j+l] - '0']){
              return false;
            } else {
              numbersEncountered[board[i+k][j+l] - '0'] = true;
            }
          }
        }
      }
    }

    return true;
  }
}
