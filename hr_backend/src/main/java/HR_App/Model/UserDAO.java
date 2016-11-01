package HR_App.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by kurtmccann on 10/25/16.
 */

@Transactional
@RepositoryRestResource (collectionResourceRel = "users", path = "hrusers")
@Repository

public interface UserDAO extends CrudRepository<User, Integer>
{
   List<User> findByLastName(@Param("lastName") String lastName);

   //localhost:8080/hrusers/search/findByLastName?lastName=Momma
}
