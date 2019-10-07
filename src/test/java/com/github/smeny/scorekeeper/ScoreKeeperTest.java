package com.github.smeny.scorekeeper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ScoreKeeperTest {

    private ScoreKeeper scoreKeeper;

    @Mock
    private ScorePrinter scorePrinter;

    @BeforeEach
    void setUp() {
        scoreKeeper = new ScoreKeeper(scorePrinter);
    }

    @Test
    void team_A_score_one_point() {
        given(scorePrinter.print(1, 0)).willReturn("001:000");

        scoreKeeper.scoreTeamA1();

        String score = scoreKeeper.getScore();
        assertThat(score, is("001:000"));
    }

    @Test
    void team_A_score_two_points() {
        given(scorePrinter.print(2, 0)).willReturn("002:000");

        scoreKeeper.scoreTeamA2();

        String score = scoreKeeper.getScore();
        assertThat(score, is("002:000"));
    }

    @Test
    void team_A_score_three_points() {
        given(scorePrinter.print(3, 0)).willReturn("003:000");

        scoreKeeper.scoreTeamA3();

        String score = scoreKeeper.getScore();
        assertThat(score, is("003:000"));
    }

    @Test
    void team_B_score_one_point() {
        given(scorePrinter.print(0, 1)).willReturn("000:001");

        scoreKeeper.scoreTeamB1();

        String score = scoreKeeper.getScore();
        assertThat(score, is("000:001"));
    }

    @Test
    void team_B_score_two_points() {
        given(scorePrinter.print(0, 2)).willReturn("000:002");

        scoreKeeper.scoreTeamB2();

        String score = scoreKeeper.getScore();
        assertThat(score, is("000:002"));
    }

    @Test
    void team_B_score_three_points() {
        given(scorePrinter.print(0, 3)).willReturn("000:003");

        scoreKeeper.scoreTeamB3();

        String score = scoreKeeper.getScore();
        assertThat(score, is("000:003"));
    }

}