package homework6.kryvenkosergii_lv444;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudents(List<Student> studentList, int course) {
		System.out.println("Students from the list, which are taught in this course");
		Iterator<Student> it = studentList.iterator();
		while (it.hasNext()) {
			Student n = (Student) it.next();
			if (n.getCourse() == course) {
				System.out.println(n.getName() + " " + n.getCourse());
			}
		}

	}

	public static void sortByName(List<? extends Student> studentList) {
		studentList.sort(new NameComparator());
		System.out.println("List of students ordered by name");
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getCourse());
		}

	}

	public static void sortByCourse(List<Student> studentList) {
		studentList.sort(new TabComparator());
		System.out.println("List of students ordered by course");
		for (Student student : studentList) {
			System.out.println(student.getName() + " " + student.getCourse());
		}

	}

	private static class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	private static class TabComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.course - o2.course;
		}
	}

}
