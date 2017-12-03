package service.string_converters;


import service.ResourceManager;

public class Trimmer implements StringConverter<String> {
    @Override
    public String convert(String string) {
        return string.trim().replaceAll(
                ResourceManager.INSTANCE.get("sequenceOfWhitespaces"),
                " "
        );
    }
}
