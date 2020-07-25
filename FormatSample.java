import java.util.*;
class FormatSample {
    public static void main(String[] args) {
        Date c = new Date();
        System.out.printf("%tY年 %tm月 %td日 \n", c, c, c);
        System.out.printf("%tH 時 %tM 分 %tS 秒 \n", c, c, c);
    }
}