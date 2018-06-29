import java.util.Scanner;

public class Grade
{
    public static void main(String args[])
    {
        String markS = null;
        int mark = 0;
        boolean valid = false;

        while (!valid) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Please enter your mark >>");
                markS = input.nextLine();
                mark = Integer.parseInt(markS);
                getGrade(mark);
                valid = true;
            } catch (InvalidMarkException i) {
                System.out.println("An invalid value, " + mark + " is entered as input");
            } catch (Exception e) {
                System.out.println("An invalid value, " + markS + " is entered as input");
            }
        }
    }

    public static String getGrade(int m) throws InvalidMarkException
    {
        String grade;
        if (m < 0 || m > 100) throw new InvalidMarkException(" ");
        else if (m < 50)
        {
            grade = "F";
                System.out.println("Your grade is " + grade);
        }
        else
        {
            grade = "P";
            System.out.println("Your grade is " + grade);
        }
        return grade;
    }
}
