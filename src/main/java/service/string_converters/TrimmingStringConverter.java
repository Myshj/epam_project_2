package service.string_converters;

public abstract class TrimmingStringConverter<T> implements StringConverter {

    @Override
    public T convert(String string) {
        return convertCleaned(new Trimmer().convert(string));
    }

    abstract T convertCleaned(String string);
}
