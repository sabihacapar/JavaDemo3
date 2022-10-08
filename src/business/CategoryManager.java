package business;

import core.loggin.Logger;
import dataAccess.CategoryDao;
import entites.Category;

public class CategoryManager {
	
	private CategoryDao _categoryDao;
	
	private Category _category;
	
	private Logger[] loggers;

	public CategoryManager(CategoryDao _categoryDao, Category _category, Logger[] loggers) {
		super();
		this._categoryDao = _categoryDao;
		this._category = _category;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		_categoryDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(_category.getCategoryName());
		}
	}
	
	
	

}
