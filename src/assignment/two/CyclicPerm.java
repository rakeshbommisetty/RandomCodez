package assignment.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//import ecs.comparison.beans.RuleTypeDataBean;

public class CyclicPerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List d = new ArrayList();
		d.add("rakesh");
		d.add("pega");
		d.add("Hyderabad");
		d.add("India");
		
		List a = new ArrayList();
		a.add("pega");
		a.add("Hyderabad");
		a.add("adsf");
		
		System.out.println(d);
		
		d.removeAll(a);
		
		System.out.println(d);
		System.out.println(a);*/
		
		/*	System.out.println(d.get(0));
		java.util.Vector a = new java.util.Vector();*/
		
	/*	String s = "rakesh###Pega###Hyderabad";
		String[] st = s.split("###");
		
		System.out.println(st[0]);*/
		
		char[] a = {'a','b','c','d','e','f'};
		char[] b = {'f','a','b','c','d','e'};
		boolean aaa= isCyclicPerm(a,b);
		System.out.println(aaa);
		
		

	}
	
	public static boolean isCyclicPerm(char[] s1, char[] s2){
		
		char temp = s2[0];
		int index =0, i=0, indexPoint=-1, length = s1.length, flag=0;
		
		for(char c: s1){
			if(temp==c){
				break;
			}
			index++;
		}
		
		indexPoint = index;
		while(index < length){
			if(s2[i] == s1[index]){
				index ++;
				i++;
				if(index == length && flag == 0){
					index =0;
					length = indexPoint;
					flag =1;
				}
				continue;
			}else 
				return false;
		}
		
		return true;
		
	}

}
