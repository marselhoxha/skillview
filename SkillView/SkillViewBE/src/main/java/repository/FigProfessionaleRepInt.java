package repository;

import java.util.ArrayList;

import model.FiguraProfessionale;

public interface FigProfessionaleRep {

	public boolean insertFigProf(FiguraProfessionale obj);

	public ArrayList<FiguraProfessionale> findAllFigProf(FiguraProfessionale obj);

	public FiguraProfessionale findForIdFigProf(FiguraProfessionale obj);

	public boolean updateFigProf(FiguraProfessionale obj);

	public boolean deleteFigProf(FiguraProfessionale obj);

}
