import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
	@Test
	public void whenRange10A() {
		List<Student> all = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10) {
			all.add(new Student(i));
		}
		School sch = new School();
		List<Student> classA = sch.collect(all, stud -> stud.getScore() >= 70 && stud.getScore() <= 100);
		assertThat(classA, is(Arrays.asList(new Student(70), new Student(80), new Student(90), new Student(100))));
	}

	@Test
	public void whenRange10B() {
		List<Student> all = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10) {
			all.add(new Student(i));
		}
		School sch = new School();
		List<Student> classA = sch.collect(all, stud -> stud.getScore() >= 50 && stud.getScore() < 70);
		assertThat(classA, is(Arrays.asList(new Student(50), new Student(60))));
	}

	@Test
	public void whenRange10C() {
		List<Student> all = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10) {
			all.add(new Student(i));
		}
		School sch = new School();
		List<Student> classA = sch.collect(all, stud -> stud.getScore() < 50);
		assertThat(classA, is(Arrays.asList(new Student(10), new Student(20), new Student(30), new Student(40))));
	}

	@Test
	public void whenListToMap() {
		School school = new School();
		Student student1 = new Student("Svetlana", 20);
		Student student2 = new Student("Andrey", 20);
		Student student3 = new Student("Andrey", 30);
		List<Student> students = List.of(student1, student2, student3);
		Map<String, Student> result = school.listToMap(students);
		Map<String, Student> expected = new HashMap<>();
		expected.put("Svetlana", student1);
		expected.put("Andrey", student3);
		assertThat(result, is(expected));
	}

	@Test
	public void whenStudentListWithBoundWithoutNullAndSorted() {
		Student st1 = new Student("Ivan", 99);
		Student st2 = new Student("Petr", 70);
		Student st3 = new Student("Sergey", 50);
		Student st4 = new Student("Anna", 20);
		List<Student> result = new School().levelOf(Arrays.asList(st1, st2, st3, null, st4), 69);
		assertThat(result.size(), is(2));
		assertThat(result.get(0), is(st1));
		assertThat(result.get(1), is(st2));
	}
}
