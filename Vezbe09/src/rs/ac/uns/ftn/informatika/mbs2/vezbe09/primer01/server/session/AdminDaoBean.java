package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Admin;

@Stateless
@Local(AdminDaoLocal.class) 
public class AdminDaoBean extends GenericDaoBean<Admin, Integer> implements AdminDaoLocal{

}
