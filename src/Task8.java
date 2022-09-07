import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            int sum = 0;
            for (int i=1;i<=x;i++){
                if (x>0&&(x%1==0)){
                    sum=sum+i;
                }
            }
            System.out.println(sum);
        }
    }

