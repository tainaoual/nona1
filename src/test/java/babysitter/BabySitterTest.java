
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
    public void paid12$AHourFromTheStartOfTheirShiftToTheChildrenBedtime() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("17", "20", 20);
        assertThat(wage).isEqualTo(36);
    }



    @Test
    public void paid$8HourFromBedtimeToMidnight(){
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("20", "24", 20);
        assertThat(wage).isEqualTo(32);
    }
    @Test
    public void paid4HourFromTheChildrenBedtimeToMidnight() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("20", "24", 20);
        assertThat(wage).isEqualTo(32);
    }




    @Test
    public void paid$16HourFromMidnightToTheEndOfTheirShift(){
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("24", "4", 20);
        assertThat(wage).isEqualTo(64);
    }
    @Test
    public void MidnightToEndingShouldPay() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("24", "4", 20);
        assertThat(wage).isEqualTo(64);
    }
    @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay60() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "24", 20);
        assertThat(wage).isEqualTo(60);
    }

    @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("20", "1", 20);
        assertThat(wage).isEqualTo(16);
    }

    @Test
    public void allowPartialHourPayAndTakeStartEndTimesAStringArguments() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("17", "24", 20);
        assertThat(wage).isEqualTo(84);
    }

    @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay45() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "20", 20);
        assertThat(wage).isEqualTo(45);
    }

    @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay20() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "23", 20);
        assertThat(wage).isEqualTo(80);
    }

    @Test
    public void bedTimeWillBeBetween20And23() {
        WageCalculator underTest = new WageCalculator();
        double wage = underTest.calculateShiftWage("19", "23", 21);
        assertThat(wage).isEqualTo(48);
    }


}

         


