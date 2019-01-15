package repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteDipendenteImp implements ClienteDipendenteRep{
	
	
	@PersistenceContext
	private EntityManager em;

	public ClienteDipendenteImp(EntityManager em) {
		super();
		this.em = em;
	}

	public ClienteDipendenteImp() {
		super();
	}
	
	public ClienteDipendenteImp selectById(int id) {
		try {
			return em.find(ClienteDipendenteImp.class, id);
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	
	}
	
	public ArrayList<ClienteDipendenteImp> selectAllImp() {

		TypedQuery<ClienteDipendenteImp> qry = em.createQuery("SELECT c FROM ClienteDipendente c ", ClienteDipendenteImp.class);

		return new ArrayList<ClienteDipendenteImp>(qry.getResultList());
	}
	
	public boolean updateCD(ClienteDipendenteImp c) {

		try {
			em.merge(c);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return true;
	}
	
	public boolean insertCD(ClienteDipendenteImp c) {
		try {
			em.persist(c);
		} catch (Exception e) {

			e.printStackTrace();
			
		}

		return true;

	}

	public boolean deleteCD(int id) {

		ClienteDipendenteImp cRes = em.find(ClienteDipendenteImp.class, id);

		em.remove(cRes);

		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	


