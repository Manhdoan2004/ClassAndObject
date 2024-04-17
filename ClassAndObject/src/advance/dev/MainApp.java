package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void input(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double averageGrade = scanner.nextDouble();
			scanner.nextLine();

			students[i] = new Student(name, age, address, phoneNumber, averageGrade);
		}
		scanner.close();
	}

	public static void print(Student[] students) {
		System.out.println("\nDanh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].name);
			System.out.println("Tuổi: " + students[i].age);
			System.out.println("Địa chỉ: " + students[i].address);
			System.out.println("Số điện thoại: " + students[i].phoneNumber);
			System.out.println("Điểm trung bình: " + students[i].averageGrade);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		input(students);
		print(students);
	}
}
