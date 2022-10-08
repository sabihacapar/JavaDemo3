package business;

import core.loggin.Logger;
import dataAccess.InstructorDao;
import entites.Instructor;

public class InstructorManager {
	
	private InstructorDao _instructorDao;
	
	private Instructor _instructor;
	
	private Logger[] _loggers;

	public InstructorManager(InstructorDao _instructorDao, Instructor _instructor, Logger[] _loggers) {
		super();
		this._instructorDao = _instructorDao;
		this._instructor = _instructor;
		this._loggers = _loggers;
	}

	public void add(Instructor instructor) {
		_instructorDao.add(instructor);
		
		for(Logger logger : _loggers) {
			logger.log(_instructor.getFirstName()+" "+_instructor.getLastName());
		}
	}
	

}
