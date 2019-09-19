package by.epam.task_1.stage_1;


import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import by.epam.task_1.stage_1.utils.FileParser;
import by.epam.task_1.stage_1.utils.Sorter;


public class Task {

	public static void main(String[] args) {
		
		File file = new File("resources\\numbers.txt");
		List<Double> array;
		try (FileParser parser= new FileParser(file)) {
			while ((array = parser.getNextArray()) != null) {
				
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found by this address: " + file.getPath());
		} catch (IOException e1) {
			System.err.println("Error while reading from file");
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		
		Double[] arr = new Double[10];
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextDouble()*1000;
		}
		System.out.println(Arrays.toString(arr));
		Sorter.shellSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
