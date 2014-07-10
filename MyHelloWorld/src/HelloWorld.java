import java.util.ArrayList;
import java.util.Iterator;

public class HelloWorld {	
	Integer x;
	HelloWorld() {
		x=new Integer(277);
		System.out.println(x);
	}
	public static void main (String[] arg){
		Integer h1=new Integer(127);
		Integer h2=new Integer(127);
		h1++;
		h2++;
		System.out.println(h1==h2);
		
		Integer x1=new Integer(10);
		Integer x2=new Integer(11);
		x2-=1;
		//x2--;
		System.out.println(x1==x2);
		
		Integer y1=new Integer(10);
		Integer y2=new Integer(10);
		System.out.println(y1==y2);
		
		int a1=223;
		Integer a=new Integer(223);
		Integer a2=new Integer(222);
		a2+=1;
		System.out.println(a1==a2);
		
		System.out.println(a==a2);
		
		System.out.println(a==a1);
		char c1 = 064770;
		char c2 = '\uface';
		
		String s1="a";
		String s2="b";
		System.out.println(s1.compareTo(s2));
		
		System.out.println("***************");
		ArrayList t = new ArrayList();
		t.add(1);
		t.add(2);
		ArrayList t2;
		t2=(ArrayList)t.clone();	
		System.out.println(t2);
		t2.set(0,11);
		System.out.println(t2);
		System.out.println(t);
		
		System.out.println("***************");
		Short p1=127;
		Short p2=127;
		System.out.println(p1==p2);
		
		Long l1=127l;
		Long l2=127l;
		System.out.println(l1==l2);
		
		Byte d1 = 127;
		Byte d2 = 127;
		d1++;
		d2++;
		
		System.out.println((d1==d2) + " " + d1);
		System.out.println("***************");
		String i = "abcdef";
		System.out.println(i.substring(1, 4));
		
		StringBuilder q1 = new StringBuilder("qwerty");
		StringBuilder q2 = new StringBuilder(q1.subSequence(1, 4));
		System.out.println(q2);
		System.out.println(q1);
		System.out.println("***************");
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator iter = list.iterator();
		
		ArrayList list2 = (ArrayList)list.clone();
		list2.set(1, 5);
		System.out.println(list);
		System.out.println(list2);
		
	}	
}

class A extends HelloWorld {
	A(){
		x++;
		System.out.println("Class A"+x);
	}
}

