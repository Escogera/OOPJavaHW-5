package HW5.Service;

import HW5.Data.StudentsGroup;

public class AttendanceView {

    public void showGroup(){
        StudentsGroup group1 = new StudentsGroup();
        System.out.println(group1.NewGroup());
    }
    public void showAttendance(){
        AttendanceService attendanceService = new AttendanceService();
        attendanceService.showAllAttendance();
    }
    public void sortGroup(){
        AttendanceService attendanceService = new AttendanceService();
        attendanceService.sortGroup();
    }
    public void sortGroup25(){
        StudentsGroup group = new StudentsGroup();
        System.out.println(group.sortGroup25(group.NewGroup()));

    }

}