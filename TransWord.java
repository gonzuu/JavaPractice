import java.io.*;

class TransWord {
    public static void main(String[] args) {
        try {
            BufferedReader in =
                new BufferedReader(new FileReader("mydic.txt"));
            String a = args[0];

            String eword, jword = null;
            while((eword = in.readLine()) != null) {
                if(a.equals(eword)) {
                    jword = in.readLine();
                    break;
                }
            }

            if(jword == null)
                System.out.println(a + "はありませんでした。");
            else
                System.out.println(jword);

            in.close();
        } catch (FileNotFoundException e) {  //ファイルが開けなかった場合に生成される例外クラス
            System.out.println("ファイルがありません。");
        } catch (Exception e) {
            System.out.println("コマンドライン引数がありません。");
        }
    }
}