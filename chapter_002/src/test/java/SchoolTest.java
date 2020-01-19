import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
