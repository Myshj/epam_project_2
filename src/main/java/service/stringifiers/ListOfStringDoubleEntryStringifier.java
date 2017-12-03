package service.stringifiers;

import java.util.List;
import java.util.Map;

public class ListOfStringDoubleEntryStringifier {
    public String convert(List<Map.Entry<String, Double>> es) {
        StringBuilder sb = new StringBuilder();
        es.forEach(
                entry -> {
                    sb.append(entry.toString());
                    sb.append("\n");
                }
        );
        return sb.toString();
    }
}
