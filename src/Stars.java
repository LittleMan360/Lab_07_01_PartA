public class Stars
{
    public static void main(String[] args)
    {
        //loops for the stars gradually getting to 5 from 1
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }

        //loops stars gradually going from 5 to 1
        for (int row = 5;row >=1; row--)
        {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();

        }

        //loops and puts out 5 rows of 5 stars
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) System.out.print("*");
            System.out.println();
        }

    }
}
