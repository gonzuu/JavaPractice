import static java.lang.Math.log;

class StaticImport {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a + "を底とする" + b + "の対数=" + log(b) / log(a));
    }
}