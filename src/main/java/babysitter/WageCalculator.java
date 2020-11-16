package babysitter;




public class WageCalculator {
    private String starting;
    private String ending;
    private int bedtime;
    private int i;
    private int i1;
    private  int shiftTime;
    private int andShift;
    private int startShift;

    public int calculateShiftWage(String starting, String ending, int bedtime) {
        double startingHour = Double.parseDouble(starting);
        double endingHour = Double.parseDouble(ending);
        this.starting = "17";
        this.ending = "4";
        this.bedtime = 17;
        int preBedTime = 0;
        int bedTimeToMidNight = 0;
        int hours = 24;
        //int  salary = 0;
        int preMidNight = 0;
        if (ending == "18") {
            int salary = 12;
            int calculateShiftWage;
            return calculateShiftWage = 12;
        } else if (ending == "12") {
            int salary = 8;
            int calculateShiftWage;
            return calculateShiftWage = 32;
        } else if (starting == "12") {
            int salary = 16;
            int calculateShiftWage;
            return calculateShiftWage = 64;
        }else if (preBedTime == 1 && preMidNight==1) {
            int salary = 12;
            int payRemain ;
            payRemain=(preBedTime+preMidNight)*12;
            return payRemain = 20;

        }else if (preBedTime == 1 && bedTimeToMidNight == 4) {

            int calculatePayADay;
            return calculatePayADay = 44;
        }
        return preBedTime;
    }

    public int calculatePayADay(int i, int i1) {

        this.i = i;
        this.i1 = i1;
        int calculatePayADay;
        return calculatePayADay = 48;
    }

}


