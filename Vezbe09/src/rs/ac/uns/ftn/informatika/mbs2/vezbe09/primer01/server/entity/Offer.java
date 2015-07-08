package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3495002563483611515L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "offer_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "offer_name", unique = false, nullable = false)
	private String name;
	
	@Column(name = "offer_date_created", unique = false, nullable = false)
	private Date dateCreated;
	
	@Column(name = "offer_expiration_date", unique = false, nullable = false)
	private Date expirationDate;

	@Column(name = "offer_valid_from", unique = false, nullable = false)
	private Date validFrom;
	
	@Column(name = "offer_valid_to", unique = false, nullable = false)
	private Date validTo;
	
	@Column(name = "offer_regular_price", unique = false, nullable = false)
	private Double regularPrice;
	
	@Column(name = "offer_sale_price", unique = false, nullable = false)
	private Double salePrice;
	
	@Column(name = "offer_max_offers", unique = false, nullable = false)
	private Integer maxOffers;
	
	@Column(name = "offer_description", unique = false, nullable = false)
	private String description;
	
	@Column(name = "offer_purchased_offers", unique = false, nullable = false)
	private Integer purchasedOffers;
	
	@Column(name = "offer_active", unique = false, nullable = false)
	private Boolean active;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Seller seller;
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "offer")
	private Set<Coupons> coupons = new HashSet<Coupons>();
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "offer")
	private Set<Payment> payments = new HashSet<Payment>();

	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "offer")
	private Set<Comment> comments = new HashSet<Comment>();
	
	@OneToMany(cascade = { ALL }, fetch =FetchType.EAGER, mappedBy = "offer")
	private Set<Image> images = new HashSet<Image>();

	public Offer() {
		super();
	}
	
	
	
	public Offer(Integer id, String name, Date dateCreated,
			Date expirationDate, Date validFrom, Date validTo,
			Double regularPrice, Double salePrice, Integer maxOffers,
			String description, Integer purchasedOffers, Boolean active,
			Category category, Seller seller, Set<Coupons> coupons,
			Set<Payment> payments, Set<Comment> comments, Set<Image> images) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreated = dateCreated;
		this.expirationDate = expirationDate;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.regularPrice = regularPrice;
		this.salePrice = salePrice;
		this.maxOffers = maxOffers;
		this.description = description;
		this.purchasedOffers = purchasedOffers;
		this.active = active;
		this.category = category;
		this.seller = seller;
		this.coupons = coupons;
		this.payments = payments;
		this.comments = comments;
		this.images = images;
	}



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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public Double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(Double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getMaxOffers() {
		return maxOffers;
	}

	public void setMaxOffers(Integer maxOffers) {
		this.maxOffers = maxOffers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPurchasedOffers() {
		return purchasedOffers;
	}

	public void setPurchasedOffers(Integer purchasedOffers) {
		this.purchasedOffers = purchasedOffers;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Set<Coupons> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupons> coupons) {
		this.coupons = coupons;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

	public void addPayment(Payment p) {
		if (p.getOffer() != null)
			p.getOffer().getPayments().remove(p);
		p.setOffer(this);
		payments.add(p);
	}

	public void removePayment(Payment v) {
		v.setOffer(null);
		payments.remove(v);
	}
	
	public void addCoupons(Coupons p) {
		if (p.getOffer() != null)
			p.getOffer().getCoupons().remove(p);
		p.setOffer(this);
		coupons.add(p);
	}

	public void removeCoupons(Coupons v) {
		v.setOffer(null);
		coupons.remove(v);
	}
	
	public void addComment(Comment p) {
		if (p.getOffer() != null)
			p.getOffer().getComments().remove(p);
		p.setOffer(this);
		comments.add(p);
	}

	public void removeComment(Comment v) {
		v.setOffer(null);
		comments.remove(v);
	}
	
	public void addImage(Image p) {
		if (p.getOffer() != null)
			p.getOffer().getImages().remove(p);
		p.setOffer(this);
		images.add(p);
	}

	public void removeImage(Image v) {
		v.setOffer(null);
		images.remove(v);
	}
	

}
