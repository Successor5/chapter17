import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example4 {
    public static Map<String, Integer> sortMapEntries(Map<String, Integer> map) {
        Map<String, Integer> result = new TreeMap<>(Comparator.naturalOrder());
        Comparator<? super Map.Entry<String, Integer>> t1;
        //map.entrySet().stream().sorted((t1,t2))->{
        //    if (t1.getValue()> t2.getValue())return 1;
        return result;
    }
}
