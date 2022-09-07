import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int month=scanner.nextInt();
            Integer mo=1;

            if (month==12&&month<=2&&month>0){
                System.out.println("Зима");
            } else if (month>2&&month<=5) {
                System.out.println("Весна");
            } else if (month>5&&month<=8) {
                System.out.println("Лето");
            }else if (month>8&&month<=11){
                System.out.println("Осень");
            }
    }
}
