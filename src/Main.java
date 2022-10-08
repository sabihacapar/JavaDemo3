import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.loggin.DatabaseLogger;
import core.loggin.FileLogger;
import core.loggin.Logger;
import core.loggin.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcInstructorDao;
import entites.Category;
import entites.Course;
import entites.Instructor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----Logger-------");

		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
        System.out.println("---------Instructor-----------------");

		
		Instructor instructor = new Instructor(1, "Engin", "Demirog");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), instructor, loggers);
        instructorManager.add(instructor);
        
        System.out.println("-------Category-------");
        
        Category category = new Category(1, "Java  Development");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), category, loggers);
        categoryManager.add(category);

        System.out.println("---------Course-----------------");
		
		Course course = new Course(1,"Java",12);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), course, loggers);
		courseManager.add(course);
	}

}
