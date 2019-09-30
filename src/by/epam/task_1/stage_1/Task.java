package by.epam.task_1.stage_1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import by.epam.task_1.stage_1.exceptions.FileException;
import by.epam.task_1.stage_1.utils.ArrayStreamStatistics;
import by.epam.task_1.stage_1.utils.Sorter;
import by.epam.task_1.stage_1.file_interactors.FileParser;

public class Task {

	public static void main(String[] args) {
		
		try {
			List<double[]> listOfArr = FileParser.getListOfArrays("resources\\numbers.txt");
			for(double[] arr : listOfArr) {
				System.out.println(ArrayStreamStatistics.average(arr));
			}
		} catch (FileException e) {
			e.printStackTrace();
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
