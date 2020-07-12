import java.io.*;

class InOut {
    public static void main(String[] args) {
        try {
            String filename = "file.dat";
            FileOutputStream out = new FileOutputStream(filename);
            FileInputStream file = new FileInputStream(filename);
            InputStreamReader in = new InputStreamReader(file);

            for(byte i = 1; i <= 10; i++) {
                out.write(i);
            }                                // データの書き出し

            int c;
            while((c = in.read()) != -1) {
                System.out.print(c + " ");
            }                                // データの読み込みと表示

            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("ファイルがありません。");
        }
    }
}