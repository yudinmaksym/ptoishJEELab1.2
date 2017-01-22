/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
/**
 *
 * @author админ
 */
public class GenerateFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("binary.txt");
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
        }
//         FileOutputStream fileOut =
//         new FileOutputStream("binary.txt");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         FileWriter writer = new FileWriter("binary.txt");
        for(int i = 0 ; i<150000000; i++)
        {
                int numOfRec = 0 + (int)(Math.random()*+2);
                final String s = Integer.toString(numOfRec);
                writer.write(s);
        }
            writer.flush();
            writer.close();
        
//            out.close();
//         fileOut.close();
    }
}
