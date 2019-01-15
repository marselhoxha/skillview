package repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRep {

	public ClienteImp selectById(int id);

	public ArrayList<ClienteImp> selectAllImp();

	public boolean updateC(ClienteImp c);

	public boolean insertC(ClienteImp c);

	public boolean deleteC(int id);

}
