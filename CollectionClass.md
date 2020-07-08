## コレクションクラス
#### コレクションクラスは、オブジェクトデータの管理をサポートするクラスの総称であり、例を挙げるとArrayListクラスは、コレクションクラスのひとつ。

## ArrayListクラス
#### 配列のように要素（オブジェクト)を格納することができる。主なメソッドは以下のとおり。

|メソッド名|働き|使い方（aは位置を表す番号、bはオブジェクト名）|
|:--|:--|:--|
|add()|要素の追加|ArrayList list = new ArrayList(); <br> list.add(b);|
||要素の挿入|ArrayList list = new ArrayList(); <br> list.add(a, b);|
|set()|要素の置き換え|ArrayList list = new ArrayList(); <br> list.set(a, b);|
|get()|要素の取得|ArrayList list = new ArrayList(); <br> Object b = list.get(a);|
|indexOf()|要素の位置を取得|ArrayList list = new ArrayList(); <br> int x = list.indexof(b);|
|remove()|要素の削除|ArrayList list = new ArrayList(); <br> list.remove(a);|
|clear()|全ての要素を削除|ArrayList list = new ArrayList(); <br> list.clear();|
|size()|要素数を取得|ArrayList list = new ArrayList(); <br> int y = list.size();|
|toArray()|要素を配列に格納|ArrayList list = new ArrayList(); <br> object[] b = list.toArray();|
- 配列と同じで、位置を表す番号（インデックス）は0から始まる。
