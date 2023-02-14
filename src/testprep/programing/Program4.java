package testprep.programing;

import java.util.LinkedHashSet;

public class Program4 {
	public static void main(String[] args) {
		LinkedHashSet res=new LinkedHashSet();
		res.add("Home");
		res.add(null);
		res.add(55);
		res.add(10.45);
		res.add(55.78);
		res.add(99.33);
		System.out.println(res);
		System.out.println(res.remove(55));
		System.out.println(res.contains(null));
		System.out.println("tree");
		for( Object ob : res)
		{
			System.out.println(ob);
		}
	}

}
