
public class TestString {

	public static void main(String[] args) {
		
		String myString = "This is a test string for the String class.";
		
		System.out.println( myString.charAt(3) );
		//myString.concat(" Additional string.");
		System.out.println(myString);
		System.out.println("The hashcode is "+myString.hashCode() );
		System.out.println("The index of char a is: " +myString.indexOf('a') );
	}

}
