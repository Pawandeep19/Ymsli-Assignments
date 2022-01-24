package day5.q4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class q4 {
	public static void main(String[] args) {
        Double max=Double.MIN_VALUE;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ve00ym324\\Documents\\ymsli-assignments\\Lab_Assignments_Day5\\src\\day5\\q4\\data.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				Double temp=Double.parseDouble(line);
				max=Math.max(max, temp);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		System.out.println("Largest Amongst These Numbers is: " + max);
	}
}
