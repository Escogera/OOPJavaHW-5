package HW5.Data;

import java.time.LocalDate;

public class AttendanceJournal {
    private LocalDate date;
    private boolean attendanceStudent;


    public AttendanceJournal(LocalDate date, boolean attendanceStudent) {
        this.date = date;
        this.attendanceStudent = attendanceStudent;

    }

    public boolean isAttendanceStudent() {
        return attendanceStudent;
    }

    @Override
    public String toString() {
        return "AttendanseJournal{" +
                "date=" + date +
                ", attendanceStudent=" + attendanceStudent +
                '}';
    }
}
