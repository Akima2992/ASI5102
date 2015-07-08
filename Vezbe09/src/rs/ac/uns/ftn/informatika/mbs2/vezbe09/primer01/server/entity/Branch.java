package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6284964037084833450L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "branch_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "branch_name", unique = false, nullable = false)
	private String name;

	@Column(name = "branch_phone_number", unique = false, nullable = false)
	private String phoneNumber;

	@Column(name = "branch_address", unique = true, nullable = false)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Seller seller;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Branch() {
		super();
	}

	public Branch(Integer id, String name, String phoneNumber, String address,
			Seller seller) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.seller = seller;
	}
	
	public String toString() {
		return "(Branch)[id=" + id + ",name=" + name + "]";
	}

	

}
