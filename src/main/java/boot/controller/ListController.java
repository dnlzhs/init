package boot.controller;

import boot.entity.FirstEntity;
import boot.repo.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by dzeihs on 25.11.16.
 */
@RestController
public class ListController {

    @Autowired
    public EntityRepository repo;

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    public Iterable<FirstEntity> getAll() {
        return repo.findAll();
    }

}
