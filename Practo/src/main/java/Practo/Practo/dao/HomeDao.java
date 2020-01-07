package Practo.Practo.dao;

import java.util.List;

import Practo.Practo.Model.HomeModel;

public class HomeDao {
	public interface HomeModelDAO {
	     
	    public void saveOrUpdate(HomeModel HomeModel);
	     
	    public void delete(int HomeModelId);
	     
	    public HomeModel get(int HomeModelId);
	     
	    public List<HomeModel> list();
	}
}
