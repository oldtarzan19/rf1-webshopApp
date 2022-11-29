package application.dao;

import application.model.Arucikk;
import application.model.Kosar;
import application.model.Szallitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class KosarDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public void insertKosar(Kosar kosar) {
        String sql = "INSERT INTO vasarlasok(vasarlo_id,vasarolt_termekek,vegosszeg) VALUES (?,?,?)";
        getJdbcTemplate().update(sql, new Object[] {
                kosar.getUserId(),kosar.termekListazas(),kosar.getOsszAr()
        });
    }

    public void insertSzallitas(Szallitas szallitas){
        String sql ="INSERT INTO szallitas(vasarlo_id,cim,arucikkek,vegosszeg) VALUES (?,?,?,?)";
        getJdbcTemplate().update(sql, new Object[] {
                szallitas.getVasarlo_id(),szallitas.getCim(),szallitas.getArucikkek(),szallitas.getVegosszeg()
        });
    }

    public List<Szallitas> listSzallitasok() {
        String sql = "SELECT * FROM szallitas";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<Szallitas> result = new ArrayList<Szallitas>();
        for (Map<String, Object> row : rows) {
            Szallitas szallitas = new Szallitas();
            String id =  row.get("id").toString();
            String vasarlo_id =  row.get("vasarlo_id").toString();
            String cim =  row.get("cim").toString();
            String arucikkek =  row.get("arucikkek").toString();
            String vegosszeg =  row.get("vegosszeg").toString();

            szallitas.setId(Integer.parseInt(id));
            szallitas.setVasarlo_id(Integer.parseInt(vasarlo_id));
            szallitas.setCim(cim);
            szallitas.setVegosszeg(Float.parseFloat(vegosszeg));
            szallitas.setArucikkek(arucikkek);

            result.add(szallitas);
        }
        return result;
    }

    public void deleteSzallitasok(int id) {
        String sql = "DELETE FROM szallitas WHERE id=" + id;
        getJdbcTemplate().update(sql);
    }
    public void updateSzallitasok(int id, int vasarlo_id,String cim,String arucikkek, float vegosszeg) {
        String sql = "UPDATE szallitas SET vasarlo_id='" + vasarlo_id +"', cim='"+cim+"', arucikkek='"+arucikkek+"', vegosszeg='"+vegosszeg+"' WHERE id=" + id;
        getJdbcTemplate().update(sql);
    }
}
