import java.io.*;

class Question5 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Question5 obj = new Question5();

        String repWord, newWord;

        int len = args.length;
        int[] modPos = new int[len];

        System.out.println("You Entered");
        for(int i = 0; i < len; i++){
            obj.display(args[i]);
            System.out.print(" ");
        }

        System.out.println();

        System.out.println("Enter the word from your sentence, you want replaced");
        repWord = stdin.readLine();

        System.out.println("Enter the word to be used instead of "+repWord);
        newWord = stdin.readLine();

        int pos = 0;
        for(String i : args){
            if(i.equalsIgnoreCase(repWord)){
                obj.display(newWord);
                System.out.print(" ");
                pos++;
                modPos[pos] = pos;
            }
            else{
                obj.display(i);
                System.out.print(" ");
                pos++;
            }
        }
        System.out.println();

        System.out.println("Modified Words :");
        for(int i = 0; i < modPos.length; i++){
            if(modPos[i] != 0)
                System.out.print(modPos[i]+"th word, ");
        }
    }

    public void display(String str){
        System.out.print(str);
    }

}
