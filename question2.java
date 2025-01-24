package java_practice_cipherschools;

public class question2 {
    public static void main(String[] args) {
        int num = 10;
        double double_num = 5.54;
        char ch = 'a';
        boolean bool = true;
        System.out.println("The values of all variable before conversion");
        System.out.println("Int :" + num);
        System.out.println("Double :" + double_num);
        System.out.println("char :" + ch);
        System.out.println("Boolean :" + bool);
        double num1 = num; // implicit conversion
        int ch1 = ch; // implicit conversion
        System.out.println("The values of all variable after conversion");
        System.out.println("Int converted into double :" + num1);
        System.out.println("Double :" + double_num);
        System.out.println("char converted into int :" + ch1);
        System.out.println("Boolean :" + bool);
    }

}


