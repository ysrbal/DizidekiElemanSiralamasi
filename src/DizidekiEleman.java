import java.util.Arrays;
import java.util.Scanner;

public class DizidekiEleman {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        int n = inp.nextInt();
        int[] seri = new int[n];

        System.out.println("Dizinin Elemanlarini Giriniz. ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Eleman : ");
            seri[i] = inp.nextInt();
        }
        System.out.println("Girilen Dizi : ");
        System.out.println(Arrays.toString(seri));
        System.out.println("Siralanmis Haliyle Dizi : ");
        Arrays.sort(seri);
        System.out.println(Arrays.toString(seri));
    }
}



