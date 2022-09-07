import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int m=scanner.nextInt();
        float invcash=scanner.nextFloat();
        float sum = 0;
        for (int i=0;i<m;i++){
            sum=invcash+((invcash/100)*7);
            invcash=sum;
        }
        System.out.println(sum);
    }
}
