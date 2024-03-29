package ru.geekbrains.jc1;

import ru.geekbrains.javacore1.Obstacle;
import ru.geekbrains.javacore1.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}

