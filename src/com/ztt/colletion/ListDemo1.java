package com.ztt.colletion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		// Ìí¼ÓÔªËØ
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		ListIterator it1 = list.listIterator();
		while (it1.hasNext()) {
			Object obj = it1.next();
			if (obj.equals("abc2")) {
				it1.add("abc4");
			}
		}
		System.out.println("list:" + list);
	}
}
