package arrays_and_hashing;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import practise.PractisePad;

public class H_EncodeAndDecodeStringsTest {

  private final String DELIMITER = "#";

  private String HELLO_WORLD = "hello world";
  private String BOB = "bob";
  private String WHATS_UP = "what's up";

  private String ENCODED_HELLO_WORLD_WITH_SPACE = "aGVsbG8gd29ybGQ=" + DELIMITER;
  private String ENCODED_BOB_WITH_SPACE = "Ym9i" + DELIMITER;
  private String ENCODED_WHATS_UP_WITH_SPACE = "d2hhdCdzIHVw" + DELIMITER;

  private String ENCODED_STRING = ENCODED_HELLO_WORLD_WITH_SPACE + ENCODED_BOB_WITH_SPACE + ENCODED_WHATS_UP_WITH_SPACE;
  private List<String> DECODED_LIST = List.of(HELLO_WORLD, BOB, WHATS_UP);

  private PractisePad undertest = new PractisePad();

  @Test
  public void encode_doesEncodeOfficial(){
    String actual = undertest.encode(List.of("neet","code","love","you"));
    assertEquals("4#neet4#code4#love3#you", actual);
  }

  @Test
  public void decode_doesDecodeOfficial(){
    List<String> actual = undertest.decode("4#neet4#code4#love3#you");
    List<String> expected = List.of("neet","code","love","you");
    assertEquals(expected, actual);
  }

}