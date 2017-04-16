package com.ztt.colletion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[]){
	   Collection coll = new ArrayList();
	   coll.add("abc1");
	   coll.add("abc2");
	   coll.add("abc3");
	   coll.add("abc4");
	   System.out.println("coll:"+coll);
	Iterator it1 = coll.iterator();
	while(it1.hasNext()){
		System.out.println(it1.next());
	}
	for(Iterator it2= coll.iterator();it2.hasNext();){
		System.out.println(it2.next());
	}
	}

}
