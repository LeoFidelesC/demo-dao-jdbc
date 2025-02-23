package model.dao;

import java.util.List;

import models.entities.Department;
import models.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller fidById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);

	

}
