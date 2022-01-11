package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
How to count the number of occurences of the letters(al[ah=betical characters) in a sentence. 
For example: "Java is easy. Type codes to learn Java.To eran money learn Java."
Java=3, is=1, easy=1, Type=1,..., leanr=2...
*/

public class HashMap02 {

	public static void main(String[] args) {
		
		String str="Java is easy. Type codes codes to learn Java. To earn money learn Java.";
		System.out.println(str);
	
	    str= str.replaceAll("[^a-zA-Z]", ""); //str=str.replaceAll("\\p{Punct}","").toLowerCase(); str=str.replaceAll("\\s","");
		System.out.println(str);
		
		String letters[] = str.split("");
		System.out.println(Arrays.toString(letters));//[j, a, v, a, i, s, e, a, s, y, t, y, p, e, c, o, d, e, s, c, o, d, e, s, t, o, l, e, a, r, n, j, a, v, a, t, o, e, a, r, n, m, o, n, e, y, l, e, a, r, n, j, a, v, a]

		HashMap<String,Integer>resultMap= new HashMap<>();
		
		for(String w: letters)
		{
			Integer numOfOccurences= resultMap.get(w);
			
			if(numOfOccurences==null)
			{
				resultMap.put(w,1);
			}else
			{
				resultMap.put(w, numOfOccurences+1);
			}
			
		}
		
		System.out.println(resultMap);//{a=10, c=2, d=2, e=8, i=1, J=3, l=2, m=1, n=4, o=5, p=1, r=3, s=4, T=2, t=1, v=3, y=3}


	}

}
