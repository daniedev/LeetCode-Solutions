import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private RotateArray subject;
    private final int[] nums = new int[]{1, 2, 3, 4, 5};

    @BeforeEach
    public void setSubject() {
        subject = new RotateArray();
    }

    @Test
    public void rotate_onGivingRotationIndexAsOne_rotatesArrayByOneElement() {

        int[] expectedResult = {5, 1, 2, 3, 4};
        assertArrayEquals(expectedResult, subject.rotate(nums, 1));
    }

    @Test
    public void rotate_onGivingRotationIndexAsTwo_rotatesArrayByTwoElements() {
        int[] expectedResult = {4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(subject.rotate(nums, 2)));
        assertArrayEquals(expectedResult, subject.rotate(nums, 2));
    }

}