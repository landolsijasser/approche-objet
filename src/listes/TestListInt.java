package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		System.out.println(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			int max = 0;
			if (list.get(i) > max)
				max = list.get(i);

		}
		System.out.println();
		int min = 0;
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) < min)
				min = list.get(i);
		
		}
	 
		

	}
}