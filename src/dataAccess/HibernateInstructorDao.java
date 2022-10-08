package dataAccess;

import entites.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("Jdbc ile veritabanı kayıt işlemi tamamlandı : ");

	}

}
