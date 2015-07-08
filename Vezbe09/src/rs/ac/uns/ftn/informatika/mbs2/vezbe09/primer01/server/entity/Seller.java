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
@DiscriminatorValue(value="seller")
public class Seller extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7359906206799282045L;
	
	@Column(name = "user_phone_number", unique = false, nullable = true)
	private String phoneNumber;
	
	@Column(name = "user_email", unique = false, nullable = true)
	private String email;
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "seller")
	private Set<Branch> branches = new HashSet<Branch>();
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "seller")
	private Set<Offer> offers = new HashSet<Offer>();
	

	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public Set<Branch> getBranches() {
		return branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}

	public Seller() {
		super();
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

	public Seller(String phoneNumber, String email, Set<Branch> branches,
			Set<Offer> offers) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.branches = branches;
		this.offers = offers;
	}

	public void addBranch(Branch v) {
		if (v.getSeller() != null)
			v.getSeller().getBranches().remove(v);
		v.setSeller(this);
		branches.add(v);
	}

	public void remove(Branch v) {
		v.setSeller(null);
		branches.remove(v);
	}
	
	public void addOffer(Offer v) {
		if (v.getSeller() != null)
			v.getSeller().getBranches().remove(v);
		v.setSeller(this);
		offers.add(v);
	}

	public void removeOffer(Offer v) {
		v.setSeller(null);
		offers.remove(v);
	}

	
}
