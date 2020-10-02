package classroom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private final static String CLASS_REGEX = "^[CAP]{1}+[0-9]{2,5}+[GHIKLM]$";
    private static Pattern pattern;
    private Matcher matcher;

    public ClassExample() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
