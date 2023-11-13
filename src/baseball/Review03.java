package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 6チームについてインスタンス化
        BaseBallTeam bbt01 = new BaseBallTeam();
        bbt01.setName("東京ヤクルトスワローズ");
        bbt01.setWin(80);
        bbt01.setLose(59);
        bbt01.setDraw(4);
        bbt01.report(bbt01.getName(), bbt01.getWin(), bbt01.getLose(), bbt01.getDraw());

        BaseBallTeam bbt02 = new BaseBallTeam();
        bbt02.setName("横浜DeNAベイスターズ");
        bbt02.setWin(73);
        bbt02.setLose(68);
        bbt02.setDraw(2);
        bbt02.report(bbt02.getName(), bbt02.getWin(), bbt02.getLose(), bbt02.getDraw());

        BaseBallTeam bbt03 = new BaseBallTeam();
        bbt03.setName("阪神タイガース");
        bbt03.setWin(68);
        bbt03.setLose(71);
        bbt03.setDraw(4);
        bbt03.report(bbt03.getName(), bbt03.getWin(), bbt03.getLose(), bbt03.getDraw());

        BaseBallTeam bbt04 = new BaseBallTeam();
        bbt04.setName("読売ジャイアンツ");
        bbt04.setWin(68);
        bbt04.setLose(72);
        bbt04.setDraw(3);
        bbt04.report(bbt04.getName(), bbt04.getWin(), bbt04.getLose(), bbt04.getDraw());

        BaseBallTeam bbt05 = new BaseBallTeam();
        bbt05.setName("広島東洋カープ");
        bbt05.setWin(66);
        bbt05.setLose(74);
        bbt05.setDraw(3);
        bbt05.report(bbt05.getName(), bbt05.getWin(), bbt05.getLose(), bbt05.getDraw());

        BaseBallTeam bbt06 = new BaseBallTeam();
        bbt06.setName("中日ドラゴンズ");
        bbt06.setWin(66);
        bbt06.setLose(75);
        bbt06.setDraw(2);
        bbt06.report(bbt06.getName(), bbt06.getWin(), bbt06.getLose(), bbt06.getDraw());
    }
}
