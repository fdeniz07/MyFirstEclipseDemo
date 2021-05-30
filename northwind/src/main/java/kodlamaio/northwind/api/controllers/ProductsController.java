package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController //Which layer?
@RequestMapping("/api/products") // disaridan birisi istekte bulunursa bu controller cevap verecek
public class ProductsController {

	private ProductService productService;

	@Autowired // projeyi tarar IoC yapiyor (kendi new ler bizim new lememize gerek kalmaz)
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // kodlama.io/api/products/getall -> [HttpGet]
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll(); // return new Result(true) this.productService.getAll(); Islem sonucunun basarili oldugunu bu sekilde anlatacagiz
	}
	
	
	@PostMapping("/add") 
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}

	/*
	 * @PostMapping("/add") public Result add(Product product){ return new
	 * Result(true,"Ürün eklendi"); } 7.gün videosu 1.10.00 saatine dikkat
	 */

	@GetMapping("/getByProductName") 
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameOrCategoryId") 
	public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam("productName") String productName, @RequestParam ("categoryId") int categoryId) {
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	
	
	@GetMapping("/getByProductNameContains") 
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getAllByPage") 
	DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo,pageSize);
	}
	
	@GetMapping("/getAllDesc") 
	public DataResult<List<Product>> getAllSorted() {
	return this.productService.getAllSorted();
	}
	
	@GetMapping("/getProductWithCategoryDetails") 
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return this.productService.getProductWithCategoryDetails(); 
	}
	
}




//kodlama.io/api/products