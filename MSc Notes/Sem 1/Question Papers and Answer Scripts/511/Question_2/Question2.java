import java.io.*;

class Question2 {
    public static void main(String args[]) throws IOException, InterruptedException {

        FactorialThread fact = new FactorialThread();
        PrimeFactThread prime = new PrimeFactThread();

        fact.start();
        fact.join();
        prime.start();

    }
}

class FactorialThread extends Thread {

    private int number;

    public void run() {
        try {
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int res = fact();

        System.out.println("Factorial of "+number+" is: "+res);
        System.out.println("Factorial is displayed");
    }

    private void input() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number for factorial calculation...");
        number = Integer.parseInt(stdin.readLine());
    }

    private int fact() {
        int res = 1;

        for (int i = 1; i <= number; i++)
            res = res * i;
        return res;
    }
}

class PrimeFactThread extends Thread {

    private int number;

    public void run() {
        try {
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Prime factors of "+number+" are : ");
        primeFact();
        System.out.println("All prime factors are displayed");
    }

    private void input() throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number for prime factors...");
        number = Integer.parseInt(stdin.readLine());
    }

    private void primeFact(){
        for(int i = 1; i <= number; i++){
            if(number % i == 0 && isPrime(i))
                System.out.print(i+", ");
        }
        System.out.println();
    }

    private boolean isPrime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                c++;
        return (c == 2);
    }
}