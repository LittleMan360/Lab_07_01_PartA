public class Counts
{
    public static void main(String[] args)
    {

        //For loop where number starts at 0 till 30 and adds one each time
        for (int num = 0; num <= 30; num++)
        {

            System.out.println("num= " + num);

        }

        //for loop where number starts at 30 and subtracts 1 each time till it is at 0
        for (int num = 30; num >= 0; num--)
        {

            System.out.println("num= " + num);

        }

        //for loop number starts at 0 till 18 and counts uo by 3
        for (int num = 0; num <= 18; num +=3)
        {
            System.out.println("num = " + num);
        }

        //for loop number starts at 10 down to 0 and subtracts 2 each time
        for (int num = 10; num >= 0; num -=2)
        {
            System.out.println("num = " + num);
        }

    }
}