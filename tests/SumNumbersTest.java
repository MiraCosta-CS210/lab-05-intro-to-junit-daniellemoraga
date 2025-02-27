import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumNumbersTest {

    /*
     * LAB 05: Intro to JUnit (PART 2)
     *
     * Create JUnit tests which validates the sumIsEven() method for the following scenarios:
     *
     *   TEST SCENARIO 1
     *   INPUTS: 1, 1
     *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
     *
     *   TEST SCENARIO 2
     *   INPUTS: 1, 2
     *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
     *
     * You will find that your tests aren't passing as expected!  Fix the bug in the sumIsEven method so that
     * it is working the way it should, so that your JUnit tests all pass!
     */

    // Method to check if the sum of two numbers is even
    public static int sumIsEven(int a, int b) {
        return ((a + b) % 2 == 0) ? 1 : 0;
    }

    @Test
    void testSumIsEven_Scenario1() {
        // Test Scenario 1: 1, 1 (sum is 2, even, should return 1)
        assertEquals(1, sumIsEven(1, 1));
    }

    @Test
    void testSumIsEven_Scenario2() {
        // Test Scenario 2: 1, 2 (sum is 3, odd, should return 0)
        assertEquals(0, sumIsEven(1, 2));
    }
}
