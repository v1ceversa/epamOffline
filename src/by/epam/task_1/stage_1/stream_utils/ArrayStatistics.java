package by.epam.task_1.stage_1.stream_utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ArrayStatistics {
	public static Double min(List<Double> arr)
	{
		
		Stream<Double> stream = arr.stream();
		return stream.min();
		 
	}
	
	public static <T extends Comparable<T>> T max(T[] arr)
	{
		T max = arr[0];
		for (T el : arr) {
			if(max.compareTo(el) < 0)
			{
				max= el;
			}
		}
		return max;
	}
	
	public static <T extends Number> double sumOfElments(T[] arr) {
		double sum = 0;
		for(T el : arr)
		{
			sum += el.doubleValue();
		}
		return sum;
	}
	
	public static <T extends Number> double avarege(T[] arr) {
		return sumOfElments(arr)/arr.length;
	}
}
