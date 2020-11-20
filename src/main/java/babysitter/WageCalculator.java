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
        System.out.println("*********************");
        if (startingHour > 0 && endingHour > 12) {
            howManyHours = endingHour - startingHour;
        } else {
            if (endingHour <= 12) {
                howManyHours = endingHour;
            } else {
                howManyHours = midnight - endingHour;
            }
        }
        System.out.println(" hours " + starting + " " + endingHour + " " + howManyHours);
        if (howManyHours > 0 && startingHour >= 17 && startingHour <= 19) {
            double hoursPreBedtime = endingHour - startingHour;
            salary += hoursPreBedtime * 12;
            howManyHours = howManyHours - hoursPreBedtime;
        }
        double bedTimeTOMidNight = 0;
        System.out.print(" howmany hours " + howManyHours + " starting " + startingHour + " ending " + endingHour);
        if (howManyHours > 0 && endingHour > 12 && bedtime >=21) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
        }

        System.out.print(" howmany hours " + howManyHours + " starting " + startingHour + " ending " + endingHour + bedtime+"bedtime");
        if (howManyHours > 0 && endingHour > 12) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
        }
        if (howManyHours > 0 && endingHour < 12) {
            salary =howManyHours*16;
        }
            System.out.println("How Many hours " + howManyHours + " Salary " + salary);
            return salary;
        }
    }
