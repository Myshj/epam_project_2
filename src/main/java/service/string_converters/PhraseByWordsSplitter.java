package service.string_converters;

import service.ResourceManager;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhraseByWordsSplitter extends TrimmingStringConverter<List<String>> {

    @Override
    List<String> convertCleaned(String string) {
        return new ArrayList<String>() {{
            Matcher m = Pattern.compile(
                    ResourceManager.INSTANCE.get("word.regex")
            ).matcher(string);
            while (m.find()) {
                add(m.group());
            }
        }};
    }
}
