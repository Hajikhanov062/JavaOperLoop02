import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();

        int result = 0;
        for (int i = a; i <=b ; i++) {

            result +=i;

            System.out.println(i + " : ");

        }

        System.out.println(result);


    }
}