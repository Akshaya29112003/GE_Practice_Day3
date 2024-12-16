package Employee_Wage_Computation_Problem_Part1;

import java.util.Random;

public class Wage_Computation {

    public static int IS_FULL_TIME = 1;
    public static int full_day_hrs = 8;
    public static int part_day_hrs = 4;
    public static int wage_per_hr = 20;
    public static int working_days = 20;
    public static int max_working_hrs = 100;

    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program!");
        uc1();
        uc2();
        uc3();
        uc4();
        uc5();

    }

    public static void uc1(){
        double attendance_check = Math.floor(Math.random() * 10) %2;
        System.out.println(attendance_check);

        if(attendance_check == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee id Absent");
    }

    public static void uc2(){
        System.out.println("Wage of a full-time employee :"+full_day_hrs*wage_per_hr);
    }

    public static void uc3(){
        System.out.println("Wage of a part-time employee :"+part_day_hrs*wage_per_hr);
    }

    public static void uc4(){
        int wage_per_day = full_day_hrs*wage_per_hr;
        System.out.println("Wages per month :"+ working_days*wage_per_day);

    }

    public static void uc5(){
        int total_working_days = 0;
        int total_working_hrs = 0;
        int total_wage = 0;

        Random rand = new Random();
        while (total_working_days < working_days && total_working_hrs < max_working_hrs) {
            int attendance = rand.nextInt(3); // Generates 0 (Absent), 1 (Full Time), or 2 (Part Time)
            int hrs_worked = 0;

            switch (attendance) {
                case 1:
                    hrs_worked = full_day_hrs;
                    break;
                case 2:
                    hrs_worked = part_day_hrs;
                    break;
                default:
                    hrs_worked = 0;
                    break;
            }

            total_working_hrs += hrs_worked;
            total_working_days++;
            int daily_wage = hrs_worked * wage_per_hr;
            total_wage += daily_wage;

            System.out.printf("Day %d: Hours Worked = %d, Daily Wage = $%d\n", total_working_days, hrs_worked, daily_wage);
        }

        System.out.println("Total Working Hours: " + total_working_hrs);
        System.out.println("Total Working Days: " + total_working_days);
        System.out.println("Total Wage for the Month: $" + total_wage);
    }
}

