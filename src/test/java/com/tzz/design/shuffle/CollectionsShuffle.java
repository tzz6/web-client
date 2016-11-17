package com.tzz.design.shuffle;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

import org.junit.Test;
/**
 * Collections随机排序
 *
 */
public class CollectionsShuffle {

	private static Random r;
	private static final int SHUFFLE_THRESHOLD = 5;
	
	public static void shuffle(List<?> list) {
		if (r == null) {
			r = new Random();
		}
		shuffle(list, r);
	}
	
	
	public static void shuffle(List<?> list, Random rnd) {
		int size = list.size();
		if (size < SHUFFLE_THRESHOLD || list instanceof RandomAccess) {
			for (int i = size; i > 1; i--)
				swap(list, i - 1, rnd.nextInt(i));
		} else {
			Object arr[] = list.toArray();
			
			for (int i = size; i > 1; i--)
				swap(arr, i - 1, rnd.nextInt(i));
			
			ListIterator it = list.listIterator();
			for (int i = 0; i < arr.length; i++) {
				it.next();
				it.set(arr[i]);
			}
		}
	}
	
	public static void swap(List<?> list, int i, int j) {
		final List l = list;
		l.set(i, l.set(j, l.get(i)));
	}
	
	private static void swap(Object[] arr, int i, int j) {
		Object tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	
	//初始化List
	public List<Integer> initList(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		return list;
	}
	
	//测试Collections随机排序
	@Test
	public void testShuffle(){
		List<Integer> list = initList();
		shuffle(list, new Random());
		for (Integer value : list) {
			System.out.println(value);
		}
	}

}
