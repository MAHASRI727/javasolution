// Save as PatternMatchSwitch.java
public class PatternMatchSwitch {
    public static void main(String[] args) {
        testSwitch(563);
        testSwitch("Geographic");
        testSwitch(53.97);
        testSwitch(true);
    }

    // Enhanced switch using pattern matching
    public static void testSwitch(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
