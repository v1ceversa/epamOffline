package by.epam.task_1.stage_1;

import java.util.Arrays;
import java.util.Random;

import by.epam.task_1.stage_1.utils.Sorter;

public class Task {

	public static void main(String[] args) {
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
