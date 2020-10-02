package classroom;

public class ClassExampleTest {
    private static ClassExample classExample;

    private final static String[] validClass = new String[]{"C0318G"};
    private final static String[] invalidClass = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String c : validClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Class is " + c + " is valid: " + isvalid);
        }
        for (String c : invalidClass) {
            boolean isvalid = classExample.validate(c);
            System.out.println("Class is " + c + " is valid: " + isvalid);
        }
    }
}
