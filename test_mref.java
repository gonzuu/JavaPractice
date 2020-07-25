import java.util.*;
import java.util.function.*;

class test_mref {
    public static void main(String[] args) {
        class A {
            String ss;
            A(String s) {
                ss = s;
            }
        }

        Function<String, A> f = A::new;  // Stringは、コンストラクタの引数の型。 Aは、newの戻り値(オブジェクト)の型。 f = A::new;　は、コンストラクタをfに格納
        A a = f.apply("しおり");  // コンストラクタを呼び出し
        System.out.println(a.ss);
    }
}