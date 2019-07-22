package io.operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args)  throws IOException  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		String inputFilename = "src/io/" + sc.nextLine();
		
		System.out.print("Enter the output file name: ");
		String outputFilename = "src/io/" + sc.nextLine();
		
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
		sc.close();
		
		System.out.println("File is copied.");

	}

}
