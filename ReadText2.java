import java.io.*;

class ReadText2 {
    public static void main(String[] args) {
        FileReader in = null;  // tryブロックの中ではスコープ（参照範囲）外になってしまうのでinの宣言をtryの外に出す必要がある。また、nullで初期化しないとエラーになる。
        try {
            in = new FileReader(args[0]);
            int c;
            String s = new String();
            while((c = in.read()) != -1)
                s = s + (char)c;
            System.out.print(s);
        } catch (IOException ie) {
            System.out.println("ファイルがありません。");
        } catch (Exception e) {
            System.out.println("コマンドライン引数がありません。");
        } finally {
            if(in != null) // ファイルが開かれていない場合、inはnullのままなので、チェックする必要がある。
                try {      // close()もtryで括る必要がある。
                    in.close();
                } catch(IOException ie2) {
                    System.out.println("ファイルのcloseに失敗しました。");
                }
        }
    }
}