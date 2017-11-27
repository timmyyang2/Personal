package com.java24hours.h8;

public class Benchmark {
	public static void main(String[] arguments){
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 10000;
		long index = 0;
		while(System.currentTimeMillis() <= endTime){
			double x = Math.sqrt(index);
			//long now = System.currentTimeMillis();
			/*if(now > endTime){
				break;
			}*/
			index++;
		}
		System.out.println(index + " loops in 10 sec.");
	}
}
