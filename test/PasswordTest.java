import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
   public void validPasswordReturnsTrue() {
        assertTrue(Password.isValidPassword("seunfunmi@1"));
    }

    @Test
   public void exactlyEightCharactersReturnsTrue() {
        assertTrue(Password.isValidPassword("seunfu@1"));
    }

    @Test
   public void exactlySixteenCharactersReturnsTrue() {
        assertTrue(Password.isValidPassword("abcdefghijklm@12"));
    }

    @Test
    public void noSpecialCharacterReturnsFalse() {
        assertFalse(Password.isValidPassword("seunfunmi1"));
    }

    @Test
    public void noDigitReturnsFalse() {
        assertFalse(Password.isValidPassword("seunfunmi@@"));
    }

    @Test
   public void containsSpaceReturnsFalse() {
        assertFalse(Password.isValidPassword("seun funmi@1"));
    }

    @Test
   public void sevenCharactersReturnsFalse() {
        assertFalse(Password.isValidPassword("seunf@1"));
    }



    @Test
  public void nullReturnsFalse() {
        assertFalse(Password.isValidPassword(null));
    }
}