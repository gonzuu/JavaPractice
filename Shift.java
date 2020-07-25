class Shift {
    public static void main(String[] args) {
        byte a = 10;  // 00001010
        byte b = 9;   // 00001001
        byte c = 1;   // シフト量
        System.out.println(a + " & " + b + " = " + (a & b));
        System.out.println(a + " | " + b + " = " + (a | b));
        System.out.println(a + " ^ " + b + " = " + (a ^ b));
        System.out.println("~10 = " + (~a));
        System.out.println(a + " << " + c + " = " + (a << c));
        System.out.println(a + " >>> " + c + " = " + (a >>> c));
        System.out.println(-1*a + " >> " + c + " = " + (-1*a >> c));
    }
}