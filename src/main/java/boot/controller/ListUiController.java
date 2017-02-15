package boot.controller;

import boot.repo.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by dzeihs on 25.11.16.
 */
@Controller
public class ListUiController {

    @Autowired
    public EntityRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "/ui")
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("time", new Date());
        map.put("message", "Hello World.");
        return (new ModelAndView( "index", map));
    }

}
