package service.specification.character_related;

import java.util.function.Predicate;

public abstract class CharacterSpecification implements Predicate<Character> {
    private boolean couldBeTested(Character character) {
        return character != null;
    }

    @Override
    public boolean test(Character character) {
        return couldBeTested(character) && check(character);
    }

    abstract boolean check(Character character);
}
