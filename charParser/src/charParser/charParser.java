package charParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class charParser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader cin = new BufferedReader(new FileReader(new File("C:\\Development\\Launchpad\\charParser\\src\\charParser\\charSet.txt")));
			while(parseChar(cin)){};
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static boolean parseChar(BufferedReader cin) {
		String line1 = "CH_ARRAY[";
		String line2 = "] = new int[]{";
		String line3 = "};";
		
		String finalLine;
		
		String comm = null;
		try {
			comm = cin.readLine().toUpperCase();
			int charac = Character.getNumericValue(comm.charAt(0)) - 10;
			
			finalLine = line1 + charac + line2;
			
			for (int i = 0; i < 7; i++) {
				comm = cin.readLine().toUpperCase();
				for (int j = 0; j < 5; j++) {
					if (comm.charAt(j) == 'X') {
						finalLine += i*5+j + ",";
					}
				}
			}
			
			finalLine = finalLine.substring(0, finalLine.length()-1);
			
			finalLine += line3;
			
			System.out.println(finalLine);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return true;
	}

}
