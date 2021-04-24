package oopIntro;

public class Product {

	
// Bir constructor mutlaka calismak zorundadir, eger birden fazla constructor varsa ilgili(imzasi uyan) bir constructor calisir.	
	
public Product() {
	System.out.println("Ben calistim");
}
	
public Product(int id,String name,double unitPrice, String detail) {
	this.id=id;
	this.name=name;
	this.unitPrice=unitPrice;
	this.detail=detail;
}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
