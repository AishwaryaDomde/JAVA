package Practo.Practo.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Practo.Practo.Model.HomeModel;

public class HomeService {

    private JdbcTemplate jdbcTemplate;
 
    public void HomeModelDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
//    @Override
//    public void saveOrUpdate(HomeModel HomeModel) {
//        // implementation details goes here...
//    }
// 
//    @Override
//    public void delete(int HomeModelId) {
//        // implementation details goes here...
//    }
 
    public List<HomeModel> list() {
        String sql = "SELECT * FROM register";
        List<HomeModel> listHomeModel = jdbcTemplate.query(sql, new RowMapper<HomeModel>() {
     
           public HomeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                HomeModel aHomeModel = new HomeModel();
     
                aHomeModel.setId(rs.getInt("HomeModel_id"));
                aHomeModel.setName(rs.getString("name"));
                aHomeModel.setUser(rs.getString("email"));
                aHomeModel.setPassword(rs.getString("address"));
                aHomeModel.setTelephone(rs.getString("telephone"));
     
                return aHomeModel;
            }
     
        });
     
        return listHomeModel;
    }
//    @Override
//    public HomeModel get(int HomeModelId) {
//        // implementation details goes here...
//    }
}
