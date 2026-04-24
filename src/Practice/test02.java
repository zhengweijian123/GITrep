package Practice;

public class test02 {
    public  long factorial(int n){
        long sum=0;
        long a=1;
        for(int i=1;i<=n;i++){
            a *=i;
            sum +=a;
        }
        return sum;
    }
    public static void main(String[] args) {
       test02 a = new test02();
        System.out.println(a.factorial(3));
    }
}
