package models;

import service.string_converters.TextByPhraseSplitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text {
    private final String string;
    private final List<Phrase> phrases;

    public Text(String string) {
        this.string = string;
        phrases = Collections.unmodifiableList(
                new ArrayList<Phrase>() {{
                    new TextByPhraseSplitter().convert(string).forEach(
                            s -> add(new Phrase(s))
                    );
                }}
        );
    }

    public String getString() {
        return string;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }
}
