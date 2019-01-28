package ch1.caelum.java.basics;

import ch1.caelum.java.basics.model.A;

/**
 * @author Mariana Azevedo
 * @since 27/01/2019
 * 
 * Choose the appropriate option when attempting to compile and run the Test class. 
 * File in the current directory:
 * 
 * import model.A;
 * class Test{
 * 	 public static void main(String[] args){
 *       new A("guilherme").print();
 *   } 
 * }
 * 
 * package model;
 * 
 * class A {
 * 	 private String name;
 *   A(String name){
 *       this.name = name;
 *   }
 *   public void print(){
 *       System.out.println(name);
 *   }    
 * }
 * 
 * a) Does not compile: error in class Test. (x)
 * b) Does not compile: error in class A.
 * c) Execution error: main method.
 * d) Runs and prints "Guilherme".
 * 
 */
public class Question11 {

	public static void main(String[] args) {
		//new A("guilherme").print();
		new A();
	}
}