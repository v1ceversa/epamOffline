package by.epam.task_1.stage_1;


import java.io.File;

import java.util.Arrays;
import java.util.Random;

import by.epam.task_1.stage_1.exceptions.CanNotCloseFileException;
import by.epam.task_1.stage_1.exceptions.CouldNotFindFileException;
import by.epam.task_1.stage_1.exceptions.IOTroubleExceptoion;

import by.epam.task_1.stage_1.utils.Sorter;
import by.epam.task_1.stage_1.file_interactors.FileParser;
import by.epam.task_1.stage_1.stream_utils.ArrayStreamStatistics;

public class Task {

	public static void main(String[] args) {
		
		File file = new File("resources\\numbers.txt");
		double[] array;
		try (FileParser parser = new FileParser()) {
			parser.setFile(file);
			while ((array = parser.getNextArray()) != null) {
				System.out.println(ArrayStreamStatistics.max(array));
			}
		} catch (CouldNotFindFileException e) {
			e.printStackTrace();
		} catch (IOTroubleExceptoion e1) {
			e1.printStackTrace();
		} catch (CanNotCloseFileException e2) {
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
