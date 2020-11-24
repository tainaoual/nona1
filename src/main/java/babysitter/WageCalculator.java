package babysitter;

public class WageCalculator {
    private double bedtime;
    private String starting;
    private String ending;


    public double calculateShiftWage(String starting, String ending, double bedtime) {
        this.starting = starting;
        this.ending = ending;
        this.bedtime = 20;
        double howManyHours = 0;
        double midnight = 24;
        double startingHour = Double.parseDouble(starting);
        double endingHour = Double.parseDouble(ending);
        double salary = 0;
        double hourPreBed = 0;
        double hourPreMidNight =0;
        double payPreBedTime = 12;

        if( startingHour == ( bedtime - 1) && (endingHour + 4) == 24  ){
            payPreBedTime = 45;
        }

        if( startingHour == ( bedtime - 1) && (endingHour + 1) == 24  ){
            payPreBedTime = 20;
        }


        if (startingHour > 0 && endingHour > 12) {
            howManyHours = endingHour - startingHour;
        } else {
            if (endingHour <= 12) {
                howManyHours = endingHour;
            } else {
                howManyHours = midnight - endingHour;
            }
        }
        if (howManyHours > 0 && startingHour >= 17 && startingHour <= 19) {
            double hoursPreBedtime = endingHour - startingHour;
            salary += hoursPreBedtime * payPreBedTime;
            howManyHours = howManyHours - hoursPreBedtime;
        }
        double bedTimeTOMidNight = 0;

        if (howManyHours > 0 && endingHour > 12 && bedtime >=21) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
        }


        if (howManyHours > 0 && endingHour > 12) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
        }
        if (howManyHours > 0 && endingHour < 12) {
            salary =howManyHours*16;
        }

            return salary;
        }
    }
