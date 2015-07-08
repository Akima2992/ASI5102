package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Coupons;

@Stateless
@Local(CouponsDaoLocal.class)
public class CouponsDaoBean extends GenericDaoBean<Coupons, Integer> implements CouponsDaoLocal{

}
