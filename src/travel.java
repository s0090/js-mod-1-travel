import java.util.Scanner;
public class travel {
    public static void main(String[] args) {
        line1();
        line2();
        line3();
        line4();
    }
    public static void line1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our travel show");
        System.out.print("What's your name?");
        String name = input.nextLine();
        System.out.print("Hello " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip " + name);
    }
    public static void line2() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many days will you be spending there?");
        Integer days = input.nextInt();

        System.out.print("Howmuch EUR are you willing to spend on this trip?");
        Integer spending = input.nextInt();

        input.nextLine();

        System.out.print("What's the three letter abreviation for your destination?");
        String ccode = input.nextLine();

        System.out.print("How many " + ccode + (" for 1 EUR?"));
        Double erate = input.nextDouble();

        Integer timeh = days*24;
        Integer timem = timeh*60;

        System.out.print("if you are travelling for " + days + " days, that's the same as spending " + timeh + " hours or " + timem + " minutes.");
        input.nextLine();

        String bla = String.format("%.2f", (spending*erate)/days);

        System.out.println("If you are going to spend " + spending + " EUR that means per day you can spend up to " + ((double)spending/days) + "EUR");
        System.out.println("Your total budget in " + ccode + " is " + (double)spending*erate + " " + ccode + " . Per day this is " + bla + " " + ccode +"." );

    }
    public static void line3() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the time difference, in hours, between your home and your destination?");
        Integer timedd = input.nextInt();

        System.out.print("That means that wen it's midnight at home it will be " + timedd + ":00 in your travel destination");
        System.out.println("And when it's noon at home it will be " + (12+timedd) + ":00");
    }
    public static void line4() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the square area of your destination country in km2?");
        Double sqkm = input.nextDouble();
        String sqmi = String.format("%.2f", (sqkm / 2.59));
        System.out.println("In miles2 that is " + sqmi);
    }
}


