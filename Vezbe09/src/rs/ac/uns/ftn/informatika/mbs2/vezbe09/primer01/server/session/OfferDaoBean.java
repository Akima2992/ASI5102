package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Offer;

@Stateless
@Local(OfferDaoLocal.class)
public class OfferDaoBean extends GenericDaoBean<Offer, Integer> implements OfferDaoLocal {

}
