package controller;
import model.Employee;
import model.FullTimeStaff;
import model.PartTimeStaff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private final List<Employee> employees;
    public EmployeeManager() {
        employees = new ArrayList<>();
    }
    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }
    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteByEmploy() {
        if (employees.size()==0){
            System.out.println("Khong tim thay de xoa! ");
        }else {
            employees.remove(employees.size() - 1);
        }
    }
    public void editEmployee(Scanner input) {
        String newId;
        String newName;
        int newAge;
        String newNumberPhone;
        String newEmail;
        double newBonus;double newFine;double newHardSalary;
        System.out.println("Mời bạn nhập vào id nhân viên: ");
        String id = input.nextLine();
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                if (e instanceof FullTimeStaff) {
                    System.out.print("Mời bạn nhập mã nhân viên  : "); newId = input.nextLine();
                    System.out.print("Mời bạn nhập tên nhân viên : "); newName = input.nextLine();
                    System.out.print("Mời bạn nhập tuổi nhân viên : "); newAge = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập sđt nhân viên : "); newNumberPhone = input.nextLine();
                    System.out.print("Mời bạn nhập email nhân viên : "); newEmail = input.nextLine();
                    System.out.print("Mời bạn nhập tiền thưởng nhân viên : "); newBonus = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập tiền phạt nhân viên : "); newFine = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập lương cơ bản của nhân viên : "); newHardSalary = Integer.parseInt(input.nextLine());
                    e.setId(newId);e.setFullName(newName);e.setAge(newAge);e.setPhone(newNumberPhone);e.setEmail(newEmail);
                    ((FullTimeStaff) e).setBonus(newBonus);((FullTimeStaff) e).setFine(newFine);
                    ((FullTimeStaff) e).setHardSalary(newHardSalary);
                } else if (e instanceof PartTimeStaff) {
                    System.out.print("Mời bạn nhập mã nhân viên  : "); newId = input.nextLine();
                    System.out.print("Mời bạn nhập tên nhân viên : "); newName = input.nextLine();
                    System.out.print("Mời bạn nhập tuổi nhân viên : "); newAge = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập sđt nhân viên : "); newNumberPhone = input.nextLine();
                    System.out.print("Mời bạn nhập email nhân viên : "); newEmail = input.nextLine();
                    System.out.print("Mời bạn nhập số giờ làm việc : ");double newWorkTime = Integer.parseInt(input.nextLine());
                    e.setId(newId);e.setFullName(newName);e.setAge(newAge);e.setPhone(newNumberPhone);e.setEmail(newEmail);
                    ((PartTimeStaff) e).setWorkTime(newWorkTime);
                }
            }
        }
    }
}
