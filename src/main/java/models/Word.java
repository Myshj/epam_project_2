package models;

import service.string_converters.ToCharactersSplitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
    private final String string;
    private final List<Symbol> symbols;

    public Word(String string) {
        this.string = string;
        symbols = Collections.unmodifiableList(
                new ArrayList<Symbol>() {{
                    new ToCharactersSplitter().convert(string).forEach(
                            s -> add(new Symbol(s))
                    );
                }}
        );
    }

    public String getString() {
        return string;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return string;
    }
}
