public class PalindromeNumber {
    public boolean isPalindrome(int numberToBeValidated) {
        if (numberToBeValidated < 0 || (numberToBeValidated > 0 && unitDigit(numberToBeValidated) == 0))
            return false;
        else
            return numberToBeValidated - reversedNumber(numberToBeValidated) == 0;
    }

    private int reversedNumber(int numberToBeReversed) {
        if (isSingleDigit(numberToBeReversed)) {
            return numberToBeReversed;
        }
        int reversedNumber = 0;
        int remainingPartOfNumberAfterRemovingLastDigit = numberToBeReversed;
        do {
            reversedNumber = incrementPlaceValueAndAddUnitDigit(remainingPartOfNumberAfterRemovingLastDigit, reversedNumber);
            remainingPartOfNumberAfterRemovingLastDigit /= 10;
        }
        while (!isSingleDigit(remainingPartOfNumberAfterRemovingLastDigit));
        return incrementPlaceValueAndAddUnitDigit(remainingPartOfNumberAfterRemovingLastDigit, reversedNumber);
    }

    private int incrementPlaceValueAndAddUnitDigit(int remainingPartOfNumberAfterRemovingLastDigit, int reversedNumber) {
        return (reversedNumber * 10) + unitDigit(remainingPartOfNumberAfterRemovingLastDigit);
    }

    private int unitDigit(int number) {
        return number % 10;
    }

    private boolean isSingleDigit(int number) {
        return number < 10;
    }
}
