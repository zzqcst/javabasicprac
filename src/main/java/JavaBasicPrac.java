import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaBasicPrac {
    public static void main(String[] args) {
        Demo d1 = new Demo(1);
        System.out.println(d1.a);
        swap(d1);
        System.out.println(d1.a);
    }

    public static void swap(Demo d1) {
        d1.a = 23;
        d1 = new Demo(12);
    }
}

class Demo {
    int a;

    public Demo(int a) {
        this.a = a;
    }
}