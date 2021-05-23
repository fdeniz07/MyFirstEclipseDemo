package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
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
		return this.productService.getAll(); // return new Result(true) this.productService.getAll(); Islem sonucunun
												// basarili oldugunu bu sekilde anlatacagiz
	}
	
	
	@PostMapping("/add") 
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}

	/*
	 * @PostMapping("/add") public Result add(Product product){ return new
	 * Result(true,"Ürün eklendi"); } 7.gün videosu 1.10.00 saatine dikkat
	 */

}

//kodlama.io/api/products