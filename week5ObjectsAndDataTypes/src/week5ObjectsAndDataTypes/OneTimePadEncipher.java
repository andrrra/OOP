package week5ObjectsAndDataTypes;

public class OneTimePadEncipher {

    public static int charToInt(char l) {
      // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
    	if(Character.isUpperCase(l)) return ((int) l)-((int) 'A');
    	else return (int) l-(int) 'a';
    }

    public static char intToChar(int i) {
      // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
      // it should always return lower case char
    	i%=26;
    	return (char) (i+97);
    }

    public static boolean isAlpha(char c) {
      // You do not need to implement this method, but you may find it useful.
    	return Character.isAlphabetic(c);
    }

    public static String encipher(String original, String onetimepad) {
    	String mystring = new String();
    	for(int i=0;i<original.length();i++){
    		char c=original.charAt(i);
    		char d=onetimepad.charAt(i);
      	  	if(c==' ') mystring=mystring+' ';
      	  	else mystring+=intToChar((charToInt(c)+charToInt(d)));
    	}
    	return mystring;
    }
    


    public static void main(String[] args) {
      String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
      System.out.print(ciphertext);
    }

}
