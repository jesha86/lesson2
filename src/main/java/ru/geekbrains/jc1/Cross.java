package ru.geekbrains.jc1;

import ru.geekbrains.javacore1.Obstacle;
import ru.geekbrains.javacore1.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}