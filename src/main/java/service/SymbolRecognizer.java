package service;

import models.SymbolTrait;
import service.specification.character_related.*;

import java.util.*;

public class SymbolRecognizer {
    private Map<CharacterSpecification, SymbolTrait> specifications = Collections.unmodifiableMap(
            new HashMap<CharacterSpecification, SymbolTrait>() {{
                put(new IsConsonant(), SymbolTrait.CONSONANT);
                put(new IsPunctuation(), SymbolTrait.PUNCTUATION);
                put(new IsVowel(), SymbolTrait.VOWEL);
                put(new IsWordPartSeparator(), SymbolTrait.WORD_PART_SEPARATOR);
            }}
    );

    public Set<SymbolTrait> specify(Character character) {
        return Collections.unmodifiableSet(
                new HashSet<SymbolTrait>() {{
                    specifications.forEach((key, value) -> {
                        if (key.test(character)) {
                            add(value);
                        }
                    });
                    if (isEmpty()) {
                        add(SymbolTrait.UNRECOGNIZED);
                    }
                }}
        );
    }
}
