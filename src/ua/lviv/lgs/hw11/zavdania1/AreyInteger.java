package ua.lviv.lgs.hw11.zavdania1;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class AreyInteger {

	public static void main(String[] args) {
		Random ran = new Random();
		Integer [] ar = {ran.nextInt(), ran.nextInt(), ran.nextInt(),
							ran.nextInt(), ran.nextInt(), ran.nextInt(),
							ran.nextInt(), ran.nextInt(), ran.nextInt()};
		Arrays.sort(ar);
		System.out.println(Arrays.deepToString(ar));
		Arrays.sort(ar, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(ar));

	}
	
}
