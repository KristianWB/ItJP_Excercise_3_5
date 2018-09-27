import java.util.Scanner;

public class FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to choose a day of the week and a number of days forward
        System.out.println("Please, choose a day in the week");
        System.out.println("Sunday is the.......number: 0");
        System.out.println("Monday is the_______number: 1");
        System.out.println("Tuesday is the......number: 2");
        System.out.println("Wednesday is the____number: 3");
        System.out.println("Thursday is the.....number: 4");
        System.out.println("Friday is the_______number: 5");
        System.out.println("Saturday is the.....number: 6");
        System.out.print("Now choose your day:        ");
        int day = input.nextInt();



        // Resetting the masterdate for future nameday calculation


        System.out.print("It is time to set days ahead...DO IT!!!!:");
        int future = input.nextInt();

        // Calculating the day choosen
        int date = (future) % 7;

        // Setting it up for display to user

        switch (day % 7)   {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Tuesday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
        }


        // Calculating and printing out the future day
        switch ((day + future) % 7) {
            case 0:
                System.out.println("The future day is Sunday");
                break;
            case 1:
                System.out.println("The future day is Monday");
                break;
            case 2:
                System.out.println("The future day is Tuesday");
                break;
            case 3:
                System.out.println("The future day is Wednesday");
                break;
            case 4:
                System.out.println("The future day is Tuesday");
                break;
            case 5:
                System.out.println("The future day is Friday");
                break;
            case 6:
                System.out.println("The future day is Saturday");
        }

        System.out.println(date);


    }
    }
