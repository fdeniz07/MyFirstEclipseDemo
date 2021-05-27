package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	/*
	 * Product getByProductName(String productName); // tek ürün getiriyor
	 * 
	 * Product getByProductNameProductAndCategoryId(String productName, int
	 * categoryId);
	 * 
	 * List<Product> getByProductNameProductOrCategoryId(String productName, int
	 * categoryId); //select * from products where product_name = abc or
	 * category_id=1
	 * 
	 * List<Product> getByCategoryIdIn(List<Integer> categories); //select * from
	 * products where category_id in(1,2,3)
	 * 
	 * List<Product> getByProductNameContains(String productName); // ürün adini
	 * iceren ürünler
	 * 
	 * List<Product> getByProductNameStartsWith(String productName); //ilgili ürün
	 * ismi ile baslayanlar
	 * 
	 * @Query("From Product where productName =:productName and categoryId=:categoryId"
	 * ) // Product bizim db tablo adimiz degil, buradaki entity adimizdir.
	 * List<Product> getByNameAndCategory(String productName, int categoryId);
	 * //select * from products where product_name = bisey or category_id=bisey
	 */
	Product getByProductName(String productName);

	Product getByProductNameAndCategory(String productName, int categoryId);

	List<Product> getByProductNameOrCategory(String productName, int categoryId);

	List<Product> getByCategoryIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);

	// select * from products where product_name=bisey and categoryId=bisey
}
