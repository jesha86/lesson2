package ru.geekbrains.javacore1;

import ru.geekbrains.javacore1.Course;
import ru.geekbrains.javacore1.Cross;
import ru.geekbrains.javacore1.Fight;
import ru.geekbrains.javacore1.Swimming;
import ru.geekbrains.javacore1.Team;
import ru.geekbrains.javacore1.TeamMember;

public class Main {
    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("A", 4),
                new TeamMember("B", 5),
                new TeamMember("C", 6),
                new TeamMember("D" ,7));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(6));
        course.doIt(dreamTeam);

    }
}
