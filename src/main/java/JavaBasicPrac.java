import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaBasicPrac {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "ab", "abc", "bcd","bbf");
        String s = list.stream().map(x -> x + "ufo").reduce((a, b) -> a + b).get();
        predicate(list, x -> x.startsWith("b"));
    }

    public static void predicate(List<String> input, Predicate<String> condition) {
        input.stream().filter(condition).forEach(System.out::println);
    }

    public class Test {
    }

    public static class Test2 {
        public static int a;

        public Test2() {
            a = 5;
        }
    }
}
