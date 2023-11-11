package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 6チームについてインスタンス化
        BaseBallTeam bbt01 = new BaseBallTeam();
        bbt01.setName("東京ヤクルトスワローズ");
        bbt01.setWin(80);
        bbt01.setLose(59);
        bbt01.setDraw(4);
        int bbt01Win = bbt01.getWin();
        int bbt01Lose = bbt01.getLose();
        bbt01.report(bbt01.getName(), bbt01Win, bbt01Lose, bbt01.getDraw(), bbt01.getRate(bbt01Win, bbt01Lose));

        BaseBallTeam bbt02 = new BaseBallTeam();
        bbt02.setName("横浜DeNAベイスターズ");
        bbt02.setWin(73);
        bbt02.setLose(68);
        bbt02.setDraw(2);
        int bbt02Win = bbt02.getWin();
        int bbt02Lose = bbt02.getLose();
        bbt02.report(bbt02.getName(), bbt02Win, bbt02Lose, bbt02.getDraw(), bbt02.getRate(bbt02Win, bbt02Lose));

        BaseBallTeam bbt03 = new BaseBallTeam();
        bbt03.setName("阪神タイガース");
        bbt03.setWin(68);
        bbt03.setLose(71);
        bbt03.setDraw(4);
        int bbt03Win = bbt03.getWin();
        int bbt03Lose = bbt03.getLose();
        bbt03.report(bbt03.getName(), bbt03Win, bbt03Lose, bbt03.getDraw(), bbt03.getRate(bbt03Win, bbt03Lose));

        BaseBallTeam bbt04 = new BaseBallTeam();
        bbt04.setName("読売ジャイアンツ");
        bbt04.setWin(68);
        bbt04.setLose(72);
        bbt04.setDraw(3);
        int bbt04Win = bbt04.getWin();
        int bbt04Lose = bbt04.getLose();
        bbt04.report(bbt04.getName(), bbt04Win, bbt04Lose, bbt04.getDraw(), bbt04.getRate(bbt04Win, bbt04Lose));

        BaseBallTeam bbt05 = new BaseBallTeam();
        bbt05.setName("広島東洋カープ");
        bbt05.setWin(66);
        bbt05.setLose(74);
        bbt05.setDraw(3);
        int bbt05Win = bbt05.getWin();
        int bbt05Lose = bbt05.getLose();
        bbt05.report(bbt05.getName(), bbt05Win, bbt05Lose, bbt05.getDraw(), bbt05.getRate(bbt05Win, bbt05Lose));

        BaseBallTeam bbt06 = new BaseBallTeam();
        bbt06.setName("中日ドラゴンズ");
        bbt06.setWin(66);
        bbt06.setLose(75);
        bbt06.setDraw(2);
        int bbt06Win = bbt06.getWin();
        int bbt06Lose = bbt06.getLose();
        bbt06.report(bbt06.getName(), bbt06Win, bbt06Lose, bbt06.getDraw(), bbt06.getRate(bbt06Win, bbt06Lose));

    }
}
