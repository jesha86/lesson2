package ru.geekbrains.jc1;

import ru.geekbrains.javacore1.Obstacle;
import ru.geekbrains.javacore1.TeamMember;

public class Swimming extends Obstacle {

    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}
