
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class BufferedRead {
    public static void main(String[]args) throws IOException{

    FileReader in = new FileReader("binary.txt");
    BufferedReader br = new BufferedReader(in);

   String line;
    while ((line = br.readLine()) != null) {
    System.out.println(line);
}
    in.close();

    }
}
