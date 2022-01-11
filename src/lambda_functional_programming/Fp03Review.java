package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp03Review {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        
        printInUpperCases01(l);
        System.out.println();
        printElementsSortedByLength(l);
        System.out.println();
        printElementsReversedSortedByLength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthFirstThenSortedByInitial(l);
        System.out.println();
     //   printRemoveIfStartingWithAEndingWithN01(l);
        System.out.println();
        
        removeIfLengthIsBetween8And10EndingWithO(l);

	}
	
	//1) Create a method to print all list elements in uppercase
			//1.Way:
//	public static void printInUpperCases01(List<String> list)
//	{
//		list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
//	}
	//2.way
	public static void printInUpperCases01(List<String> list)
	{
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
	}

	//2) Create a method to print the elements after ordering according to their lengths
	public static void printElementsSortedByLength(List<String> list) {
		list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//)3 Create a method to print the elements after ordering according to their lengths(In reverse order)
	public static void printElementsReversedSortedByLength(List<String> list) 
	{
		list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	 //4) Create a method to sort the distinct elements by using their last characters
	public static void printDistinctSortedByLastChar(List<String> list) {	
		list.stream().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//5) Create a method to sort the elements according to their lengths then according to their first character
	public static void printSortedByLengthFirstThenSortedByInitial(List<String> list) {	
		
		list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
//	//7) Remove the elements if the element is starting with �A�, �a� or ending with �N�, �n�	
//	//1.Way:
//	public static void printRemoveIfStartingWithAEndingWithN01(List<String> list) {	
//		
//		Predicate<String> checkcondition= t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n");
//        list.removeIf(t->checkcondition.test(t));
//        System.out.println(list);
	//}
	
	//8)Remove the elements if the length is between 8 and 10 or ending with 'o'
	
	public static void removeIfLengthIsBetween8And10EndingWithO(List<String> list) {
		Predicate<String>checkCondition= t->(t.length()>=8&&t.length()<=10)||t.endsWith("o");
		
		list.removeIf(t->checkCondition.test(t));
		System.out.println(list);
	}

	}
