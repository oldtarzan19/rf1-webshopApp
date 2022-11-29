package application.dao;

import application.model.Arucikk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ArucikkDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }


    public void insertArucikk(Arucikk arucikk) {
        String sql = "INSERT INTO arucikk(nev,ar,db) VALUES (?,?,?)";
        getJdbcTemplate().update(sql, new Object[] {
                arucikk.getNev(),arucikk.getAr(),arucikk.getDb()
        });
    }

   public void deleteArucikk(int id) {
       String sql = "DELETE FROM arucikk WHERE id=" + id;
       getJdbcTemplate().update(sql);
   }

    public  List<Arucikk> listArucikks() {
        String sql = "SELECT * FROM arucikk";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Arucikk> result = new ArrayList<Arucikk>();
        for (Map<String, Object> row : rows) {
            Arucikk arucikk = new Arucikk();
            String id =  row.get("id").toString();
            String nev =  row.get("nev").toString();
            String ar =  row.get("ar").toString();
            String db =  row.get("db").toString();

            arucikk.setId(Integer.parseInt(id));
            arucikk.setNev(nev);
            arucikk.setAr(Float.parseFloat(ar));
            arucikk.setDb(Float.parseFloat(db));

            result.add(arucikk);
        }
        return result;
    }

    public Arucikk getArucikkById(int id) {
        String sql = "SELECT * FROM arucikk WHERE id=" + id;
        List < Map < String, Object >> rows = getJdbcTemplate().queryForList(sql);

        List < Arucikk > result = new ArrayList < Arucikk>();
        for (Map < String, Object > row: rows) {
            Arucikk arucikk = new Arucikk();
            arucikk.setId((Integer) row.get("id"));
            arucikk.setNev((String) row.get("nev"));
            arucikk.setAr((Integer) row.get("ar"));
            arucikk.setDb((Integer) row.get("ar"));

            result.add(arucikk);
        }

        return result.get(0);
    }

    public void updateAru(int id, float ar, float db) {
        String sql = "UPDATE arucikk SET ar='" + ar + "', db='" + db + "' WHERE id=" + id;
        getJdbcTemplate().update(sql);
    }
}

