import java.io.*;

class NumberGame {
    public static void main(String[] args) {
        try {
            BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
            int a, b = 7;
            System.out.println("名前を入力してください。");
            String name = in.readLine();
            System.out.println("数当てクイズ！0から9の数字を入力してください。");
            String c = in.readLine();
            a = Integer.parseInt(c);  //Stringクラスの引数をint型に変換
            while(a != b) {
                if((a == b-1) || (a == b+1))
                    System.out.println("惜しい！");
                else if(a > b+1)
                    System.out.println("もっと小さい数です。");
                else if(a < b-1)
                    System.out.println("もっと大きい数です。");
                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("正解！" + name + "さん、おめでとう！");
        } catch(Exception ie) {
            System.out.println("エラーです。");
        }
    }
}