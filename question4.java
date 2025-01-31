
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Enter your monthly income: ");
        double income=sc.nextDouble();
        System.out.println("Do you have pending dues (true/false): ");
        boolean dues=sc.nextBoolean();
        boolean eligibility=(age>=18 && income>=30000 && dues==false)?true:false;

        if(eligibility==true){
            System.out.println("You are eligible for premimum membership.");
        }
        else{
            System.out.println("You are not eligible for premium membership.");
        }
        sc.close();
    }
}
