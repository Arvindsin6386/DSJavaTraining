import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("elliglebal for vote");

        }
        else
        {
            System.out.println("not elliglebal for vote");
        }
    }
}
