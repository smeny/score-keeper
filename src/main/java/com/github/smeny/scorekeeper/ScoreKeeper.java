package com.github.smeny.scorekeeper;

class ScoreKeeper {

    private ScorePrinter scorePrinter;

    private int scoreTeamA;
    private int scoreTeamB;

    ScoreKeeper(ScorePrinter scorePrinter) {
        this.scorePrinter = scorePrinter;
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    public String getScore() {
        return scorePrinter.print(scoreTeamA, scoreTeamB);
    }

    public void scoreTeamA1() {
        scorePointsForTeamA(1);
    }

    public void scoreTeamA2() {
        scorePointsForTeamA(2);
    }

    public void scoreTeamA3() {
        scorePointsForTeamA(3);
    }

    public void scoreTeamB1() {
        scorePointsForTeamB(1);
    }

    public void scoreTeamB2() {
        scorePointsForTeamB(2);
    }

    public void scoreTeamB3() {
        scorePointsForTeamB(3);
    }

    private void scorePointsForTeamA(int points) {
        scoreTeamA += points;
    }

    private void scorePointsForTeamB(int points) {
        scoreTeamB += points;
    }
}
