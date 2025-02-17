package model.dao;

import java.util.List;

import models.entities.Department;

public interface DepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department fidById(Integer id);
	List<Department> findAll();


}
