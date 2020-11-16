
package babysitter;//### Babysitter

        import org.junit.jupiter.api.Test;
        import static org.assertj.core.api.Assertions.assertThat;
public class BabySitterTest {

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage("17", "18", 20);
        assertThat(wage).isEqualTo(12);
    }
    @Test
    public  void paid12$HourFromTheStartOfTheirShiftToTheChildrenBedtime(){
        PayPreBedtimeCalculator2 underTest = new PayPreBedtimeCalculator2();
        int  payPreBedtime =underTest.calculatePayPreBedtime(17,20);
        assertThat(payPreBedtime).isEqualTo(36);

    }
    @Test
      public void paid$8HourFromTheChildrenBedtimeToMidnight() {
        PayPreBedtimeCalculator underTest = new PayPreBedtimeCalculator();
        int  payPreBedtime =underTest.calculatePayPreBedtime(20,12);
        assertThat(payPreBedtime).isEqualTo(32);
    }


        @Test
    public void MidnightToEndingShouldPay64() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage("12", "4", 20);
        assertThat(wage).isEqualTo(64);
    }
         @Test
    public void withOneHourPreBedtimeAndFourHoursPreMidnightPostBedtimeHoursWouldPayDay48(){
             WageCalculator underTest = new WageCalculator();
         int wage = underTest.calculatePayADay(1,4);
             assertThat(wage).isEqualTo(48);
         }
         @Test
    public  void withOneHourPreBedtimeAndOneHourPreMidnightPostBedtimeHoursWouldRemain$20(){
             PayRemainCalculator underTest = new PayRemainCalculator();
               int PayRemain = underTest.PayRemainCalculator(1,1);
             assertThat(PayRemain).isEqualTo(20);
         }
         @Test
    public  void   allowPartialHourPayAndTakeStartEndTimesAStringArguments(){
             PartialHourPayCalculator underTest = new PartialHourPayCalculator();
             int ParcialHourPay = underTest.PartialHourPayCalculator(1,"0","1");
             assertThat(ParcialHourPay).isEqualTo(12);
         }
         @Test
    public  void bedTimeCanBeBetween17And23OrBeforeStartShiftOrAfterAndShift(){
        BedTimeCalculator undertest =new BedTimeCalculator();
        int BedTime = undertest.BedTimeCalculator(17,12);

             assertThat(BedTime).isEqualTo(6);
         }
         
         
         }

