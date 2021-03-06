package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok1 --> Getter & Setter
@Entity //Which layer? Annotation
@Table(name = "products") //table
@AllArgsConstructor // constructor with all fields
@NoArgsConstructor // no parameter constructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	/*
	 * @Column(name = "category_id") 
	 * private int categorId;
	 */

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitsInStock;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne() // Bulunan alan (products) --> Cagrilan Alan(categoreis) - product tablosunda ayni categoryid birden cok yerde tekrar eder
	@JoinColumn(name="category_id")
	private Category category;
}
