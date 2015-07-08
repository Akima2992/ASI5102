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
@Table(name="image")
public class Image implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5521928939785912982L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "image_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "image_location", unique = false, nullable = false)
	private String location;

	
	@ManyToOne
	@JoinColumn(name = "offer_id", referencedColumnName = "offer_id", nullable = false)
	private Offer offer;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Offer getOffer() {
		return offer;
	}


	public void setOffer(Offer offer) {
		this.offer = offer;
	}


	public Image(Integer id, String location, Offer offer) {
		super();
		this.id = id;
		this.location = location;
		this.offer = offer;
	}
	
	public Image() {
		super();
	}
	
	public String toString() {
		return "(Image)[id=" + id + ",location=" + location + "]";
	}
	
}
