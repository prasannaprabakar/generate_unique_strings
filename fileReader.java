import java.io.*;
import java.util.Scanner;

public class fileReader
{
    public  fileReader(String fileName) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            for (String line; (line = br.readLine()) != null; )
            {

                    System.out.println(line);

            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }
}
