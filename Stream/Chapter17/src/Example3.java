import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIAN",
                "THE LAW"
        );
        //List <String> s1 =words.stream()
                //.collect(Collectors.toList())
        String s1 = words.stream()
                        .collect(Collectors.joining(",","a","")).toString();

        System.out.println(s1);
    }
}
