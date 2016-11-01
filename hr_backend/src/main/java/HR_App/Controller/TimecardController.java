package HR_App.Controller;


import HR_App.Model.Timecard;
import HR_App.Model.TimecardDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Created by kurtmccann on 10/25/16.
 */
@CrossOrigin("http://localhost:9000")
@RestController
public class TimecardController
{
    @Autowired
    TimecardDAO timecardDAO;

    @RequestMapping(value = "/createTimecard", method = RequestMethod.POST)
    public Timecard createTimecard(@RequestBody Timecard timecard)
    {
        System.out.println("Howdy");
        System.out.println(timecard);
        timecardDAO.save(timecard);
        return timecard;
    }

    @RequestMapping(value = "/readTimecards", method = RequestMethod.POST)
    public Iterable<Timecard> readTimecard()
    {
        return timecardDAO.findAll();
    }


}
