package com.ztt.colletion;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String args[]){
       List list=new ArrayList();
      show(list);
	}

	private static void show(List list) {
		//���Ԫ��
		   list.add("abc1");
	       list.add("abc2");
	       list.add("abc3");
	      /* System.out.println("list:"+list);
	       //����Ԫ��
	       list.add(1, "abc2");
	      // list.set(1, "abc8");
	       System.out.println("list+++++++++++"+list);
	       //ɾ��Ԫ��
	       
	       System.out.println("remove:"+list.remove(2));
	       
	       System.out.println("get:"+list.get(0));
	       //��ȡ���б�
	       
	       System.out.println(list.subList(1, 3));*/
	       System.out.println("list:"+list);
	    Iterator it1 = list.iterator();
	    while(it1.hasNext()){
	    	System.out.println(it1.next());
	    	
	    }
	    //list���е�ȡ��Ԫ�ط�ʽ֮һ
	    for(int i=0;i<list.size();i++){
	    	System.out.println("get:"+list.get(i));
	    }
		
	}

}
