package HW5.Data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;

    private List<AttendanceJournal> attendance = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Student(int id, String name, List<AttendanceJournal> attendance) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
    }

    public float attendancePercent() {
        float percent = 0;
        float count = 0;
        float allDay = 0;
        for (AttendanceJournal each : attendance) {
            allDay++;
            if (each.isAttendanceStudent())
                count++;

        }
        percent = count / allDay * 100;
        return percent;
    }

    public List<AttendanceJournal> getAll() {
        List<AttendanceJournal> copy = new ArrayList<>();
        for (AttendanceJournal student : attendance) {
            copy.add(student);
        }
        return copy;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendanse=" + attendance;
    }
}
