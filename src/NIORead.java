
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class NIORead {
    public static void main(String args[])
    {
        try
        {
            RandomAccessFile file = new RandomAccessFile(
                            "binary.txt","r");
            FileChannel inChannel = file.getChannel();
            long fileSize = inChannel.size();
            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
            inChannel.read(buffer);
            //buffer.rewind();
            buffer.flip();
            for (int i = 0; i < fileSize; i++)
            {
                System.out.print((char) buffer.get());
            }
            inChannel.close();
            file.close();
        } 
        catch (IOException exc)
        {
            System.out.println(exc);
            System.exit(1);
        }
    }
}
