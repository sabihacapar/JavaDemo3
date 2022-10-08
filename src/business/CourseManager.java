package business;

import core.loggin.Logger;
import dataAccess.CourseDao;
import entites.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Course _course;
	
	private Logger[] loggers;
	
	
	
	public CourseManager(CourseDao courseDao, Course _course, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this._course = _course;
		this.loggers = loggers;
	}

	
	public void add(Course course) {
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName()+" "+course.getUnitPrice());
		}
	}
	
}
