import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int x=scanner.nextInt();
            int y=x;
            while (x<100&&x>0){
                x=x+y;
                if (x<100){
                    System.out.println(x);
                }
            }

        }
    }

