import java.io.*;

public class TestA
{
	public static void main(String [] args)
  {
		//Q1 - writing value 'A1B2C3D4E5' into A.txt//
		String filename1 = "A.txt";
		
		try
		{
			//assuming default encoding//
			FileWriter fwriter = new FileWriter(filename1);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			//P/S: note that write() doesn't automatically append a newline character//
			bwriter.write("A1B2C3D4E5");
			
			bwriter.close();
		}
		
		catch(IOException ex)
		{
			System.out.println("An error existed to file " + filename1 + "!!!");
		}
	}
}
