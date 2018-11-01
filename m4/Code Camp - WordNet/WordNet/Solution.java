import java.util.Scanner;
public class Solution {
	public static void main(String[] args) { 
          In scan = new In();
		  String synsetfilename = scan.readString();
		  String hypernymfilename = scan.readString();
		  String implementationType = scan.readString();
		  if(implementationType.equals("Graph")) {
		  	  WordNet wordnet = new WordNet(synsetfilename,hypernymfilename);
		  } else { 

		  }
}
}