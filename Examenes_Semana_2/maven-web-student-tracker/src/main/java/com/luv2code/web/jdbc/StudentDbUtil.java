package com.luv2code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	private DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public List<Student> getStudents() throws Exception {

		List<Student> students = new ArrayList<>();

		// create sql statement
		String sql = "select * from student order by apellido";

		try (Connection myConn = dataSource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql)) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String apellido = myRs.getString("apellido");
				String email = myRs.getString("email");
				String edad = myRs.getString("edad");
				List<Course> courses = getCourses(id);

				// create new student object
				Student tempStudent = new Student(id, nombre, apellido, email, edad, courses);

				// add it to the list of students
				students.add(tempStudent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;

	}

	public void addStudent(Student theStudent) throws Exception {

		String sql = "insert into student " + "(nombre, apellido, email,edad) " + "values (?, ?, ?,?)";

		try (Connection myConn = dataSource.getConnection();
				PreparedStatement ps = myConn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

			ps.setString(1, theStudent.getNombre());
			ps.setString(2, theStudent.getApellido());
			ps.setString(3, theStudent.getEmail());
			ps.setString(4, theStudent.getEdad());

			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			int id_es = 0;
			if (rs.next()) {
				id_es = rs.getInt(1);
			}

			addCourses(id_es, theStudent);

		}
	}

	public void addCourses(int id_es, Student theStudent) throws Exception {
		// add courses to the student by the student id and the name of the coruse
		String sql = "insert into student_course " + "(student_id, course_name) " + "values (?, ?)";

		try (Connection myConn = dataSource.getConnection(); PreparedStatement ps = myConn.prepareStatement(sql);) {

			for (Course c : theStudent.getCourses()) {
				ps.setInt(1, id_es);
				ps.setString(2, c.getName());

				ps.execute();

			}

		}
	}

	public List<Course> getCourses(int id) throws Exception {
		// get the student course list
		List<Course> courses = new ArrayList<>();

		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = crearStatementGetCourse(myConn, id);
				ResultSet myRs = myStmt.executeQuery()) {

			// retrieve data from result set row
			while (myRs.next()) {
				int id_es = myRs.getInt("id");
				String name = myRs.getString("course_name");

				Course c = new Course(id_es, name);
				courses.add(c);
			}

			return courses;
		}
	}

	public Student getStudent(String theStudentId) throws Exception {

		Student theStudent = null;
		int studentId = Integer.parseInt(theStudentId);

		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = crearStatementGetStudent(myConn, studentId);
				ResultSet myRs = myStmt.executeQuery()) {

			// retrieve data from result set row
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String apellido = myRs.getString("apellido");
				String email = myRs.getString("email");
				String edad = myRs.getString("edad");
				List<Course> courses = getCourses(studentId);// return the student courses list

				// use the studentId during construction
				theStudent = new Student(studentId, nombre, apellido, email, edad, courses);
			} else {
				throw new Exception("Could not find student id: " + studentId);
			}

			return theStudent;
		}
	}

	private PreparedStatement crearStatementGetStudent(Connection myConn, int studentId) throws SQLException {
		// create the query wich returns the students
		String sql = "select * from student where id=?";
		PreparedStatement ps = myConn.prepareStatement(sql);
		ps.setInt(1, studentId);
		return ps;
	}

	private PreparedStatement crearStatementGetCourse(Connection myConn, int studentId) throws SQLException {
		// create the query wich returns the students get list
		String sql = "select * from student_course where student_id=?";
		PreparedStatement ps = myConn.prepareStatement(sql);
		ps.setInt(1, studentId);
		return ps;
	}

	public void updateStudent(Student theStudent) throws Exception {

		// create SQL update statement
		String sql = "update student " + "set nombre=?, apellido=?, email=? ,edad=?" + "where id=?";

		try (Connection myConn = dataSource.getConnection(); PreparedStatement myStmt = myConn.prepareStatement(sql);) {

			// set params
			myStmt.setString(1, theStudent.getNombre());
			myStmt.setString(2, theStudent.getApellido());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setString(4, theStudent.getEdad());
			myStmt.setInt(5, theStudent.getId());

			updateCourses(theStudent.getId(), theStudent);
			// execute SQL statement
			myStmt.execute();
		}
	}

	public void updateCourses(int id_es, Student theStudent) throws Exception {
		// update the student courses, first delete the allready courses and then crate
		// the new
		deleteCourses(id_es);
		addCourses(id_es, theStudent);

	}

	public void deleteCourses(int id_es) throws Exception {

		// create sql to delete coruses bye student id
		String sql = "delete from student_course where student_id=?";

		try (Connection myConn = dataSource.getConnection(); PreparedStatement myStmt = myConn.prepareStatement(sql);) {

			// set params
			myStmt.setInt(1, id_es);

			// execute sql statement
			myStmt.execute();
		}
	}

	public void deleteStudent(String theStudentId) throws Exception {

		// create sql to delete student
		String sql = "delete from student where id=?";

		try (Connection myConn = dataSource.getConnection(); PreparedStatement myStmt = myConn.prepareStatement(sql);) {

			// convert student id to int
			int studentId = Integer.parseInt(theStudentId);

			// set params
			myStmt.setInt(1, studentId);

			// execute sql statement
			myStmt.execute();
		}
	}
}
