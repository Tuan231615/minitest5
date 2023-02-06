package model;

public class PartTimeStaff extends Employee{
    private double workTime;

    public PartTimeStaff() {
    }

    public PartTimeStaff(String id, String fullName, int age, String phone, String email, double workTime) {
        super(id, fullName, age, phone, email);
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double partTimePractice() {
        return this.workTime * 100000;
    }

    @Override
    public String toString() {
        return "Nhân viên Parttime:" +
                "  Mã nhân viên=" + getId() +
                ", Họ và tên=" + getFullName() +
                ", Tuổi=" + getAge() +
                ", SĐT=" + getPhone() +
                ", email=" + getEmail() +
                ", Giờ làm việc=" + workTime + "\n";
    }
}
