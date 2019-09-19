package by.epam.task_1.stage_1.stream_utils;


import java.util.List;
import java.util.stream.DoubleStream;

public class ArrayStreamStatistics {
	public static Double min(List<Double> array) {
		return DoubleStream.of(new double[array.size()]).summaryStatistics().getMin();
	}

	public static Double max(List<Double> array) {
		return DoubleStream.of(new double[array.size()]).summaryStatistics().getMax();
	}

	public static Double average(List<Double> array) {
		return DoubleStream.of(new double[array.size()]).summaryStatistics().getAverage();
	}

	public static Double sum(List<Double> array) {
		return DoubleStream.of(new double[array.size()]).summaryStatistics().getSum();
	}

}
