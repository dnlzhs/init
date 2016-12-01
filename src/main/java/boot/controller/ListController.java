package boot.controller;

import boot.entity.FirstEntity;
import boot.repo.EntityRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by dzeihs on 25.11.16.
 */
@Controller
public class ListController {


    public EntityRepository repo;

 /*   @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String get() {
        List<FirstEntity> result = new ArrayList<FirstEntity>();
     //   result = (List) repo.findAll();

        return result.toString(); // new ModelAndView().addObject("name", result.) ;

    }
*/
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getAll() {

         //("/index.html");

    //    result = repo.findAll();

        return "index";

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{val}")
    public void put(@PathVariable String val) {
        FirstEntity entity = new FirstEntity();
        entity.setName(val);

        repo.save(entity);
        System.out.println(val);
    }
}
