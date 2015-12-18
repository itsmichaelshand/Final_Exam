package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//They're all neighbors
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-543-4612", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Michael", "James", "Shand", dBirthDate, "215 Labrador Lane", "302-597-6425", "bgibbons2@udel.edu","MIS");
		Student stu3 = new Student("Jim", "Bo", "Gangle", dBirthDate, "216 Labrador Lane", "302-946-1215", "bgibbons3@udel.edu","MIS");
		Student stu4 = new Student("Bobby", "Gall", "Fisher", dBirthDate, "217 Labrador Lane", "302-641-6515", "bgibbons4@udel.edu","MIS");
		Student stu5 = new Student("Lisa", "Midle", "Simpdon", dBirthDate, "218 Labrador Lane", "302-761-4521", "bgibbons5@udel.edu","MIS");


		assertTrue(1==1);
	}

}
