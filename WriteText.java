import java.io.*;

class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("math.txt");
            String lf = System.getProperty("line.separator");  // String lf = System.lineSeparator();　簡潔に記述可能
            int a = 10, b = 5;
            out.write("加法:");
            out.write(a + "+" + b + "=" + (a+b) + lf);
            out.write("減法:");
            out.write(a + "-" + b + '=' + (a-b) + lf);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}