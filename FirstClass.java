package javaTraining;

public class FirstClass {
    public static void main(String args[]){
//        Calculate cal=new Calculate();

//        System.out.println(cal.add(10,20));
//        System.out.println(cal.sub(10,20));
//        System.out.println(cal.mul(10,20));
//        System.out.println(cal.div(10,20));
//        System.out.println(cal.modulo(10,20));
        Operations operations=new Operations("mul");
        String result=operations.execute(10,12);
        System.out.println(result);

    }
}
