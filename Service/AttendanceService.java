package HW5.Service;

import HW5.Data.Student;
import HW5.Data.StudentsGroup;

public class AttendanceService {
    private int attendance;
    private StudentsGroup group = new StudentsGroup();




    public void showAllAttendance(){
        StudentsGroup group1 = new StudentsGroup();
        for (Student student:group1.NewGroup()
             ) {
            System.out.printf(student.getName() + " = " + student.attendancePercent() + '\n');

        }


        }
        public void sortGroup(){
        StudentsGroup group1 = new StudentsGroup();
            System.out.println(group1.sortGroup(group1.NewGroup()));

        }
    }