package Codes;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;
public class Formatting {
    private Locale locale;
    public Formatting(Locale locale){
        this.locale = locale;
    }
    public String doDateFormat(){
        Date date = new Date(); //System current date
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,locale);
        return df.format(date);
    }
    public String doCurrencyFormat(double val){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(val);
    }
}
