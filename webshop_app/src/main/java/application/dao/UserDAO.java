package application.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import application.model.Arucikk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import application.model.User;

@Repository
public class UserDAO extends JdbcDaoSupport {

  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  DataSource dataSource;

  @PostConstruct
  private void initialize() {
    setDataSource(dataSource);
  }

  public void insertUser(User user) {
    String sql = "INSERT INTO vasarlo(felhasznalonev,email, password,cim,felhasznalhato_keret, role) VALUES (?, ?, ?,?,?,?)";
    getJdbcTemplate().update(sql, new Object[] {
      user.getFelhasznalonev(),user.getEmail(), passwordEncoder.encode(user.getPassword()),user.getCim(),user.getFelhasznalhato_keret(), user.getRole()
    });
    System.out.println(user.getId()+user.getFelhasznalonev());
  }
  public  List<User> listUsers() {
    String sql = "SELECT * FROM vasarlo";
    List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

    List<User> result = new ArrayList<User>();
    for (Map<String, Object> row : rows) {
      User user = new User();
      String id =  row.get("id").toString();
      String felhasznalonev =  row.get("felhasznalonev").toString();
      String email =  row.get("email").toString();
      String password =  row.get("password").toString();
      String cim =  row.get("cim").toString();
      String felhasznalhato_keret =  row.get("felhasznalhato_keret").toString();
      String role =  row.get("role").toString();

      user.setId(Integer.parseInt(id));
      user.setFelhasznalonev(felhasznalonev);
      user.setEmail(email);
      user.setPassword(password);
      user.setCim(cim);
      user.setFelhasznalhato_keret(Float.parseFloat(felhasznalhato_keret));
      user.setRole(role);
      result.add(user);
    }
    return result;
  }



  public User getUserById(int id) {
    String sql = "SELECT * FROM vasarlo WHERE id=?";
    List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql, id);
    BigDecimal bigDecimal;
  float floatValue;
    List < User > result = new ArrayList < User > ();
    for (Map < String, Object > row: rows) {
      User user = new User();
      user.setId((Integer) row.get("id"));
      user.setFelhasznalonev((String) row.get("felhasznalonev"));
      user.setEmail((String) row.get("email"));
      user.setPassword((String) row.get("password"));
      user.setCim((String) row.get("cim"));
      bigDecimal= (BigDecimal) row.get("felhasznalhato_keret");
      floatValue=bigDecimal.floatValue();
      user.setFelhasznalhato_keret(floatValue);
      user.setRole((String) row.get("role"));
      result.add(user);
    }

    return result.get(0);
  }



  public User getUserByUsername(String felhasznalonev) {
    String sql = "SELECT * FROM vasarlo WHERE felhasznalonev=?";
    List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql, felhasznalonev);
    if (rows.size()==0){
      return new User();
    }
    List < User > result = new ArrayList < User > ();
    for (Map < String, Object > row: rows) {
      User user = new User();
      user.setId((Integer) row.get("id"));
      user.setFelhasznalonev((String) row.get("felhasznalonev"));
      user.setEmail((String) row.get("email"));
      user.setPassword((String) row.get("password"));
      user.setCim((String) row.get("cim"));
      String felhasznalhatoKeret = row.get("felhasznalhato_keret").toString();
      user.setFelhasznalhato_keret(Float.parseFloat(felhasznalhatoKeret));
      user.setRole((String) row.get("role"));

      result.add(user);
    }

    return result.get(0);
  }

 public User getUserByEmail(String email) {
    String sql = "SELECT * FROM vasarlo WHERE email=?";
    List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql, email);

    List < User > result = new ArrayList < User > ();
    for (Map < String, Object > row: rows) {
      User user = new User();
      user.setId((Integer) row.get("id"));
      user.setFelhasznalonev((String) row.get("felhasznalonev"));
      user.setEmail((String) row.get("email"));
      user.setPassword((String) row.get("password"));
      user.setCim((String) row.get("cim"));
      String felhasznalhatoKeret = row.get("felhasznalhato_keret").toString();
      user.setFelhasznalhato_keret(Float.parseFloat(felhasznalhatoKeret));
      result.add(user);
    }
    return result.get(0);
  }


  public void deleteUser(int id) {
    String sql = "DELETE FROM vasarlo WHERE id=" + id;
    getJdbcTemplate().update(sql);
  }

  public void updateUser(int id, String felhasznalonev, String email,String cim) {
    String sql = "UPDATE vasarlo SET felhasznalonev='" + felhasznalonev + "', email='" + email +"', cim='"+cim+"' WHERE id=" + id;
    getJdbcTemplate().update(sql);
  }

  public void updateUserKeret(int id, int felhKeret) {
    String sql = "UPDATE vasarlo SET felhasznalhato_keret="+felhKeret+" WHERE id=" + id;
    getJdbcTemplate().update(sql);
  }
}