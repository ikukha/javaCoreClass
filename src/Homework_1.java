import java.util.Scanner;

public class Homework_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task_8();
    }

    static void Task_1() {
        System.out.print(" A = "); double A = scanner.nextDouble();
        System.out.print(" B = "); double B = scanner.nextDouble();
        System.out.print(" C = "); double C = scanner.nextDouble();

        boolean between = A < C && C < B || B < C && C < A;

        if(between) {
            System.out.println("Number " + C + " is between " + A + " and " + B);
        }
        else {
            System.out.println("Number " + C + " is not between " + A + " and " + B);
        }
    }

    static void Task_2() {
        System.out.print(" x = "); int x = scanner.nextInt();
        System.out.print(" y = "); int y = scanner.nextInt();

        int sum = x + y;
        int dif = x - y;
        int prod = x * y;
        int remDev = 0;
        if (y != 0) remDev = x % y;
        int intDev = 0;
        if (y != 0) intDev = x / y;

        System.out.println("sum = " + sum);
        System.out.println("dif = " + dif);
        System.out.println("prod = " + prod);
        System.out.println("remDev = " + remDev);
        System.out.println("intDev = " + intDev);
    }

    static void Task_2a() {
        System.out.print(" x = "); double x = scanner.nextDouble();
        System.out.print(" y = "); double y = scanner.nextDouble();

        double sum = x + y;
        double dif = x - y;
        double prod = x * y;
        double remDev = 0;
        if (y != 0) remDev = x % y;
        double intDev = 0;
        if (y != 0) intDev = x / y;

        System.out.println("sum = " + sum);
        System.out.println("dif = " + dif);
        System.out.println("prod = " + prod);
        System.out.println("remDev = " + remDev);
        System.out.println("intDev = " + intDev);
    }

    static void Task_3() {
        System.out.print(" x = "); double x = scanner.nextDouble();
        System.out.print(" y = "); double y = scanner.nextDouble();

        double min = x;
        if (y < min) min = y;

        double max = x;
        if (y > max) max = y;

        System.out.println("Ascending Order: " + min + ", " + max);
        System.out.println("Descending Order: " + max + ", " + min);
    }

    static void Task_4()
    {
        System.out.print(" A = "); double A = scanner.nextDouble();
        System.out.print(" B = "); double B = scanner.nextDouble();
        System.out.print(" C = "); double C = scanner.nextDouble();

        double temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println(" A = " + A);
        System.out.println(" B = " + B);
        System.out.println(" C = " + C);
    }

    static void Task_5()
    {
        System.out.print(" time (24-hour format) = "); int time = scanner.nextInt();
        System.out.print(" money = "); double money = scanner.nextDouble();
        System.out.print(" isWorkingTime = "); boolean isWorkingTime = scanner.nextBoolean();

        String ans = "I'm at work, I'll be working and won't be able to go out.";
        if (!isWorkingTime) {
            if (9 <= time && time < 21) { //Day
                if (money > 10) {
                    ans = "it's a day and I have more than 10$. I will go to the cinema.";
                }
                else {
                    ans = "it's a day and I have less than 10$. or I don't have money, I'll go for a walk.";
                }
            }
            else {                        //Night
                if (money > 20) {
                    ans = "it is night and I have more than 20$. I will go to a disco.";
                } else {
                    ans = "it's night and I have less than 20$. I will go to sleep.";
                }
            }
        }
    }

    static void Task_6()
    {
        System.out.print("A = "); //7854
        int A = scanner.nextInt();

        int d3 = A / 1000 % 10; //7
        int d2 = A / 100 % 10; //8
        int d1 = A / 10 % 10; //5
        int d0 = A /1 % 10; //4

        int newDigit1 = d3 * 10 + d0 * 1; //74
        int newDigit2 = d2 * 10 + d1 * 1; //85

        int max = newDigit1;
        if (newDigit2 > max) max = newDigit2;

        int min = newDigit1;
        if (newDigit2 < min) min = newDigit2;

        System.out.print("Comparison: " + min + " < " + max);
    }

    static void Task_7()
    {
        System.out.print("A = "); //56
        int A = scanner.nextInt();
        System.out.print("B = "); //93
        int B = scanner.nextInt();

        int prod = A * B;
        String ans = "even";
        if (prod%2 != 0) ans = "odd ";

        int d0 = prod /1 % 10;
        String ans2 = "is divisible by 3";
        if (d0%3 != 0) ans2 = "is not divisible by 3";

        System.out.println(prod + " - " + ans);
        System.out.println(d0 + " " + ans2);
    }

    static void Task_8()
    {
        System.out.print("ThreeDigitNumber (1...9) = "); //638
        int ThreeDigitNumber = scanner.nextInt();

        int d2 = ThreeDigitNumber / 100 % 10; //6
        int d1 = ThreeDigitNumber / 10 % 10; //3
        int d0 = ThreeDigitNumber /1 % 10; //8

        String msgYes = " is divisible by ";
        String msgNo = " is not divisible by ";

        String ans1 = (ThreeDigitNumber%d0 == 0) ? msgYes : msgNo;

        String ans2 = (ThreeDigitNumber%d1 == 0) ? msgYes : msgNo;

        String ans3 = (ThreeDigitNumber%d2 == 0) ? msgYes : msgNo;

        System.out.println(ThreeDigitNumber + ans1 + d0);
        System.out.println(ThreeDigitNumber + ans2 + d1);
        System.out.println(ThreeDigitNumber + ans3 + d2);
    }

    static void Task_9()
    {
        System.out.print("Number [0-100] = "); //99
        int number = scanner.nextInt();

        String prediction="";

        if (number == 0) prediction = "it will not rain";
        else if (0 < number && number <= 5) prediction = "minimal chance of precipitation";
        else if (5 < number && number <= 20) prediction = "a small chance of precipitation";
        else if (20 < number && number <= 50) prediction = "there is a chance of precipitation";
        else if (50 < number && number <= 80) prediction = "high chance of precipitation";
        else if (80 < number && number <= 100) prediction = "it will rain";
        else prediction = "Wrong number";

        System.out.println("prediction = " + prediction);
    }

    static void Task_10() {
        System.out.print("Number [0-24] = "); //20
        int number = scanner.nextInt();

        if (number == 24) number = 0;

        String WelcomeMessage = " ";

        if (5 <= number && number <= 10) WelcomeMessage = "Good morning";
        else if (11 <= number && number <= 18) WelcomeMessage = "Good day";
        else if (19 <= number && number <= 23) WelcomeMessage = "Good evening";
        else if (0 <= number && number < 5) WelcomeMessage = "Why aren't you sleeping?";
        else WelcomeMessage = "Wrong number";

        System.out.println("WelcomeMessage = " + WelcomeMessage);
    }

    static void Task_11() {
        System.out.print("ThreeDigitalNumber  = "); //820
        int number = scanner.nextInt();

        int d2 = number / 100 % 10; //8
        int d1 = number / 10 % 10; //2
        int d0 = number /1 % 10; //0

        String message = " ";

        if (d0 < d1 && d1 < d2) message = "Descending Order";
        else if (d0 > d1 && d1 > d2) message = "Ascending Order";
        else if (d0 == d1 && d1 == d2) message = "The numbers are equal";
        else message = "Try with another number";

        System.out.println("Message = " + message);
    }
}