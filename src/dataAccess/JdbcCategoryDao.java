package dataAccess;

import entites.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanı kayıt işlemi tamamlandı : "+category.getCategoryName());
		
	}
}

	
