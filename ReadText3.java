import java.io.*;

class ReadText3 {
    public static void main(String[] args) {
        try(FileReader in = new FileReader(args[0])) {  // tryに続けてオープン処理を書く。
            int c;
            String s = new String();
            while((c = in.read()) != -1)
                s = s + (char)c;
            System.out.print(s);
        } catch (IOException ie) {
            System.out.println("ファイルがありません。");
        } catch (Exception e) {
            System.out.println("コマンドライン引数がありません。");
        }
    }                                                   // 例外処理を抜ける時に自動的にクローズされるため、close()処理は必要ない。
}