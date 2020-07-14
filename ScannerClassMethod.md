## Scannerクラス
キーボード入力機能をサポートするクラスとして、Scannerクラスがある。
#### キーボードからの入力の場合
コンストラクタの引数に、System.in（キーボードからの入力）を指定できる。

```
Scanner sc = new Scanner(System.in);
```
※sc → オブジェクト名。

#### 文字列を入力元に指定する場合
コンストラクタの引数に、対象となる文字列を指定します。

```
String text = "Do you know the muffin man?";
Scanner sc = new Scanner(text);
```
※sc → オブジェクト名。
 (text) → 変数名。

|メソッド名|働き|使い方|
|:--|:--|:--|
|close()|閉じる|Scanner sc = new Scanner(System.in);<br>sc.close();|
|next()|入力値を取り出す|Scanner sc = new Scanner(System.in);<br>String text = sc.next();|
|nextInt()|入力値をint型として取り出す|Scanner sc = new Scanner(System.in);<br>int num = sc.nextInt();|
|hasNext()|次に取得できるStringがあるかを調べる|Scanner sc = new Scanner(System.in);<br>boolean b = sc.hasNext();|
|hasNextInt()|次に取得できるintがあるかを調べる|Scanner sc = new Scanner(System.in);<br>boolean b = sc.hasNextInt();|
|findInLine()|指定したパターンにマッチする値を取得する|String text = "1 pon, 2 hon, 3 bon";<br>Scanner sc = new Scanner(text);<br>sc.findInLine("(\\d+) hon");|