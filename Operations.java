package javaTraining;

public class Operations {
    String key;
    public Operations(String choice){
        key=choice;



    }
    public String execute(int a,int  b){
            int c;

        if(key.equals("add"))
        {
            a=a+b;
        }
        if(key.equals("sub"))
        {
            a=a-b;
        }
        if(key.equals("mul"))
        {
            a=a*b;
        }
        if(key.equals("div"))
        {
            a=a/b;
        }
        return Integer.toString(a);
    }

}
