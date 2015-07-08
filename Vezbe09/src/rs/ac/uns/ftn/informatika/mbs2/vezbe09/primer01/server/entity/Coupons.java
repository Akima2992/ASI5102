package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coupons")
public class Coupons implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "coupons_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "coupons_identifier", unique = false, nullable = false)
	private String couponIdentifier;
	
	@Column(name = "coupons_used", unique = false, nullable = false)
	private Boolean used;
	
	@Column(name = "coupons_valid_to", unique = false, nullable = false)
	private Date validTo;
	
	@Column(name = "coupons_active", unique = false, nullable = false)
	private Boolean active;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Buyer buyer;
	
	@ManyToOne
	@JoinColumn(name = "offer_id", referencedColumnName = "offer_id", nullable = false)
	private Offer offer;
	
	public Coupons() {
		super();
	}
	
	
	
	public Coupons(Integer id, String couponIdentifier, Boolean used,
			Date validTo, Boolean active, Buyer buyer, Offer offer) {
		super();
		this.id = id;
		this.couponIdentifier = couponIdentifier;
		this.used = used;
		this.validTo = validTo;
		this.active = active;
		this.buyer = buyer;
		this.offer = offer;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCouponIdentifier() {
		return couponIdentifier;
	}



	public void setCouponIdentifier(String couponIdentifier) {
		this.couponIdentifier = couponIdentifier;
	}



	public Boolean getUsed() {
		return used;
	}



	public void setUsed(Boolean used) {
		this.used = used;
	}



	public Date getValidTo() {
		return validTo;
	}



	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}



	public Boolean getActive() {
		return active;
	}



	public void setActive(Boolean active) {
		this.active = active;
	}



	public Buyer getBuyer() {
		return buyer;
	}



	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}



	public Offer getOffer() {
		return offer;
	}



	public void setOffer(Offer offer) {
		this.offer = offer;
	}



	public String toString() {
		return "(Coupons)[id=" + id + ",identifier=" + couponIdentifier + "]";
	}
}
