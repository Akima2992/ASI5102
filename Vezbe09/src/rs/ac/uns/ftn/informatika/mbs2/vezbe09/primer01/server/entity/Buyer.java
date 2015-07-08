package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
@Entity
@DiscriminatorValue(value="buyer")
public class Buyer extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3694984987880998375L;

	@Column(name = "user_phone_number", unique = false, nullable = true)
	private String phoneNumber;
	
	@Column(name = "user_email", unique = false, nullable = true)
	private String email;
	
	@Column(name = "user_address", unique = false, nullable = true)
	private String address;
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "buyer")
	private Set<Payment> payments = new HashSet<Payment>();
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "buyer")
	private Set<Coupons> coupons = new HashSet<Coupons>();
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "buyer")
	private Set<Comment> comments = new HashSet<Comment>();
	
	public Buyer() {
		super();
	}

	public Buyer(Integer id, String firstName, String lastName, String username,
			String password, String phoneNumber, String email, String address) {
		super(id, firstName, lastName,  username,password);
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	//dodaj add i to

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<Coupons> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupons> coupons) {
		this.coupons = coupons;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	

}
