package ru.geekbrains.jc1;

import ru.geekbrains.javacore1.Obstacle;
import ru.geekbrains.javacore1.TeamMember;

public class Jumping extends Obstacle {

    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
