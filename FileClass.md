## ファイル操作
#### Fileクラスは、ファイル名そのものを表すと同時に、ファイルやディレクトリを操作するためのクラスでもある。<br>Fileクラスを利用するには、java.ioパッケージをインポートする。<br>Fileクラスの主なメソッドをいかに記す。

|メソッド名|働き|使い方（"〇〇.txt"はファイル名、"dir"はディレクトリ名）|
|:--|:--|:--|
|コンストラクタ|ファイル名の初期化|File f = new File("file.txt")|
|getAbsolutePath()|ファイルまたはディレクトリの絶対パス名を得る|File = new File("file.txt");<br>String a = f.getAbsolutePath();|
|isAbsolute()|絶対パス名かどうか判定|File f = new File("file.txt");<br>boolean a = f.isAbsolute();|
|list()|ディレクトリにあるファイルとディレクトリを文字列として得る|File d = new File("dir");<br>String[] b = d.list();|
|mkdir()|ディレクトリの作成|File d = new File("dir");<br>boolean a = d.mkdir();|
|delete()|ファイルまたはディレクトリの削除|File f = new File("file.txt");<br>boolean a = f.delete();|
|renameTo()|ファイル名の変更|File f1 = new File("file1.txt");<br>File f2 = new File("file2.txt");<br>boolean a = f1.renameTo(f2);|
|isFile()|ファイルかどうか判定|File f = new File("file.txt");<br>boolean a = f.isFile();|
|isDirectory()|ディレクトリかどうか判定|File d = new File("dir");<br>boolean a = d.isDirectory();|
|exists()|ファイルまたはディレクトリが存在するかどうか判定|File f = new File("file.txt");<br>boolean a = f.exists();|