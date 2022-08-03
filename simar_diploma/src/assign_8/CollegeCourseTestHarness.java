package assign_8;

import java.util.Random;
import java.util.Scanner;

/**
 	To test CollegeCourse class
 	contains 8-tasks
 */
public class CollegeCourseTestHarness {
	public static void main(String[] args) {


		System.out.println("\n[Task1]:  Create a two dimensional array (10 cols & 200 rows)"); 
		CollegeCourse[][] collegeCourses = new CollegeCourse[200][10];

		System.out.println("\n\n[Task2]:  Fill the second 100 rows with course reference number and course number: 0"); 
		int referenceNumber = 0;
		int courseNumber = 0;
		int begin = 0;
		int end = 100;

		collegeCourses = populateCollegeCourses(collegeCourses, begin, end, referenceNumber, courseNumber);


		System.out.println("\n\n[Task3]:  Fill the second 100 rows with course reference number and course number: 9999."); 

		referenceNumber = 9999;
		courseNumber = 9999;
		begin = 100;
		end = 200;
		collegeCourses = populateCollegeCourses(collegeCourses, begin, end, referenceNumber, courseNumber);

		System.out.println("\n\n[Task4]:  Iterate the array and print"); 
		printCollegeCourses(collegeCourses);

		System.out.println("\n\n[Task5]:  Set the course reference number to a sequential/unique 7 digit value "); 
		collegeCourses = setUniqueCoureseReferenceNumber(collegeCourses);

		System.out.println("\n\n[Task6]:  Set the course number to one of four, 5 digit course numbers that are randomly chosen from a list you make up. "); 
		int[] courseNumbers = {10001,10002, 10003, 10004};
		collegeCourses = setCoureseNumber(collegeCourses, courseNumbers);

		System.out.println("\n\n[Task7]:  Iterate the array a third time and print."); 
		printCollegeCourses(collegeCourses);

		System.out.println("\n\n[Task8]:  Ask the user for a column and row number( with exception handling)"); 
		searchingCourse(collegeCourses);

		System.out.println("\n\nxxxxxx Program ended xxxxxx");
	}

	/**
	 * Asks user for row and column to search in the course database
	 * Prompts for valid input if given incorrect
	 * Also, asks to carry searching again or not
	 * @param collegeCourses
	 */
	private static void searchingCourse(CollegeCourse[][] collegeCourses) {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter following details for searching your course: ");

		boolean run = true;
		do {

			try {
				System.out.print("\n Your course row number: ");
				int row = Integer.parseInt(in.nextLine())-1;
				System.out.print("\n Your course column number: ");
				int column = Integer.parseInt(in.nextLine())-1;

				System.out.println("Course Reference Number: " + collegeCourses[row][column].referenceNumber);
				System.out.println("Course Number: " + collegeCourses[row][column].courseNumber);

			}catch (NumberFormatException | ArrayIndexOutOfBoundsException  e) {
				System.out.println("Please provide a valid input");
			}


			System.out.print("Do you wanna search again? Write 'yes' for searching again: ");
			String searchAgain = in.nextLine();
			if(!"yes".equalsIgnoreCase(searchAgain))
				run = false;

		}while(run);
		in.close();
	}

	/**
	 * Sets random courseNumber from the list of course numbers given
	 * @param collegeCourses
	 * @param courseNumbers
	 * @return
	 */
	private static CollegeCourse[][] setCoureseNumber(CollegeCourse[][] collegeCourses, int[] courseNumbers) {
		for(CollegeCourse[] row: collegeCourses) {
			for(CollegeCourse col: row) {
				int courseNumber = getRandomCourseNumber(courseNumbers);
				col.setCourseNumber(courseNumber);
			}
		}
		return collegeCourses;
	}

	/**
	 * Gets random course from the list of course numbers given
	 * @param courseNumbers
	 * @return
	 */
	private static int getRandomCourseNumber(int[] courseNumbers) {

		int courseNumber=0;
		int max = courseNumbers.length;
		Random random = new Random();
		int index = random.nextInt(max);

		courseNumber = courseNumbers[index];
		return courseNumber;
	}

	/**
	 * Sets unique course reference number which is also sequential.
	 * Reference number starts from 1010000.
	 * @param collegeCourses
	 * @return
	 */
	private static CollegeCourse[][] setUniqueCoureseReferenceNumber(CollegeCourse[][] collegeCourses) {
		int uniqRerefenceNumber = 1010000;
		for(CollegeCourse[] row: collegeCourses) {
			for(CollegeCourse col: row) {
				col.setReferenceNumber(++uniqRerefenceNumber);
			}
		}
		return collegeCourses;
	}

	/**
	 * Prints all college courses with a dashed line seperator
	 * @param collegeCourses
	 */
	private static void printCollegeCourses(CollegeCourse[][] collegeCourses) {
		int courseType = 1;
		for(CollegeCourse[] row: collegeCourses) {
			int courseCount = 1;
			for(CollegeCourse col: row) {
				printNeccessaryInfo(courseType, courseCount, col);
				courseCount++;
				System.out.println("--------------------------------------------------------"); 
			}
			courseType++;
		}
	}

	/**
	 * Prints necessary info related to courses while printing about course
	 * @param courseType
	 * @param courseCount
	 * @param col
	 */
	private static void printNeccessaryInfo(int courseType, int courseCount, CollegeCourse col) {
		System.out.print("Course Type #" + courseType);
		System.out.println("  & Course Index #" + courseCount);
		System.out.println("Course Reference Number: " + col.referenceNumber);
		System.out.println("Course Number: " + col.courseNumber);
	}

	/**
	 * 
	 * Fills array of courses with new CollegeCourse object.
	 * It takes input array, index start and end, number of columns, reference and course number 
	 * @param collegeCourses
	 * @param begin
	 * @param end
	 * @param referenceNumber
	 * @param courseNumber
	 * @return
	 */
	private static CollegeCourse[][] populateCollegeCourses(CollegeCourse[][] collegeCourses, 
																int begin, int end, 
																int referenceNumber, int courseNumber) {
		for(int i = begin; i<end; i++) {
			for(int j=0; j<10; j++) {
				collegeCourses[i][j] = new CollegeCourse(referenceNumber, courseNumber);
			}
		}
		return collegeCourses;
	}
}
