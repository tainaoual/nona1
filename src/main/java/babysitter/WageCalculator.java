package babysitter;

public class WageCalculator {
    private double bedtime;
    private String starting;
    private String ending;

    public double calculateShiftWage(String starting, String ending, double bedtime) {
        this.starting = starting;
        this.ending = ending;
        this.bedtime = bedtime;
        //double bedtime = 20 ;
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
        //gets paid $12/hour from the start of their shift to the children's bedtime
        if (howManyHours > 0 && startingHour >= 17 && startingHour <= 19) {

            double hoursPreBedtime = endingHour - startingHour;
            salary += hoursPreBedtime * 12;
            howManyHours = howManyHours - hoursPreBedtime;
            System.out.println("12 hours " + howManyHours + " " + salary);
        }
        double bedTimeTOMidNight = 0;
        System.out.print(" howmany hours " + howManyHours + " starting " + startingHour + " ending " + endingHour);
        if (howManyHours > 0 && endingHour > 12 && bedtime >=21) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
            System.out.println("8 hours " + howManyHours + " " + salary);
        }

        //gets paid $8/hour from bedtime to midnight.
        //double bedTimeTOMidNight = 0;
        System.out.print(" howmany hours " + howManyHours + " starting " + startingHour + " ending " + endingHour + bedtime+"bedtime");
        if (howManyHours > 0 && endingHour > 12) {
            double hoursTOmidnight = endingHour - startingHour;
            salary += hoursTOmidnight * 8;
            howManyHours = howManyHours - bedTimeTOMidNight;
            System.out.println("8 hours " + howManyHours + " " + salary);
        }


//gets paid $16/hour from midnight to the end of their shift.
        if (howManyHours > 0 && endingHour < 12) {
           // double hours = endingHour - startingHour;
            salary =howManyHours*16;
           // salary += hours * 16;
            System.out.println("Ending Hour" + endingHour);
            System.out.println("16 hours " + howManyHours + " " + salary);
        }

            System.out.println("How Many hours " + howManyHours + " Salary " + salary);

            return salary;
        }
    }
