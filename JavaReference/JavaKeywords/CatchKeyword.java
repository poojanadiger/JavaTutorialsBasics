package JavaKeywords;

public class CatchKeyword {
 public static void main(String[] args) {
	 try {
		 int[] myNumbers = {1,2,3};
		 System.out.println(myNumbers[10]);
	 }
	 catch(Exception e) {
		 System.out.println("Something went wrong");
	 }
  }
}

//The catch keyword catches exceptions generated by try statements.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the tyr block.
