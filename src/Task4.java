import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int t=scanner.nextInt();
            if (t>-5){
                System.out.println("Тепло");
            } else if (-5>=t&&t>-20) {
                System.out.println("Нормально");
            } else if (-20>=t) {
                System.out.println("Холодно");
            }
        }

    }

