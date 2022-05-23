package jdbc.homework;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentMainTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		AllStudentOperation obj = new AllStudentOperation();
		obj.getConnection();
		int userChoice = 0;

		do {
			System.out.println("Choose one operation .");
			System.out.println(
					"1. Add details.\n2. View Details\n3. View Student by Id(read single student)\n4. Update Student by ID\n5. Delete student by ID\n6. Search student by percentage\n7. Find first ranker");
			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				System.out.print("Enter student Id : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Name : ");
				String name = sc.nextLine();
				System.out.print("Email : ");
				String email = sc.nextLine();
				System.out.print("Phone No : ");
				String phNo = sc.nextLine();
				System.out.print("Lane-1 : ");
				String lane1 = sc.nextLine();
				System.out.print("Lane 2 : ");
				String lane2 = sc.nextLine();
				System.out.print("State : ");
				String state = sc.nextLine();
				System.out.print("Postal Code : ");
				int postalCode = sc.nextInt();

				System.out.print("Enter mark of subject-1 : ");
				float sub1 = sc.nextFloat();
				System.out.print("Enter mark of subject-2 : ");
				float sub2 = sc.nextFloat();
				System.out.print("Enter mark of subject-3 : ");
				float sub3 = sc.nextFloat();

				Address add = new Address(lane1, lane2, state, postalCode);
				Student studentDetails = new Student(id, name, email, phNo, add, sub1, sub2, sub3);

				System.out.println(studentDetails);

				boolean success = obj.addStudent(studentDetails);
				if (success) {
					System.out.println("\nStudent details successfully added....\n");
				}
				break;
			case 2:
//				obj.getConnection();
				obj.viewAllStudentDetails();

				break;
			case 3:
				
				System.out.print("\nEnter Id for get details : ");
				int searchId = sc.nextInt();
				boolean f = obj.viewStudentDetailsByID(searchId);
//					System.out.println(f);
					if(f == false) {
						System.out.println(" | ID doesn't Exist");
						System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");	
					}				
				break;
			case 4:
				System.out.print("\nEnter ID for update record : ");
				int updateId = sc.nextInt();
				boolean check = obj.updateDetailsByID(updateId);
				if(check) {
					System.out.println("\nUpdated Successfully...\n");
				}
				break;
			case 5:
				System.out.print("\nEnter ID for delete record : ");
				int deleteId = sc.nextInt();
				int i = obj.deleteStudentByID(deleteId);
				
				if(i!=0) {
					System.out.println("\n"+deleteId+" deleted succcessfully... \n");
				}
				else {
					System.out.println("\nID doesn't exist...\n");
				}
				break;
			case 6:
				System.out.println("you need to give min and max range of percentage");
				System.out.println("Enter minimum percent");
				int minValue = sc.nextInt();
				System.out.println("Enter maximum percent");
				int maxValue = sc.nextInt();
				
				obj.findRecordsWithRange(minValue,maxValue);
				break;
			case 7:
				System.out.println("View Student who is having same percentage");
				obj.getSamePercentageStudent();
				break;

			default:
				break;
			}
		} while (userChoice < 8);

	}

}
