import java.util.Scanner;

public class leaap {

    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the year you want to know if it is a leap year : ");
        year = input.nextInt();

        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
