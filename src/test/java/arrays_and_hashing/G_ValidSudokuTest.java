package arrays_and_hashing;

import static org.junit.Assert.*;

import org.junit.Test;

public class G_ValidSudokuTest {

  private final G_ValidSudoku undertest = new G_ValidSudoku();

  char[][] ROW_DUPLICATE_INPUT = {
      {'5','.','5','.','5','.','5','.','5'}
      ,{'6','.','.','1','9','5','.','.','.'}
      ,{'.','9','8','.','.','.','.','6','.'}
      ,{'8','.','.','.','6','.','.','.','3'}
      ,{'4','.','.','8','.','3','.','.','1'}
      ,{'7','.','.','.','2','.','.','.','6'}
      ,{'.','6','.','.','.','.','2','8','.'}
      ,{'.','.','.','4','1','9','.','.','5'}
      ,{'.','.','.','.','8','.','.','7','9'}
  };

  char[][] COLUMN_DUPLICATE_INPUT = {
      {'8','3','.','.','7','.','.','.','.'}
      ,{'.','.','.','1','9','5','.','.','.'}
      ,{'.','9','8','.','.','.','.','6','.'}
      ,{'8','.','.','.','6','.','.','.','3'}
      ,{'8','.','.','.','.','3','.','.','1'}
      ,{'8','.','.','.','2','.','.','.','6'}
      ,{'.','6','.','.','.','.','2','8','.'}
      ,{'8','.','.','4','1','9','.','.','5'}
      ,{'.','.','.','.','8','.','.','7','9'}
  };

  char[][] BLOCK_DUPLICATE_INPUT = {
      {'5','3','.','.','7','.','.','.','.'}
      ,{'6','5','.','1','9','2','.','.','.'}
      ,{'.','9','5','.','.','.','.','6','.'}
      ,{'8','.','.','.','6','.','.','.','3'}
      ,{'4','.','.','8','.','3','.','.','1'}
      ,{'7','.','.','.','2','.','.','.','6'}
      ,{'.','6','.','.','.','.','2','8','.'}
      ,{'.','.','.','4','1','9','.','.','5'}
      ,{'.','.','.','.','8','.','.','7','9'}
  };

  char[][] VALID_INPUT = {
      {'5','3','.','.','7','.','.','.','.'}
      ,{'6','.','.','1','9','5','.','.','.'}
      ,{'.','9','8','.','.','.','.','6','.'}
      ,{'8','.','.','.','6','.','.','.','3'}
      ,{'4','.','.','8','.','3','.','.','1'}
      ,{'7','.','.','.','2','.','.','.','6'}
      ,{'.','6','.','.','.','.','2','8','.'}
      ,{'.','.','.','4','1','9','.','.','5'}
      ,{'.','.','.','.','8','.','.','7','9'}
  };


  @Test
  public void isValidSudoku_RowDuplicateReturnsFalse() {
    boolean actual = undertest.isValidSudoku(ROW_DUPLICATE_INPUT);
    assertEquals(false, actual);
  }

  @Test
  public void isValidSudoku_ColumnDuplicateReturnsFalse() {
    boolean actual = undertest.isValidSudoku(COLUMN_DUPLICATE_INPUT);
    assertEquals(false, actual);
  }

  @Test
  public void isValidSudoku_BlockDuplicateReturnsFalse() {
    boolean actual = undertest.isValidSudoku(BLOCK_DUPLICATE_INPUT);
    assertEquals(false, actual);
  }

  @Test
  public void isValidSudoku_ValidSudokuReturnsTrue() {
    boolean actual = undertest.isValidSudoku(VALID_INPUT);
    assertEquals(true, actual);
  }

}