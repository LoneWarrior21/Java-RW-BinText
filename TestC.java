import java.io.*;

public class TestC
{
	public static void main(String [] args)
	{
		//Q3 - read & write value in B.bin into C.txt//
		String filename3 = "C.txt";
		
		try
		{
            // Use this for reading the data//
            byte[] buff = new byte[1000];

            FileInputStream isfile = new FileInputStream("B.bin");

            int total = 0;
            int nRead = 0;
			
            while((nRead = isfile.read(buff)) != -1)
			{
                // Convert to String so we can display it. Of course you wouldn't want to do this with a 'real' binary file.
                System.out.println(new String(buff));
                total += nRead;
            }   

            // Always close files.
            isfile.close();        

			FileWriter fwriter = new FileWriter(filename3);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			//P/S: note that write() doesn't automatically append a newline character//
			bwriter.write(new String(buff));
			
			bwriter.close();
            System.out.println("Read " + total + " bytes");
        }
		
        catch(FileNotFoundException ex)
		{
            System.out.println( "Unable to open file '" + filename3 + "'");                
        }
		
        catch(IOException ex)
		{
            System.out.println("Error reading file '" + filename3 + "'");                  

        }

	}
}
