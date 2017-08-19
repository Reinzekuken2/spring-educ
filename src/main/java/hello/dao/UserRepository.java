package hello.dao;

import hello.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by User on 19.08.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {


}
