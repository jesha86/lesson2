package ru.geekbrains.lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee(
                "Slava",
                100000,
                "QA Engineer",
                34,
                "mail@gmail.com",
                "79998887766"
        );

        employeeArray[1] = new Employee(
                "Leonid",
                150000,
                "middle QA Engineer",
                50,
                "mail2@gmail.com",
                "79995554433"
        );

        employeeArray[2] = new Employee(
                "Michail",
                120000,
                "QA Engineer",
                45,
                "mail3@gmail.com",
                "79992221100"
        );

        employeeArray[3] = new Employee(
                "Nicolay",
                125000,
                "middle QA Engineer",
                44,
                "mail5@gmail.com",
                "79991234566"
        );

        employeeArray[4] = new Employee(
                "Oleg",
                100000,
                "QA Engineer",
                45,
                "mail3@gmail.com",
                "79992221100"
        );


        for (int i = 0; i < employeeArray.length; i++)
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].infoEmployee();
            }
    }

}
