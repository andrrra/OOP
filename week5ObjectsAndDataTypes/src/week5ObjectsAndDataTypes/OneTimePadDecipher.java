package week5ObjectsAndDataTypes;

public class OneTimePadDecipher {
	public static String decipher(String encipheredText, String onetimepad) {
		String dec=new String();
		for(int i=0;i<encipheredText.length();i++) {
			char c=encipheredText.charAt(i);
			char d=onetimepad.charAt(i);
		 	if(c==' ') dec=dec+' ';
		 	else dec+=OneTimePadEncipher.intToChar(((OneTimePadEncipher.charToInt(c)-OneTimePadEncipher.charToInt(d)+26)));
		}
		return dec.toUpperCase();
	}
		
}
