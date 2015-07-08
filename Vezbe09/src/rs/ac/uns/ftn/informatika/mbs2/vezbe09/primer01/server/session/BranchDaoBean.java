package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Branch;

@Stateless
@Local(BranchDaoLocal.class)
public class BranchDaoBean extends GenericDaoBean<Branch, Integer> implements BranchDaoLocal {

}
