package repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDipendenteRep {

	
	public ClienteDipendenteImp selectById(int id);
	
	public ArrayList<ClienteDipendenteImp> selectAllImp();
	
	public boolean updateCD(ClienteDipendenteImp c);
	
	public boolean insertCD(ClienteDipendenteImp c);
	
	public boolean deleteCD(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
