import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class appRunner
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file NAME: ");
        String fileName = sc.nextLine();
        System.out.println("Enter the number of lines between 1-230: ");
        int NumOfLines = sc.nextInt();
        sc.nextLine();
        while(NumOfLines>230 || NumOfLines<0){
            System.out.println("Enter the valid input between 1 to 230");
            NumOfLines = sc.nextInt();
            sc.nextLine();
        }
        fileWriter write = new fileWriter(fileName, NumOfLines);
        fileReader read = new fileReader(fileName);
        //CountOfWordsInFlle count=new CountOfWordsInFlle(fileName,NumOfLines);
        checkUniqueCharInLine check=new checkUniqueCharInLine(fileName,NumOfLines);

    }
}
