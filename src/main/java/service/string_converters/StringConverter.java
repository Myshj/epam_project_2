package service.string_converters;

public interface StringConverter<T> {
    T convert(String string);
}
