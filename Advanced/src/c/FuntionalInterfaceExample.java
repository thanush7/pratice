package c;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class FuntionalInterfaceExample {

	public static void main(String[] args) {
		//sum of integer
		int sum=IntStream.range(1,3).sum();
		System.out.println(sum);
		//---------------------------------------------
		
		List<Integer> list=Arrays.asList(1,2,3,3,4,4);
		list.stream().distinct().forEach(System.out::print);
		
		//====================================================
		List<Integer> list1=Arrays.asList(1,2,3,3,4,4);
		list1.stream();
		
		
		

	}
	
	

}
