import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println();
        String kelime=sc.nextLine();
        String ters=" ";

        for (int i=kelime.length()-1; i>=0; i--) {
            ters = ters + kelime.charAt(i);
        }
        System.out.println(ters);

    }
}
