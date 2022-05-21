package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		v.add("Sarika");
		v.addElement("Raj");
		v.add("Rani");
		v.add("Rani");
		
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
