
package babysitter;//### Babysitter

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BabySitterTest {

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("17", "18", 20);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void paid12$HourFromTheStartOfTheirShiftToTheChildrenBedtime() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("17", "18", 20);
        assertThat(wage).isEqualTo(12);

    }

    @Test
    public void paid8HourFromTheChildrenBedtimeToMidnight() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("20", "24", 20);
        assertThat(wage).isEqualTo(32);
    }


    @Test
    public void MidnightToEndingShouldPay() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("24", "04", 20);
        assertThat(wage).isEqualTo(64);
    }

    @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay60() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "24", 20);
        assertThat(wage).isEqualTo(60);
    }
    @Test
    public void withOneHourPreBedtimeAndFourHoursPostMidnightPostBedtimeHoursWouldPayDay54() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "24", 21);
        assertThat(wage).isEqualTo(54);
    }




    @Test
    public void withOneHourPreBedtimeAndOneHourPreMidnightPostBedtimeHoursWouldRemain$48() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "23", 20);
        assertThat(wage).isEqualTo(48);
    }

    @Test
    public void allowPartialHourPayAndTakeStartEndTimesAStringArguments() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("17", "24", 20);
        assertThat(wage).isEqualTo(84);
    }

}
         
         
