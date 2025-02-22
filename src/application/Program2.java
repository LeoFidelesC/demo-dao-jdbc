package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentDao departmentDao=DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: seller findById===");
		Department dep=departmentDao.fidById(3);
		
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department insert===");
		Department newDepartment =new Department(null,"RH");
		departmentDao.insert(newDepartment);
		System.out.println("Insert!New id = "+ newDepartment.getId());
		
		System.out.println("=== TEST 3: department update===");
		dep=departmentDao.fidById(5);
		dep.setName("TI");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 4: department delete===");
		System.out.print("Enter id for delete:");
		int id=sc.nextInt();
		
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");
		sc.close();
		
		
		System.out.println("=== TEST 5: department findAll===");
		List<Department> list=departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
	}

}
