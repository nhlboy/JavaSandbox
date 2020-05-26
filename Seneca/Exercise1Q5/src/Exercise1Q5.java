public class Exercise1Q5 {

    public static void main(String[] args) {
        int birth, death, immigrant, population, seconds, firstYear, secondYear, thirdYear, fourthYear, fifthYear;
        seconds = 365 * 24 * 60 * 60;
        birth = seconds / 7;
        death = seconds / 13;
        immigrant = seconds / 45;
        population = 312032486;
        firstYear = population + birth - death + immigrant;
        secondYear = firstYear + birth - death + immigrant;
        thirdYear = secondYear + birth - death + immigrant;
        fourthYear = thirdYear + birth - death + immigrant;
        fifthYear = fourthYear + birth - death + immigrant;

        System.out.println("Current population is " +population);
        System.out.println("Population projection for the FIRST year: " +firstYear);
        System.out.println("Population projection for the SECOND year: " +secondYear);
        System.out.println("Population projection for the THIRD year: " +thirdYear);
        System.out.println("Population projection for the FOURTH year: " +fourthYear);
        System.out.println("Population projection for the FIFTH year: " +fifthYear);


    }
}
