package com.ztt.colletion;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
	  Collection coll = new ArrayList();
	  show(coll);
	  System.out.println("------------");
	   Collection c1 = new ArrayList();
	   Collection c2 = new ArrayList();
	   show(c1,c2);
	}
	

	private static void show(Collection c1, Collection c2) {
		//元素添加
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		//删除c1中与c2相同的元素
	c1.removeAll(c2);
	  System.out.println("c1=====:" + c1);
	  System.out.println("c2=====:" + c2);
	//  System.out.println("b:"+b);
		 boolean c=c1.contains(c2);
		 System.out.println("c:"+c);
		 
		 
	 boolean d= c1.retainAll(c2);
	 System.out.println("c1、c2的交际"+c1);
	 System.out.println("c1:"+c1);
	 System.out.println("c2:"+c2);
		
	}


	private static void show(Collection coll) {
		// 添加元素 add
		coll.add("ab1");
		coll.add("ab2");
		coll.add("ab3");
		System.out.println("coll:"+coll);
		//删除元素 remove
		coll.remove("ab2");//改变容器的长度
		System.out.println("coll:"+coll);
		//集合的清空
		coll.clear();
		System.out.println(coll.contains("ab1"));
		
		
		
	}

}
