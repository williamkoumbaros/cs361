/**
 * 
 */
package reflection;
import circle.ColoredCircle;

/**
 * @author William koumbaros 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");
		String chain="";
		Class<?> c = o.getClass();

		while (c != null) {
		    if (chain != "") {
		        chain += " inherits from ";
		    }

		    chain += c.getName();
		    c = c.getSuperclass();
		}
		System.out.println(chain);

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for(int i=0; i < m.length ;i++)
		{
			System.out.println(m[i].getName());
			System.out.println("\n");
		}
		
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		String s="";
		ColoredCircle c = new ColoredCircle();
		
		// Demonstration of the methods on an objet of type String
        // TODO To complete
		System.out.println("string inheritance chain");
		r.inheritanceChain(s);
		System.out.println("string methods");
		r.listMethods(s);
		
		
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		System.out.println("colored circle inheritance chain");
		r.inheritanceChain(c);
		System.out.println("colored circle methods");
		r.listMethods(c);
		
	}

}
