package rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.session;

import javax.ejb.Local;
import javax.ejb.Stateless;

import rs.ac.uns.ftn.informatika.mbs2.vezbe09.primer01.server.entity.Category;

@Stateless
@Local(CategoryDaoLocal.class)
public class CategoryDaoBean  extends GenericDaoBean<Category, Integer> implements
CategoryDaoLocal {

}