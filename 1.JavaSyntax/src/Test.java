import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      System.out.println("My string is " + str);

    }

    public static void main2(String[] args) {
        System.out.println("Please, enter digits");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("our sum is= " + sum);


    }

    public static void main(String[] args) {
        System.out.println("Please, enter flout");
        Scanner scanner = new Scanner (System.in);
        double sum = 0.0;
        while (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            sum = sum + number;
        }
        System.out.println ("our sum is= " + sum);

    }
}
