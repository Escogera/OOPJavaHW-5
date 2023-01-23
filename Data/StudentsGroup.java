package HW5.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> students = new ArrayList<>();

    public List<Student> NewGroup() {
        List<Student> newGroup1 = new ArrayList<>();
        List<AttendanceJournal> forIbragimov = new ArrayList<>();
        forIbragimov.add(new AttendanceJournal(LocalDate.of(2020, 1, 12), true));
        forIbragimov.add(new AttendanceJournal(LocalDate.of(2020, 1, 13), true));
        forIbragimov.add(new AttendanceJournal(LocalDate.of(2020, 1, 14), false));
        newGroup1.add(new Student(1, "Ibragimov Ilnar", forIbragimov));

        List<AttendanceJournal> forVoroncova = new ArrayList<>();
        forVoroncova.add(new AttendanceJournal(LocalDate.of(2020, 1, 12), false));
        forVoroncova.add(new AttendanceJournal(LocalDate.of(2020, 1, 13), false));
        forVoroncova.add(new AttendanceJournal(LocalDate.of(2020, 1, 14), false));
        newGroup1.add(new Student(2, "Voroncova Elizavetta", forVoroncova));

        List<AttendanceJournal> forKuznecova = new ArrayList<>();
        forKuznecova.add(new AttendanceJournal(LocalDate.of(2020, 1, 12), true));
        forKuznecova.add(new AttendanceJournal(LocalDate.of(2020, 1, 13), true));
        forKuznecova.add(new AttendanceJournal(LocalDate.of(2020, 1, 14), true));
        newGroup1.add(new Student(3, "Kuznecova Ksenia", forKuznecova));

        List<AttendanceJournal> forPetrov = new ArrayList<>();
        forPetrov.add(new AttendanceJournal(LocalDate.of(2020, 1, 12), false));
        forPetrov.add(new AttendanceJournal(LocalDate.of(2020, 1, 13), false));
        forPetrov.add(new AttendanceJournal(LocalDate.of(2020, 1, 14), true));
        newGroup1.add(new Student(4, "Petrov Mikghail", forPetrov));
        return newGroup1;
    }

    public List<Student> sortGroup(List<Student> group) {

        for (int i = 0; i < group.size(); i++) {
            for (int j = 0; j < group.size() - 1; j++) {
                if (group.get(j).attendancePercent() < group.get(j + 1).attendancePercent()) {
                    Student temp = group.get(j);
                    group.set(j, group.get(j + 1));
                    group.set(j + 1, temp);
                }
            }
        }
        return group;
    }

    public List<Student> sortGroup25(List<Student> group) {
        List<Student> group25 = new ArrayList<>();
        for (int i = 0; i < group.size(); i++) {

            if (group.get(i).attendancePercent() < 25.0) {
                group25.add(group.get(i));

            }
        }
        return group25;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }
}
