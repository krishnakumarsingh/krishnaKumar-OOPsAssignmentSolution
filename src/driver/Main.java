package driver;
import model.HrDepartment;
import model.AdminDepartment;
import model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		AdminDepartment AdminDeprt = new AdminDepartment();
		HrDepartment hrDeprt = new HrDepartment();
		TechDepartment techDeprt = new TechDepartment();

		System.out.println("Welcome to " + AdminDeprt.departmentName());
		System.out.println(AdminDeprt.getTodaysWork());
		System.out.println(AdminDeprt.getWorkDeadline());
		System.out.println(AdminDeprt.isTodayAHoliday());

		System.out.println();
		System.out.println("Welcome to " + hrDeprt.departmentName());
		System.out.println(hrDeprt.doActivity());
		System.out.println(hrDeprt.getTodaysWork());
		System.out.println(hrDeprt.getWorkDeadline());
		System.out.println(hrDeprt.isTodayAHoliday());
		
		System.out.println();
		System.out.println("Welcome to " + techDeprt.departmentName());
		System.out.println(techDeprt.getTodaysWork());
		System.out.println(techDeprt.getWorkDeadline());
		System.out.println(techDeprt.getTechStackInformation());
		System.out.println(techDeprt.isTodayAHoliday());

	}

}
