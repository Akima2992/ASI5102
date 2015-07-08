package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="admin")
public class Admin extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6462461558567103045L;

}
