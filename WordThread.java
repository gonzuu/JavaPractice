class WordThread extends Thread {
    private String word;
    private int time;
    private int count;

    public WordThread(String w, int t, int c) {
        word = w;
        time = t;
        count = c;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
            try {
                Thread.sleep(time);  // sleep()メソッド　引数の時間(ミリ秒)、このスレッドを停止する。1[秒]=1000[ミリ秒]
            } catch (Exception e){
            }
        }
    }

    public static void main(String[] args) {
        WordThread tick = new WordThread("tick", 1000, 4);
        WordThread tack = new WordThread(" tack\n", 1000, 3);

        tick.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        tack.start();
    }
}