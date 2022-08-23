package assign_8;

/**
 * Course class for simulating course details of a college
   contains 
   	reference number for course type
   	course number for identifying specific course in a degree, diploma, masters and suchlike.
   	getters and setters
 */
public class CollegeCourse {

	int referenceNumber;
	int courseNumber;

	private CollegeCourse() {}

	public CollegeCourse(int referenceNumber, int courseNumber) {
		this.referenceNumber = referenceNumber;
		this.courseNumber = courseNumber;
	}

	public int getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

}
