package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1310578010321958741L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "category_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "category_name", unique = false, nullable = false)
	private String name;

	@Column(name = "category_description", unique = false, nullable = false)
	private String description;
	
	@OneToMany(cascade={ALL}, fetch =FetchType.EAGER, mappedBy = "category")
	private Set<Offer> offers = new HashSet<Offer>();

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public void addOffer(Offer v) {
		if (v.getCategory() != null)
			v.getCategory().getOffers().remove(v);
		v.setCategory(this);
		offers.add(v);
	}

	public void remove(Offer v) {
		v.setCategory(null);
		offers.remove(v);
	}
	
	public Category() {
		super();
	}

	public Category(Integer id, String name, String description,
			Set<Offer> offers) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.offers = offers;
	}
	
	public String toString() {
		return "(Category)[id=" + id + ",name=" + name + "]";
	}
}
