package service;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    private ResourceBundle rb = ResourceBundle.getBundle("strings", Locale.getDefault());

    public void setLocale(Locale locale) {
        rb = ResourceBundle.getBundle("strings", locale);
    }

    public String get(String key) {
        return rb.getString(key);
    }
}
