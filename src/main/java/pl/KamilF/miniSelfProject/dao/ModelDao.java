package pl.KamilF.miniSelfProject.dao;

import org.springframework.data.repository.CrudRepository;
import pl.KamilF.miniSelfProject.model.Model;

public interface ModelDao extends CrudRepository<Model,Long> {
}
