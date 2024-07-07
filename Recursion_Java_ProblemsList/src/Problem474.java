/*
 * classroom1 = new Classroom([new Student("AC-343424", "James", "Smith", 6), new Student("AC-343428", "Maria", "Garcia", 5),new Student("AC-343434", "Robert", "Johnson", 3),new Student("AC-343454","Danny", "Robertson",10)], "Algebra II", "Emily Theodore")
 * classroom2 = new Classroom([new Student("AC-340014","Kent", "Carter",9), new Student("AC-340024","Isaiah", "Chambers",10),new Student("AC-340018","Leta", "Ferguson",7)], "English", "Daniel Pherb")
 * 
 * school = [classroom1, classroom2]
 * printHonorsStudents(school)
 * --> AC-343454: Danny Robertson(10gr) from Emily Theodore's class
 * --> AC-340024: Isaiah Chambers(10gr) from Daniel Pherb's class
 * 
 */
public class Problem474 {
	public static void main(String[] args) {
		Student[] input1 = new Student[] { new Student("AC-343424", "James", "Smith", 6),
				new Student("AC-343428", "Maria", "Garcia", 5), new Student("AC-343434", "Robert", "Johnson", 3),
				new Student("AC-343454", "Danny", "Robertson", 10) };
		Classroom classroom1 = new Classroom(input1, "Algebra II", "Emily Theodore");

		Student[] input2 = new Student[] { new Student("AC-340014", "Kent", "Carter", 9),
				new Student("AC-340024", "Isaiah", "Chambers", 10), new Student("AC-340018", "Leta", "Ferguson", 7) };
		Classroom classroom2 = new Classroom(input2, "English", "Daniel Pherb");

		Classroom[] input3 = new Classroom[] { classroom1, classroom2 };
		printHonorsStudents(input3);
	}

	public static void printHonorsStudents(Classroom[] inputs) {
		for (Classroom input1 : inputs) {
			for (Student input2 : input1.students) {
				if (input2.gradeLevel >= 10) {
					System.out.println(input2.getStudentInfo() + " from "
							+ input1.teacher + "'s class");
				}
			}
		}
	}
}

class Student {
	public String studentId;
	public String firstName;
	public String lastName;
	public int gradeLevel;

	public Student(String studentId, String firstName, String lastName, int gradeLevel) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
	}

	public String getStudentInfo() {
		return studentId
				+ ": " + firstName + " "
				+ lastName + "(" + String.valueOf(gradeLevel) + "gr)";
	}
}

class Classroom {
	public Student[] students;
	public String courseName;
	public String teacher;

	public Classroom(Student[] students, String courseName, String teacher) {
		this.students = students;
		this.courseName = courseName;
		this.teacher = teacher;
	}

	public String getClassIdentity() {
		return courseName + " managed by " + teacher;
	}

	public String getNumberOfStudents() {
		return String.valueOf(students.length);
	}
}
