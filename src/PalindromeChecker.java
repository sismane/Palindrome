import java.util.Locale;

public class PalindromeChecker {

	public static boolean checkIfStringPalindrome(String text){
        
        //texti 2 ye bol,2. kısmı reverse yap, karsilastir
		text = text.toLowerCase(new Locale("tr","TR"));//bu kisim calisiyo!
		text = text.replaceAll("[^\\s\\p{L}0-9]", "");//arazi küçük iz ara
		text = text.replaceAll("\\p{Punct}","").toLowerCase(new Locale("tr"));
		text = text.replaceAll("\\s","");
        String firstPart = text.substring(0,(text.length()/2)+1);
        String secondPart = text.substring((text.length()/2),text.length());
        StringBuilder builder = new StringBuilder(secondPart);
        String reversedStr = builder.reverse().toString().
        		replaceAll("[^\\s\\p{L}0-9]", "").
        		replaceAll("\\p{Punct}","");
        
        firstPart = firstPart.replaceAll("[^\\s\\p{L}0-9]", "").replaceAll("\\p{Punct}","");
        
        if(reversedStr.equals(firstPart)) {
        	return true;
        }
        
        return false;
    }
}
