package java_practice_cipherschools;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total cart amount: ");
        int price=sc.nextInt();
        double dis;
        if(price>5000){
            dis=(price*20)/100.0;
        }
       else if(price>=3000 && price<=5000){
            dis=(price*10)/100.0;
        }
        else{
            dis=0.0;
        }
        System.out.printf("Discount:₹%.1f%n",dis);
        double final_price=price-dis;
        System.out.printf("Final Amount:₹%.1f",final_price);
        sc.close();
    }
}
