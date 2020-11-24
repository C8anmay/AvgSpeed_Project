public class Population {
    public static void main(String[] args){
        // Calculate 1 year in sec
        int time_sec = 3600 * 24 * 365;

        // Born in 1 year
        int born = time_sec/ 7;
        // Death in 1 year
        int death = time_sec / 13;
        // Immigrant in 1 year
        int immigrant = time_sec/ 45;
        // Current populatin in Myanmar
        int current_population = 52032486;
        int population = born - death + immigrant;

        for (int p = 1; 6> p; p++) {
            //total population
            current_population +=  population;
            System.out.println(p + " year population is : " + current_population);
        }
    }
}
