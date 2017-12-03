package models;

import service.string_converters.PhraseByWordsSplitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phrase {
    private final String string;
    private final List<Word> words;

    public Phrase(String string) {
        this.string = string;
        words = Collections.unmodifiableList(
                new ArrayList<Word>() {{
                    new PhraseByWordsSplitter().convert(string).forEach(
                            s -> add(new Word(s))
                    );
                }}
        );
    }

    public String getString() {
        return string;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return string;
    }
}
