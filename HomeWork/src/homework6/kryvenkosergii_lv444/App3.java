package homework6.kryvenkosergii_lv444;

import java.util.LinkedList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {

		List<Student> students = new LinkedList<Student>();
		students.add(new Student("Vasya", 1));
		students.add(new Student("Petya", 3));
		students.add(new Student("Taras", 6));
		students.add(new Student("Igor", 2));
		students.add(new Student("Orest", 3));
//		System.out.println(sudents.get(0).getCourse());

		// prints to the console the names of the students from the list, which are
		// taught in this course
		Student.printStudents(students, 3);

		// display the list of students ordered by name
		Student.sortByName(students);

		// display the list of students ordered by course
		Student.sortByCourse(students);
	}

}
