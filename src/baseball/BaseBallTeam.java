package baseball;

public class BaseBallTeam {
    // フィールド
    protected String name; // チーム名
    protected int win; // 勝ち数
    protected int lose; // 負け数
    protected int draw; // 引き分け数

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありコンストラクタ
    public  BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率を計算するメソッド
    public double getRate() {
        double winRate = (double)win / (win+lose);
        return winRate;
    }

    // 成績レポートするメソッド
    public void report() {
        System.out.println(name+"の2022年の成績は"+win+"勝"+lose+"敗"+draw+"分、勝率は"+getRate()+"です。");
    }
}

