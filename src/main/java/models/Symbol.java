package models;

import service.SymbolRecognizer;

import java.util.Set;

public class Symbol {
    private final Character character;
    private final Set<SymbolTrait> traits;

    public Symbol(Character character) {
        this.character = character;
        traits = new SymbolRecognizer().specify(character);
    }

    public Character getCharacter() {
        return character;
    }

    public Set<SymbolTrait> getTraits() {
        return traits;
    }

    @Override
    public String toString() {
        return "" + character;
    }
}
