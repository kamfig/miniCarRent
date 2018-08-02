package pl.KamilF.miniSelfProject.dao;

import org.springframework.data.repository.CrudRepository;
import pl.KamilF.miniSelfProject.model.User;

public interface UserDao extends CrudRepository<User,Long> {
}
