package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao= DaoFactory.createSellerDao();
		
		Seller seller=sellerDao.fidById(3);
		
		
		System.out.println(seller);
	}
}
