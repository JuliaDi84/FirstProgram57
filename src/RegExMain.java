import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMain {

    public static void main(String[] args) {
        String regex = "a*b";
        String toTest = "aaabx";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(toTest);
        System.out.println(matcher.lookingAt());
    }
}
