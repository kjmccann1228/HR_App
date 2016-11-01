package HR_App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kurtmccann on 10/25/16.
 */
@Entity
public class Timecard
{
    public Timecard(){};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private int userId;
    private String time_in;
    private String time_out;

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getTime_in()
    {
        return time_in;
    }

    public void setTime_in(String time_in)
    {
        this.time_in = time_in;
    }

    public String getTime_out()
    {
        return time_out;
    }

    public void setTime_out(String time_out)
    {
        this.time_out = time_out;
    }
}
