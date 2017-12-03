package service.string_converters;

import java.util.List;
import java.util.stream.Collectors;

public class ToCharactersSplitter extends TrimmingStringConverter<List<Character>> {

    @Override
    List<Character> convertCleaned(String string) {
        return string
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());
    }
}
