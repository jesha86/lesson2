package ru.geekbrains.javacore1;

import ru.geekbrains.javacore1.Status;

public class Team {
    private TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + name);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + " Не прошел полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getName() + " Успешно прошел полосу препятствий");
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}
