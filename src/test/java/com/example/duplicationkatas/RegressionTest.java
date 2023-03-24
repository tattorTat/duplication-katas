package com.example.duplicationkatas;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class RegressionTest {
    @Test
    void testMonkey() {
        LessonOne song = new LessonOne();
        song.singMonkeysJumpingOnTheBed();
        Approvals.verify(song.song);
    }

    @Test
    void testOldMan() {
        LessonTwo song = new LessonTwo();
        song.singThisOldMan();
        Approvals.verify(song.song);
    }

    @Test
    void testCheers() {
        LessonThree song = new LessonThree();
        song.singCheers();
        Approvals.verify(song.song);
    }

    @Test
    void testNames() {
        LessonFour song = new LessonFour();
        String[] names = {"Llewellyn", "Samatha", "Tomas", "Emilia"};
        song.singNames(1, names);
        song.singNames(2, names);
        song.singNames(3, names);
        Approvals.verify(song.song);
    }

    @Test
    void testWalk() {
        LessonFive song = new LessonFive();
        song.singWalkingSong();
        Approvals.verify(song.song);
    }

}