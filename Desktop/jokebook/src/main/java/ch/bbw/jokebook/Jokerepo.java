package ch.bbw.jokebook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jokerepo extends CrudRepository<Joke, Long> {
    //crud (create,update,read,delete)

}
