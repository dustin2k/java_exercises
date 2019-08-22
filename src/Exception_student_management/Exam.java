package Exception_student_management;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        String id;
        String fullName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student id: ");
        id = input.nextLine();
        System.out.print("Enter student name: ");
        fullName = input.nextLine();
        Students stu = new Students(id, fullName);
        int n;
        System.out.print("Enter the number of subject: ");
        do{
            try{
                n = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                input.nextLine();
                System.out.print("Error, try again: ");
            }
        }while(true);
        input.nextLine();
        Subject[] subject = new Subject[n];
        Mark[] mark = new Mark[n];
        double w_total = 0;
        for(int i = 0; i < n; i++){
            String sj;
            System.out.print("Enter subject " + (i + 1) + " name: ");
            sj = input.nextLine();
            double w;
            System.out.print("Enter subject " + (i + 1) + " coefficient: ");
            do{
                try{
                    w = input.nextDouble();
                    input.nextLine();
                    w_total += w;
                    break;
                }
                catch(InputMismatchException e){
                    input.next();
                    System.out.print("Error, try again: ");
                }
            }while(true);
            double m;
            System.out.print("Enter subject's mark: ");
            do{
                try{
                    m = input.nextDouble();
                    input.nextLine();
                    break;
                }
                catch(InputMismatchException e){
                    input.next();
                    System.out.print("Error, try again: ");
                }
            }while(true);
            int bonus;
            System.out.print("Enter bonus: ");
            do{
                try{
                    bonus = input.nextInt();
                    input.nextLine();
                    break;
                }
                catch(InputMismatchException e){
                    input.next();
                    System.out.print("Error, try again: ");
                }
            }while(true);
            subject[i] = new Subject(sj, w);
            mark[i] = new Mark(stu, subject[i], m, bonus);
        }
        input.close();
        double T1 = 0;
        for(int i = 0; i < n; i++){
            T1 += (double)(mark[i].m * subject[i].w * (1 + mark[i].bonus / 100)) / w_total;
        }
        System.out.println(stu.getFullName());
        System.out.println(stu.getSid());
        for(int i = 0; i < n; i++){
            System.out.println(subject[i].sjName + " " + subject[i].w + " " + mark[i].m + " " + mark[i].bonus + " " + (double)(mark[i].m * subject[i].w * (1 + mark[i].bonus / 100)) / w_total);
        }
        System.out.println(T1);
        System.out.println(w_total);
    }
}
