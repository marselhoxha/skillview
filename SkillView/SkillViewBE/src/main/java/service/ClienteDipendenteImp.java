package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ClienteDipendente;
import repository.ClienteDipendenteRep;

@Service
public class ClienteDipendenteImp {

	
	@Autowired
    private ClienteDipendenteRep cdrep;
	
	
	 public ClienteDipendente selectById(int id) {

	        return cdrep.selectById(id);

	    }
	
	
	
	
}
