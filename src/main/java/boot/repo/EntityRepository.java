package boot.repo;

import boot.entity.FirstEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends CrudRepository<FirstEntity,Long>
{
    FirstEntity findByName( String name );

   // @Query("SELECT e FROM FirstEntity WHERE e.id = :id")
    //FirstEntity doSomething(@Param("id") Long id);
}
