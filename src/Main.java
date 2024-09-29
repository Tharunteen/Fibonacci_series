//to find fib series and nth element of the series using recursion
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            System.out.print(fib(i)+" ");
        }
        }
        public static int fib(int n){
        if(n==0 || n==1) return n;
        else return fib(n-1)+fib(n-2);
    }
}