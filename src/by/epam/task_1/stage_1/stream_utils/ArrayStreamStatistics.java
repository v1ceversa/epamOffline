package by.epam.task_1.stage_1.stream_utils;

import java.util.stream.DoubleStream;

public class ArrayStreamStatistics {
	public static Double min(double[] array) {
		
		return DoubleStream.of(array).summaryStatistics().getMin();
	}

	public static Double max(double[] array) {
		return DoubleStream.of(array).summaryStatistics().getMax();
	}

	public static Double average(double[] array) {
		return DoubleStream.of(array).summaryStatistics().getAverage();
	}

	public static Double sum(double[] array) {
		return DoubleStream.of(array).summaryStatistics().getSum();
	}

}
