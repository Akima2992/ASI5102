package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Seller;

@Stateless
@Local(SellerDaoLocal.class)
public class SellerDaoBean extends GenericDaoBean<Seller, Integer> implements SellerDaoLocal{

}
