package day28;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        String myBirthday = "2000/4/27";
        DateFormat df = DateFormat.getDateInstance();
        try {
            Date date = df.parse(myBirthday);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("日期轉換失敗, 錯誤原因: "+ e.getMessage());
        }
    }
}
