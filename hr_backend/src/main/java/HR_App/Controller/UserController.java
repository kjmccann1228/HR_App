package HR_App.Controller;

import HR_App.Model.User;
import HR_App.Model.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kurtmccann on 10/25/16.
 */
//@Controller
@CrossOrigin("http://localhost:9000")
@RestController
public class UserController
{
    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUser(@RequestBody User user)
    {
        System.out.println(user);
        userDAO.save(user);
        return user;
    }

    @RequestMapping(value = "/readUsers", method = RequestMethod.GET)
    public Iterable<User> readUsers()
    {
        return userDAO.findAll();
    }

//    @RequestMapping(value = "/findUserByLastName", method=RequestMethod.POST)
//    public User findByLastName(String cowabunga)
//    {
//        System.out.println("Raawwwr: " + cowabunga);
//        Iterable<User> users = userDAO.findAll();
//        for(User user : users)
//        {
//            if (user.getLastName().equals("Momma"));
//            {
//                return user;
//            }
//        }
//
//        return null;
//    }

}
