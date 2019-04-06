package domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ADS")
@Data
public class Ad implements Serializable {
	
	private static final long serialVersionUID = 7543806998039911375L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AD_ID")
	long id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="DATE")
	private Date date;
	
	@ManyToOne
	private Category category;
	// private ArrayList<BufferedImage> photos
	
	public Ad(String title, String description, double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += title;
		str += " " + description;
		str += " " + price;
		return str;
	}
}
