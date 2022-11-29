package application.dao;

import application.model.Panasz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
@Repository
public class PanaszDAO extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    public void insertPanasz(Panasz panasz){
        String sql = "INSERT INTO velemeny(vasarlo_id, uzenet, datum, termek) VALUES (?,?,?,?)";
        getJdbcTemplate().update(sql,new Object[]{
            panasz.getEmber_id(), panasz.getUzenet(), panasz.getIdo(), panasz.getTermek()
        });
    }
}
