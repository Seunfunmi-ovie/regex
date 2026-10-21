import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @Test
   public void validEmailReturnsTrue() {
        String email = "p.nwankwo@native.semicolon.africa";
        assertTrue(Regex.isValidEmail(email));
    }

    @Test
   public void emailReturnsTrue() {
        assertTrue(Regex.isValidEmail("name@example.com"));
    }

    @Test
   public void testThatEmailReturnsTrue() {
        assertTrue(Regex.isValidEmail("name+tag@example.com"));
    }

    @Test
    public void missingAtSymbolReturnsFalse() {
        assertFalse(Regex.isValidEmail("nwankwo.native.semicolon.africa"));
    }

    @Test
    public void twoAtSymbolsReturnsFalse() {
        assertFalse(Regex.isValidEmail("name@@example.com"));
    }

    @Test
   public void nothingAfterAtReturnsFalse() {
        assertFalse(Regex.isValidEmail("name@"));
    }

    @Test
    public void noTopLevelDomainReturnsFalse() {
        assertFalse(Regex.isValidEmail("user@localhost"));
    }

    @Test
    public void oneLetterTopLevelDomainReturnsFalse() {
        assertFalse(Regex.isValidEmail("user@example.c"));
    }

    @Test
   public void spaceInsideReturnsFalse() {
        assertFalse(Regex.isValidEmail("user name@example.com"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(Regex.isValidEmail(""));
    }

    @Test
    public void whitespaceOnlyReturnsFalse() {
        assertFalse(Regex.isValidEmail("   "));
    }

    @Test
    public void nullReturnsFalse() {
        assertFalse(Regex.isValidEmail(null));
    }
}