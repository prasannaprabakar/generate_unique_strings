import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class checkUniqueCharInLine
{
    public checkUniqueCharInLine(String filename,int NumberOfLines) throws IOException
    {
        for (int lineCount = 1; lineCount < NumberOfLines; lineCount++)
        {
            System.out.println("\n");
            String line = Files.readAllLines(Paths.get(filename)).get(lineCount);

                Map<Character, Integer> baseMap = new LinkedHashMap<Character, Integer>();
                char[] charArray = line.toCharArray();
                for (Character ch : charArray)
                {
                    if (baseMap.containsKey(ch))
                    {
                        baseMap.put(ch, baseMap.get(ch) + 1);
                    } else
                    {
                        baseMap.put(ch, 1);
                    }
                }
                Set<Character> keys = baseMap.keySet();
                for (Character ch : keys)
                {
                    if (baseMap.get(ch) == 1)
                    {
                        System.out.println(ch + " unique character in line " + lineCount);
                    }
                }
                System.out.println("\n");
                System.out.println("Line" + lineCount + " completed move to next line");
            }
        }
    }

