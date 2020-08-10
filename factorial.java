import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı : ");
        int factoriel = 1;
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++){

            factoriel *= i;
            System.out.println(factoriel);
        }

    }
}
