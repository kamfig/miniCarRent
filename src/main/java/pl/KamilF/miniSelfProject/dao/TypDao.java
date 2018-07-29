package pl.KamilF.miniSelfProject.dao;

import org.springframework.data.repository.CrudRepository;
import pl.KamilF.miniSelfProject.model.Typ;

public interface TypDao extends CrudRepository<Typ,Long> {
}
