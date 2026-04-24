package Practice;

public class test01 {
    public void get(){
        System.out.println("你好");
    }
   public static class A{
    public  static void print(int num) {

         for(int i=31;i>=0;--i){
             System.out.print((num & (1<<i))==0 ? "0" : 1);
         }
    }
    }
    public static void main(String[] args) {
        A b=new A();
        b.print(5);
    }
}
//>>带符号右移，>>>不带符号右移