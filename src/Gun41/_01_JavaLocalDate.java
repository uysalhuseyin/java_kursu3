package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece gun,ay,yil bilgisi tutar.
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println(" = " +tarih.getYear());
        System.out.println("tarih = " + tarih.getMonth());
        System.out.println("tarih = " + tarih.getDayOfWeek());
        System.out.println("tarih = " + tarih.getEra());
        System.out.println("tarih = " + tarih.format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println("tarih = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("tarih = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("tarih = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));


       Locale[] t=Locale.getAvailableLocales();
       for (Locale l:t){
           if (l.getDisplayCountry().toLowerCase().contains("ice"));
           System.out.println(l.getDisplayCountry()+" "+l+l.getDisplayLanguage());
       }




    }
}
