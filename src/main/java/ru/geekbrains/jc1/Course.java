package ru.geekbrains.jc1;


import ru.geekbrains.javacore1.Obstacle;
import ru.geekbrains.javacore1.Status;
import ru.geekbrains.javacore1.Team;
import ru.geekbrains.javacore1.TeamMember;

public class Course {
    private ru.geekbrains.javacore1.Obstacle[] obstacles;

    public Course(ru.geekbrains.javacore1.Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }

}
