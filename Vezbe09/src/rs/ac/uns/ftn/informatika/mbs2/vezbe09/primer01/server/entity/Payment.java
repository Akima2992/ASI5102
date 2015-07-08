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
@Table(name="payment")
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6724820298073696004L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "payment_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "payment_price", unique = false, nullable = false)
	private Double price;
	
	@Column(name = "payment_made", unique = false, nullable = false)
	private Boolean paymentMade;
	
	@Column(name = "payment_cancelled", unique = false, nullable = false)
	private Boolean canceled;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Buyer buyer;
	
	@ManyToOne
	@JoinColumn(name = "offer_id", referencedColumnName = "offer_id", nullable = false)
	private Offer offer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getPaymentMade() {
		return paymentMade;
	}

	public void setPaymentMade(Boolean paymentMade) {
		this.paymentMade = paymentMade;
	}

	public Boolean getCanceled() {
		return canceled;
	}

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
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

	public Payment(Integer id, Double price, Boolean paymentMade,
			Boolean canceled, Buyer buyer, Offer offer) {
		super();
		this.id = id;
		this.price = price;
		this.paymentMade = paymentMade;
		this.canceled = canceled;
		this.buyer = buyer;
		this.offer = offer;
	}
	
	public Payment() {
		super();
	}
	
	public String toString() {
		return "(Payment)[id=" + id + ",price=" + price + "]";
	}
}
