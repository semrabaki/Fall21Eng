package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.jcp.xml.dsig.internal.dom.Utils;

/*
 1)Lampba is functional prgramming, we started to use lambda after Java8
 2) Funtional prgramming focuses on the what to do but Structural programmming spends time on "How to do"
 3)Functional Programming can be used just with Collections and Arrays
 4)WE can not use Functional programming in Maps directly but if you convert Maps to SEts by using
 entrySey() method then you can use Functional Poragmming
 */

public class Fp01 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        
        printElementStructured(l);
        printElementsFuntional(l);
        printEvenElementStructured(l);
        printEvenElementFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
       printCubeOfDistinctElements(l);
      System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
       productOfCubesOfDistinctEvenElements(l);
       System.out.println();
        getMaxElement01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        getMinGreaterThanSeven01(l);
        System.out.println();
      getMinGreaterThanSeven02(l);
        System.out.println();
        getMinGreaterThanSeven03(l);
        getHalfOfDistinctElementsInReversedOrder(l);
        
        
        
    
	}  
	  //1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Structured)
        public static void printElementStructured( List<Integer>list)
        {
        	for(Integer w:list)
        	{
        		System.out.print(w+" ");
        	}
        	System.out.println();
        }
        
        //1)Create a method to print the list elements on the console in the same line with a space 
    	//  between two consecutive elements.(Functional)
        
        public static void printElementsFuntional(List<Integer>list)
        {
        	list.stream().forEach(t->System.out.print(t+" "));
        	System.out.println();
        }
        
      //2)Create a method to print the even list elements on the console in the same line with a space 
    	//  between two consecutive elements.(Structured)
        
        public static void printEvenElementStructured(List<Integer>list)
        {
        	for(Integer w:list) {
        		if(w%2==0)
        		{
        			System.out.print(w+" ");
        		}
        	}
        	System.out.println();
        }
        
      //2)Create a method to print the even list elements on the console in the same line with a space 
    	//  between two consecutive elements.(Functional)
        public static void printEvenElementFunctional(List<Integer>list)
        {
        	list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
        }
        
        
        //3)Create a method to print the square of odd list elements on the console in the same line with a 
    	//  space between two consecutive elements.(Functional)
        
        public static void printSquareOfOddElements(List<Integer>list)
        {
        	list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t+" "));
        }
        
        //4)Create a method to print the cube of distinct(it means just use repeated elements once) odd list elements on the console in the same line 
    	//  with a space between two consecutive elements.
        
        public static void printCubeOfDistinctElements(List<Integer> list) {		
    		list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t + " "));	
    	}
        
      //5)Create a method to calculate the sum of the squares of distinct even elements
    	public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {			
    		Integer sum = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);		
    		System.out.println(sum);		
    	}
    	
    	//6)Create a method to calculate the product of the cubes of distinct even elements
    	public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {		
    		Integer product = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);		
    		System.out.println(product);		
    	}

	    

    //7)Create a method to find the maximum value from the list elements

	//1.Way:
	public static void getMaxElement01(List<Integer> list) {		
		Integer maxElement = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);		
		System.out.println(maxElement);		
	}
	
	//2.Way:
	public static void getMaxElement02(List<Integer> list) {		
		Integer maxElement = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);	// it means when you look at the elements give me the last one
		System.out.println(maxElement);	
	
	}
	
	//Homework
		//8)Create a method to find the minimum value from the list elements(In 2 ways)
	
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
		//1.Way:
		public static void getMinGreaterThanSeven01(List<Integer> list) {
			
			Integer minGreaterThanSeven = list.
					                          stream().
					                          distinct().
					                          filter(t->t>7).
					                          filter(t->t%2==0).
					                          reduce(Integer.MAX_VALUE, (t,u)-> t>u ? u : t);
			
			System.out.println(minGreaterThanSeven);
			
		}
		
		//2.Way:
		public static void getMinGreaterThanSeven02(List<Integer> list) {
			
			Integer minGreaterThanSeven = list.
					                          stream().
					                          distinct().
					                          filter(t->t>7).
					                          filter(t->t%2==0).
					                          sorted(Comparator.reverseOrder()).
					                          reduce(Integer.MAX_VALUE, (t,u)-> u);
			
			System.out.println(minGreaterThanSeven);
			
		}
		
		//3.way
		public static void getMinGreaterThanSeven03(List<Integer> list) {
		      
			Integer minGreaterThanSeven= list.stream().
											     distinct().
											     filter(t->t>7).
											     filter(t->t%2==0).
											     sorted().
											     findFirst().get();
			System.out.println(minGreaterThanSeven);
		}
		
	

		//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
		public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
	
					List<Double> result = list.
											stream().
											distinct().
											filter(t->t>5).
											map(t->t/2.0).
											sorted(Comparator.reverseOrder()).
											collect(Collectors.toList());
					
					System.out.println(result);
		}
}
