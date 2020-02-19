package ua.lviv.lgs.hw11.zavdania2;

import java.util.Random;

public class RandomZ {
	
	public static int ramdomZnach(int min, int max){
		if(min>=max){
			throw new IllegalArgumentException("Значення min більше рівне значенню max!");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
