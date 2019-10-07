package com.github.smeny.scorekeeper;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ScorePrinterTest {

    @Test
    void print_team_scores_padding_with_zeros() {
        ScorePrinter scorePrinter = new ScorePrinter();

        String printedScore = scorePrinter.print(125, 86);

        assertThat(printedScore, is("125:086"));
    }

    @Test
    void print_team_scores_when_over_three_digits() {
        ScorePrinter scorePrinter = new ScorePrinter();

        String printedScore = scorePrinter.print(1250, 3596);

        assertThat(printedScore, is("999:999"));
    }

}