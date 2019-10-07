package com.github.smeny.scorekeeper;

class ScorePrinter {

    String print(int scoreTeamA, int scoreTeamB) {
        if(scoreTeamA > 999) {
            scoreTeamA = 999;
        }
        if(scoreTeamB > 999) {
            scoreTeamB = 999;
        }

        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }

}
