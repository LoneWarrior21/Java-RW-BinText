import java.io.*;

public class TestB
{
	public static void main(String [] args)
	{
		//Q2 - read & write value in A.txt into B.bin in reverse order//
		String filename2 = "B.bin";
		
		try
		{
			File rfile = new File("A.txt");
			FileReader fread = new FileReader(rfile);
			BufferedReader bread = new BufferedReader(fread);
			StringBuffer sbuff = new StringBuffer();
			String a;
			String b; //b is the string read from A.txt//
			String conv; //conv is the string in reverse order//
			
			while((a=bread.readLine()) != null)
			{
				sbuff.append(a);
				sbuff.append("\n");
			}
		
			fread.close();
			b = sbuff.toString();
			
			byte[] sbyte = b.getBytes();
			byte[] result = new byte[sbyte.length];
			
			for(int i=0; i<sbyte.length; i++)
			{
				result[i] = sbyte[sbyte.length-i-1];
			}
			
			conv = new String(result);
			
			FileWriter fwriter = new FileWriter(filename2);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			//P/S: note that write() doesn't automatically append a newline character//
			bwriter.write(conv);
			
			bwriter.close();
			System.out.println(conv);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
