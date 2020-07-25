class Function {
    public static void main(String[] args) {
        double deg = 30, rad;
        rad = Math.toRadians(deg);

        double s = Math.sin(rad);
        double c = Math.cos(rad);
        double t = Math.tan(rad);

        System.out.println("角度 " + deg + "度 ");
        System.out.println("sin " + (float)s);
        System.out.println("cos " + (float)c);
        System.out.println("tan " + (float)t);
    }
}