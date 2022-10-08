package dataAccess;

import entites.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanı kayıt işlemi tamamlandı : "+course.getCourseName()+""+course.getUnitPrice());
	}
	
	

}
