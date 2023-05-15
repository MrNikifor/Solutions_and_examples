package generics.example_game;

public class Test {
    public static void main(String[] args) {
        Pupils pupil1 = new Pupils("Виолетта", 7);
        Pupils pupil2 = new Pupils("Богдан", 13);
        Students student1 = new Students("Вася", 17);
        Students student2 = new Students("Ира", 16);
        Employee employee1 = new Employee("Никита", 37);
        Employee employee2 = new Employee("Серега", 33);

        // чтобы создавать в команде Team определеный тип объектов в коллекция, необходимо создать в классе
        // Team <generics>(в данном примере это будет <T>), и при создании команд указывать их тип(класс).
        Team<Pupils> pupilsTeam = new Team<>("Пиздюки");
        Team<Students> studentsTeam = new Team<>("Осминоги");
        Team<Employee> employeeTeam = new Team<>("Пердуны");
        pupilsTeam.addNewParticipant(pupil1);
        pupilsTeam.addNewParticipant(pupil2);
        studentsTeam.addNewParticipant(student1);
        studentsTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        // чтобы определеный тип объектов взаимодейстовал исключительно между собой(школьники с школьниками...),
        //  обизательно в методай нужно указывать тип <generics>(<T>).
        // Создадим еще одну команду школьников для примера

        Team<Pupils> pupilsTeam2 = new Team<>("Ботаны");
        Pupils pupil3 = new Pupils("Инокентий", 10);
        Pupils pupil4 = new Pupils("Лолита", 9);
        pupilsTeam.playWith(pupilsTeam2);
    }
}
