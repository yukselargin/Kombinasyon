import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,nFac=1,rFac=1,nNegrFac=1,total;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin n eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Kümenin r grup sayısını giriniz: ");
        r= input.nextInt();

        for (int i = 1; i <= n; i ++) {
            nFac*=i;
        }
        for (int j = 1; j <= r; j ++) {
            rFac*=j;
        }
        for (int k = 1; k <= (n-r); k ++) {
            nNegrFac*=k;
        }
        total= (nFac)/(rFac*nNegrFac);
        System.out.print("Kombinasyon: " +total);
    }
}