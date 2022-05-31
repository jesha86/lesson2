package ru.geekbrains.javacore1;


import ru.geekbrains.javacore1.Status;
import ru.geekbrains.javacore1.Team;
import ru.geekbrains.javacore1.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
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
