package boot;

import boot.repo.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dzeihs on 31.10.16.
 */
@SpringBootApplication
public class Application {

   @Autowired
   private EntityRepository entityRepository;
//test
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
