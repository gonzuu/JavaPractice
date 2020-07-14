import java.util.Scanner;

class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("駅名を入力してください。");
        String ekimei = sc.next();
        System.out.print("ホーム番号を入力してください。");
        int bansen = sc.nextInt();

        sc.close();

        System.out.println(ekimei + "駅の" + bansen + "番ホームで待っています。");
    }
}