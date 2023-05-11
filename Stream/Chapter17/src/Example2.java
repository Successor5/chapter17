import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIAN",
                "THE LAW"
        );
        //words.stream()
        Stream<Integer> s1 =words.stream()
                .flatMap((word)-> Stream.of(word.length()));
        s1.forEach(System.out::println);
    }
}
