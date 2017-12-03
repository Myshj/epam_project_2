package service.specification.character_related;

import service.ResourceManager;
import service.specification.IsInCollection;
import service.string_converters.ToCharactersSplitter;

abstract class InManagedResource extends CharacterSpecification {

    abstract String resourceName();

    @Override
    boolean check(Character character) {
        return new IsInCollection<>(
                new ToCharactersSplitter().convert(
                        ResourceManager.INSTANCE.get(resourceName())
                )
        ).test(character);
    }
}
