package javaTraining;
import java.util.*;

public class SecondClass {
    public static void main(String args[]){
        Calculate cal=new Calculate();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println((cal.add(10,20)));
                    break;
            case 2:System.out.println((cal.sub(10,20)));
                    break;
            case 3:System.out.println((cal.mul(10,20)));
                    break;
            case 4:System.out.println((cal.div(10,20)));
                    break;
            case 5:System.out.println(cal.modulo(10,20));
                    break;
                default:System.out.println("invalid choice");
        }
    }
}
