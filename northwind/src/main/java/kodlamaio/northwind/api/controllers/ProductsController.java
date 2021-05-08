package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")  // disaridan birisi istekte bulunursa bu controller cevap verecek
public class ProductsController {



	private ProductService productService;
	
	@Autowired //projeyi tarar IoC yapiyor (kendi new ler bizim new lememize gerek kalmaz)
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")  //kodlama.io/api/products/getall -> [HttpGet]
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
}


//kodlama.io/api/products