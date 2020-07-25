import java.util.*;
class Time {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        System.out.println(date);
        System.out.println(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH)+1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日" + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
}