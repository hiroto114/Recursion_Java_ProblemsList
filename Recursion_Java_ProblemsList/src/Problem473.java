
public class Problem473 {
	public static void main(String[] args) {
		Student[] input1 = new Student[] { new Student("AC-343424", "James", "Smith", 6),
				new Student("AC-343428", "Maria", "Garcia", 5), new Student("AC-343434", "Robert", "Johnson", 3),
				new Student("AC-343454", "Danny", "Robertson", 10) };
		Classroom classroom1 = new Classroom(input1, "Algebra II", "Emily Theodore");
		System.out.println(classroom1.getClassIdentity());
		System.out.println(classroom1.getNumberOfStudents());

		Student[] input2 = new Student[] { new Student("AC-340014", "Kent", "Carter", 9),
				new Student("AC-340024", "Isaiah", "Chambers", 10), new Student("AC-340018", "Leta", "Ferguson", 7) };
		Classroom classroom2 = new Classroom(input2, "English", "Daniel Pherb");
		System.out.println(classroom2.getClassIdentity());
		System.out.println(classroom2.getNumberOfStudents());
	}
}

