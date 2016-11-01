package HR_App.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kurtmccann on 10/25/16.
 */
@Repository
public interface TimecardDAO extends CrudRepository<Timecard, Integer>
{
 //   public Timecard getTimecardByID(int id);
}
