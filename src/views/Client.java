package views;
import model.Employee;
import model.FullTimeStaff;
import model.PartTimeStaff;
import controller.EmployeeManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Employee> employees = new ArrayList<>();
    public static EmployeeManager employee = new EmployeeManager(employees);
    public static Scanner input = new Scanner(System.in);
    public static int checkInput;
    public static void main(String[] args) {
        do {
            System.out.println(
                    """
                            1. Thêm nhân viên mới
                            2. Sửa thông tin nhân viên
                            3. Xóa thông tin nhân viên
                            4. Danh sách nhân viên công ty
                            5. Tổng lương của tất cả nhân viên
                            6. Trung bình lương thực lĩnh của tất cả nhân viên
                            7. Danh sách nhân viên full time có mức lương thấp hơn so với mức lương trung bình của cả công ty
                            8. Tổng lương của nhân viên làm part time
                            9. Nhân viên full time có mức lương tăng dần
                            0. Thoát chương trình""");
            System.out.print("Mời bạn chọn...");
            checkInput = Integer.parseInt(input.nextLine());
            switch (checkInput) {
                case 1 -> employee.addNewEmployee(addNewEmployee());
                case 2 -> employee.editEmployee(input);
                case 3 -> employee.deleteByEmploy();
                case 4 -> {
                    employee.displayEmployees();
                }
                case 5 ->
                case 6 ->
                case 7 ->

                case 8 ->

                case 9 ->

                case 0 -> System.exit(checkInput);
                default -> System.out.println("Nhập sai dữ liệu!");
            }
        } while (true);
    }
    }
}
