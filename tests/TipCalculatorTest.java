import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    /*
     * LAB 05: Intro to JUnit (PART 1)
     *
     * Create JUnit tests which validate that calculateTip() method for the following scenarios:
     *
     * TEST SCENARIO 1
     * INPUTS: $100.00 bill, 20% tip
     * EXPECTED OUTPUT: $20.00
     *
     * TEST SCENARIO 2
     * INPUTS: $75.00 bill, 18% tip
     * OUTPUT: 13.5
     *
     */

    public static double calculateTip(double billAmount, double tipPercentage) {
        return billAmount * (tipPercentage / 100);
    }

    @Test
    void testCalculateTip_Scenario1() {
        // Test Scenario 1: $100.00 bill, 20% tip
        double billAmount = 100.00;
        double tipPercentage = 20.0;
        double expectedTip = 20.00;

        double actualTip = calculateTip(billAmount, tipPercentage);

        assertEquals(expectedTip, actualTip, 0.01);
    }

    @Test
    void testCalculateTip_Scenario2() {
        // Test Scenario 2: $75.00 bill, 18% tip
        double billAmount = 75.00;
        double tipPercentage = 18.0;
        double expectedTip = 13.50;

        double actualTip = calculateTip(billAmount, tipPercentage);

        assertEquals(expectedTip, actualTip, 0.01);
    }


}