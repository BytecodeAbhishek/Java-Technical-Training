package Codes;

import java.util.ResourceBundle;
import java.util.Locale;
public class MessageReader {
    Locale locale ;
    ResourceBundle rb;
    public MessageReader(String lang , String country){
    locale = new Locale(lang,country);
    rb = ResourceBundle.getBundle("messages",locale);
}
public String getMessage(String key){
    return rb.getString(key);
}
}
