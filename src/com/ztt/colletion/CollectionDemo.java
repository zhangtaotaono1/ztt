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
		//Ԫ�����
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
		//ɾ��c1����c2��ͬ��Ԫ��
	c1.removeAll(c2);
	  System.out.println("c1=====:" + c1);
	  System.out.println("c2=====:" + c2);
	//  System.out.println("b:"+b);
		 boolean c=c1.contains(c2);
		 System.out.println("c:"+c);
		 
		 
	 boolean d= c1.retainAll(c2);
	 System.out.println("c1��c2�Ľ���"+c1);
	 System.out.println("c1:"+c1);
	 System.out.println("c2:"+c2);
		
	}


	private static void show(Collection coll) {
		// ���Ԫ�� add
		coll.add("ab1");
		coll.add("ab2");
		coll.add("ab3");
		System.out.println("coll:"+coll);
		//ɾ��Ԫ�� remove
		coll.remove("ab2");//�ı������ĳ���
		System.out.println("coll:"+coll);
		//���ϵ����
		coll.clear();
		System.out.println(coll.contains("ab1"));
		
		
		
	}

}
