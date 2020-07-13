import java.io.*;

class Hello implements Serializable {    // Helloクラス
    void check() {
        System.out.println("こんにちは");
    }
}                                        // シリアライズ可能にする
public class SerialStream {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.check();                   //　シリアライズ前の内容チェック
        try {
            FileOutputStream outFile = new FileOutputStream("serialcheck.dat");  // FileOutputStream シリアライズしたデータを書き出すためのテキストファイルのオブジェクトを作成　// シリアライズ始
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(hello);  // テキストファイルにシリアライズしたデータを書き出す
            outObject.close();
            outFile.close();  // シリアライズ終

            FileInputStream inFile = new FileInputStream("serialcheck.dat");  // FileInputStream シリアライズしたデータを読み込むためのオブジェクトを作成  // デシリアライズ始
            ObjectInputStream inObject = new ObjectInputStream(inFile);
            Hello chkHello = (Hello)inObject.readObject();  // テキストファイルからオブジェクトを読み込む
            inObject.close();
            inFile.close();  // デシリアライズ終

            chkHello.check();  // デシリアライズ後の内容チェック
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
    }
}