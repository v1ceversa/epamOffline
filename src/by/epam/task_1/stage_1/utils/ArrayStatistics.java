package by.epam.task_1.stage_1.utils;

public class ArrayStatistics {

	public static <T extends Comparable<T>> T min(T[] arr) {
		T min = arr[0];
		for (T el : arr) {
			if (min.compareTo(el) > 0) {
				min = el;
			}
		}
		return min;
	}

	public static <T extends Comparable<T>> T max(T[] arr) {
		T max = arr[0];
		for (T el : arr) {
			if (max.compareTo(el) < 0) {
				max = el;
			}
		}
		return max;
	}

	public static <T extends Number> Double sumOfElments(T[] arr) {
		double sum = 0;
		for (T el : arr) {
			sum += el.doubleValue();
		}
		return sum;
	}

	public static <T extends Number> Double averege(T[] arr) {
		return sumOfElments(arr) / arr.length;
	}

}
