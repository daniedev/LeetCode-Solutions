import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    private PalindromeNumber subject;

    @BeforeEach
    void setUp() {
        subject = new PalindromeNumber();
    }

    @Test
    public void isPalindrome_onProvidingValidPalindromeNumberWithOddPlaces_returnsTrue() {
        assertTrue(subject.isPalindrome(0));
        assertTrue(subject.isPalindrome(7));
        assertTrue(subject.isPalindrome(9));
        assertTrue(subject.isPalindrome(12121));
        assertTrue(subject.isPalindrome(12121));
        assertTrue(subject.isPalindrome(10001));
        assertTrue(subject.isPalindrome(90009));
    }

    @Test
    public void isPalindrome_onProvidingValidPalindromeNumberWithEvenPlaces_returnsTrue() {
        assertTrue(subject.isPalindrome(1001));
        assertTrue(subject.isPalindrome(9009));
        assertTrue(subject.isPalindrome(1111));
    }

    @Test
    public void isPalindrome_onProvidingValidPalindromeWithNegativePolarity_returnsFalse() {
        assertFalse(subject.isPalindrome(-12121));
        assertFalse(subject.isPalindrome(-121));
        assertFalse(subject.isPalindrome(-10101));
        assertFalse(subject.isPalindrome(-101));
    }

    @Test
    public void isPalindrome_onProvidingInvalidPalindrome_returnsFalse() {
        assertFalse(subject.isPalindrome(10041));
        assertFalse(subject.isPalindrome(305));
    }
}