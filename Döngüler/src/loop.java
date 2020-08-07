import java.util.Scanner;

public class loop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=sc.nextInt();


        int fak=1;
        while (sayi>0){
            fak*=sayi;
           sayi--;
        }
        System.out.println("faktöriel="+fak);



        }
    }
