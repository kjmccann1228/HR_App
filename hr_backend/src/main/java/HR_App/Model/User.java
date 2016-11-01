package HR_App.Model;

import javax.persistence.*;

/**
 * Created by kurtmccann on 10/25/16.
 */
@Entity
public class User
{
    public User(){};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
//    @Column(name="last_name")
    private String lastName;
//    @Column(name="FirstName")
    private String firstName;
    private double payRate;

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

}
