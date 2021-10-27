
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class fileWriter
{
    public fileWriter(String fileName, int NumOfLines) throws IOException
    {
        final int ASCII_a = 97; // letter 'a'
        final int ASCII_z=122;
        final int targetStringLength = 100;
        Random random = new Random();
        File file = new File(fileName);
            if (!file.exists())
            {
                file.createNewFile();
            }

                try (FileWriter fw = new FileWriter(file,true))
                {
                    for (int counter = 0; counter < NumOfLines; counter++)
                    {
                        StringBuilder buffer = new StringBuilder(targetStringLength);
                        for (int i = 0; i < targetStringLength; i++) {
                            int randomLimitedInt = ASCII_a + (int) (random.nextFloat() * (ASCII_z-ASCII_a)+1);
                            buffer.append((char) randomLimitedInt);
                            buffer.append(" ");
                        }
                        String generatedString = buffer.toString();
                        fw.write(generatedString);
                        fw.write("\n");

                    }

                }
            }
        }



