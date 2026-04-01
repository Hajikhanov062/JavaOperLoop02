import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();

        int result1 = 0;
        int result2 = 0;
        for (int i = a; i <=b ; i++) {

            if (i % 2 == 0) {
                result1+=i;
            }else{
                result2+=i;
            }




        }


        System.out.println("netice1 : "+result1 + " netice2 : "+result2);


    }
}