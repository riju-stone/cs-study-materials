import java.io.*;

abstract class Number{
    protected int number;
    Number(int n){
        this.number = n;
    }
    abstract void displayNum();
}

class HexNum extends Number{
    HexNum(int n){
        super(n);
    }

    @Override
    void displayNum() {
        System.out.println("Hexadecimal Represemtation of "+number+" is: "+Integer.toString(number,16));
    }

}

class OctalNum extends Number{

    OctalNum(int n){
        super(n); 
    }

    @Override
    void displayNum(){
        System.out.println("Octal Represemtation of "+number+" is: "+Integer.toString(number,8));
    }
}

class Question6 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter decimal number");
        int num = Integer.parseInt(stdin.readLine());

        Number n1 = new HexNum(num);
        n1.displayNum();

        Number n2 = new OctalNum(num);
        n2.displayNum();
    }
}
