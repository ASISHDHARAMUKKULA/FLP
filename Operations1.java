package javaTraining;

public class Operations1 {
    String key;
    public Operations1(String choice){
        key=choice;



    }
    public String execute(int a,int  b){
        int c;
        switch(key){
            case "add":a=a+b;
//                System.out.println("c="+c);
                break;
            case "sub":a=a-b;
//                System.out.println("c="+c);
                break;
            case "mul":a=a*b;
//                System.out.println("c="+c);
                break;
            case "div":a=a/b;
//                System.out.println("c="+c);
                break;

        }
        return Integer.toString(a);
    }
}
