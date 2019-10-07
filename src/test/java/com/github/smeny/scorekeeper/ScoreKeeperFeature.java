package com.github.smeny.scorekeeper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(MockitoExtension.class)
class ScoreKeeperFeature {

    private ScoreKeeper scoreKeeper;

    @BeforeEach
    void initialise() {
        ScorePrinter scorePrinter = new ScorePrinter();
        scoreKeeper = new ScoreKeeper(scorePrinter);
    }

    @Test
    void score_all_possible_shots() {
        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();

        String score = scoreKeeper.getScore();

        assertThat(score, is("006:006"));
    }
}