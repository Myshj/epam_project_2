package service.string_converters;


import service.ResourceManager;

import java.util.Arrays;
import java.util.List;

public class TextByPhraseSplitter extends TrimmingStringConverter<List<String>> {

    @Override
    List<String> convertCleaned(String string) {
        return Arrays.asList(
                string.split(
                        ResourceManager.INSTANCE.get("phraseSeparators.regex")
                )
        );
    }
}
