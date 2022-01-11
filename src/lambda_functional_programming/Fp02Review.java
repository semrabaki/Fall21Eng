package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02Review {
	
	public static void main(String []args)
	{
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
	    
	    printElements(l);
	    System.out.println();
	    printEvenElements(l);
	    System.out.println();
	    printSquareOfOddElements(l);
	    System.out.println();
	    printCudeOfOddElements(l);
	    System.out.println();
	    printSumOfSquaresOfDistinctEvenElement(l);
	    System.out.println();
	    printProductOfCubesOfDistinctEvenElement(l);
	    System.out.println();
	    getMaxElement(l);
	    System.out.println();
	    getMinElement(l);
	    System.out.println();
	    getMinGreaterThanSeven01(l);
	    System.out.println();
	    getHalfOfDistinctElementsInReversedOrder(l);

	    
	}
	
	
	//1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Structured)
    
    public static void printElements(List list)
    {
    	list.stream().forEach(Utils::printInTheSameLineWithSpace);
   
    	
    }
    
    
  //2)Create a method to print the even list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional)
    
     public static void printEvenElements(List<Integer> list)
     {
    	 list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithSpace);
     }
    
    
    //3)Create a method to print the square of odd list elements on the console in the same line with a 
	//  space between two consecutive elements.(Functional)
     
       public static void printSquareOfOddElements(List<Integer>list)
       {
    	   list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithSpace);
       }
    
    
    
  //4)Create a method to print the cube of distinct odd list elements on the console in the same line 
	//  with a space between two consecutive elements.
       
       public static void printCudeOfOddElements(List<Integer>list)
       {
    	   list.stream().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithSpace);
       }
       
     //5)Create a method to calculate the sum of the squares of distinct even elements
       
       public static void printSumOfSquaresOfDistinctEvenElement(List<Integer>list)
       {
    	   int result=list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Math::addExact);
      
            System.out.println(result);
       }
       
       //6)Create a method to calculate the product of the cubes of distinct even elements
       
       public static void printProductOfCubesOfDistinctEvenElement(List<Integer>list)
       {
    	   int result=list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
           System.out.println(result);
       }
     //7)Create a method to find the maximum value from the list elements
   	public static void getMaxElement(List<Integer> list) {		
   	    int max=list.stream().reduce(Integer.MIN_VALUE,Math::max);	
   	    
   	    System.out.println(max);
   	}
   	
   	//8)Create a method to find the minimum value from the list elements
   	public static void getMinElement(List<Integer> list) {			
   		int min=list.stream().reduce(Integer.MAX_VALUE, Math::min);
   		
   		System.out.println(min);
   	}
   	
   	//9)Create a method to find the minimum value which is greater than 7 and even from the list
   	public static void getMinGreaterThanSeven01(List<Integer> list) {		
   		Integer min = list.stream().filter(t->t>7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);		
   		System.out.println(min);			
   	}
   	
   	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
   	public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
   		
   		List<Double> result= list.stream().distinct().filter(t->t>5).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   		System.out.println(result);
   	}
}
