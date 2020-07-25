class Change {
    public static void main(String[] args) {
        String a = "34";
        int b = 50;
        int c = Integer.parseInt(a);  // 文字列と数値は計算できないため、文字列を数値に変換する。
        int d = c + b;
        System.out.println(a + " + " + b + " = " + d);
    }
}