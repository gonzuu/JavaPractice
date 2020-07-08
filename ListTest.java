import java.util.*;

class ListTest {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        String a = "a", b = "b", c = "c", d = "d";

        lst.add(a);
        lst.add(b);
        lst.add(c);
        System.out.println(lst);

        lst.add(2, d);            //インデックス２にオブジェクトを挿入
        System.out.println(lst);

        lst.set(1, d);            //インデックス１のオブジェクトを書き換え
        System.out.println(lst);
    }
}