public class Avgkilometer {
    public static void main (String[]args){
        //Assume a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds.
        //Write a program that displays the average speed in kilometers per hour.
        //(Note that 1 mile is 1.6 kilometers.)
       //24 mile = 24 * 1.6 kilometers
        double sum_hr= 1 + 0.67+ 0.00972;
        double mile = 24 * 1.6 ;
        System.out.println(sum_hr + "\t \t " + mile);
        // 1.67972 hr = 38.4 kilometer
        // 1 hr = 1 * mile / 1.6772
        System.out.println("The Avg Speed in Km per hour : \t" + mile/ sum_hr);
    }
}
