import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Variables
        double fahrenheit;
        int celsius;
        boolean wrongInput = false;
        String trash;
        String YNInput;



        //do loop to keep running until input is correct
        do {


            //prompt for input

            System.out.println("Enter degrees in Celsius ");
            //input if is number if not go to else
            if (in.hasNextInt()) {
                celsius = in.nextInt();
                in.nextLine();

                //does the calculations for Fahrenheit if the input is correct
                fahrenheit = (celsius * 1.8) + 32;

                //an if statement to tell the user the temp is at boiling temps
                if (fahrenheit >= 212) {
                    System.out.printf("The temperature is above the boiling point %.2f \n", +fahrenheit);

                }
                //an if statement to tell the user the temp is at freezing temps
                else if (fahrenheit <= 32) {
                    System.out.printf("The temperature is below the freezing point %.2f \n", +fahrenheit);

                }
                //if not freezing or boiling just states temps
                else {
                    System.out.printf("The degrees in Fahrenheit is %.2f \n", +fahrenheit);
                }


            } else {
                //not a degree in numbers
                trash = in.nextLine();
                System.out.println("You said the temperature was " + trash);
                //prompts if they want to try again with valid input

                System.out.println("Would you like to try again with a valid number input? Y/N");
                YNInput = in.nextLine();

                if (YNInput.equalsIgnoreCase("N")) {
                    wrongInput = true;
                }



            }

        }while (!wrongInput) ;
    }
}
