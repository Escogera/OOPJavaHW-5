package HW5.Service;

import java.util.Scanner;

public class Controller {


    public void showMe(){

        while (true){
            System.out.println("Выберите действие");
            System.out.println("1 - показать студентов и посещаемость");
            System.out.println("2 - отсортировать посещаемость");
            System.out.println("3 - показать студентов с посещаемостью ниже 25%");
            System.out.println("4 - выход из программы");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if (i == 1){
                AttendanceView show = new AttendanceView();
                show.showGroup();
                show.showAttendance();

            } else if ( i == 2) {
                AttendanceView show = new AttendanceView();
                show.sortGroup();

            }
            else if ( i == 3) {
                AttendanceView show = new AttendanceView();
                show.sortGroup25();
            }
            else if ( i == 4) {
                System.out.println("Вы вышли из программы");
               break;
            }
        }


    }
}