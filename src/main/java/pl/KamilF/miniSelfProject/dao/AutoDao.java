package pl.KamilF.miniSelfProject.dao;

import org.springframework.data.repository.CrudRepository;
import pl.KamilF.miniSelfProject.model.Auto;

public interface AutoDao extends CrudRepository<Auto,Long> {
}
