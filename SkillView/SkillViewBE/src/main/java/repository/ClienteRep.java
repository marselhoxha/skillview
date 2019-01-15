package repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteImp implements ClienteRep {

	@PersistenceContext
	private EntityManager em;

	public ClienteImp(EntityManager em) {
		super();
		this.em = em;
	}

	public ClienteImp() {
		super();
	}
	
	public ClienteImp selectById(int id) {
		try {
			return em.find(ClienteImp.class, id);
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	
	}
	
	public ArrayList<ClienteImp> selectAllImp() {

		TypedQuery<ClienteImp> qry = em.createQuery("SELECT c FROM Cliente c ", ClienteImp.class);

		return new ArrayList<ClienteImp>(qry.getResultList());
	}
	
	public boolean updateC(ClienteImp c) {

		try {
			em.merge(c);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return true;
	}
	
	public boolean insertC(ClienteImp c) {
		try {
			em.persist(c);
		} catch (Exception e) {

			e.printStackTrace();
			
		}

		return true;

	}

	public boolean deleteC(int id) {

		ClienteImp cRes = em.find(ClienteImp.class, id);

		em.remove(cRes);

		return true;
	}
	
}
