package boot.controller;

import boot.repo.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by dzeihs on 25.11.16.
 */
@Controller
public class ListUiController {

    @Autowired
    public EntityRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "/ui")
    public String getAll() {
        return "index";
    }

}
