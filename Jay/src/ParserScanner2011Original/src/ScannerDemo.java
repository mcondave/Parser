//Mike Conte and Chris Sakai

package ParserScanner2011Original.src;

/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\Mike\\Documents\\Mike\\CS361\\JAY\\Jay\\bin\\GIVEN\\PARSER\\prog2.JAY"; 
	private static int counter = 1;
	private static Token t;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1); 

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			t = ts.nextToken();
			if (t!=null){
			System.out.println("Token " + counter + " - value: '" + t.getValue() + "' type: " + t.getType());
			}
			counter++;
		}
	}
}
