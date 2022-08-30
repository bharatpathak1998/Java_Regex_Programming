import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodePattern {

    public static void isValidPinCode(String pincode) {

        Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\s?[0-9]{3}$");
        Matcher matcher = pattern.matcher(pincode);

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Valid -> " + pincode);
        } else {
            System.out.println("Invalid -> " + pincode);
        }
    }

    public static void main(String[] args) {

        String[] array = {"400088", "A400088", "400088B", "400 088"};

        for (String pincode : array) {
            isValidPinCode(pincode);
        }
    }
}
