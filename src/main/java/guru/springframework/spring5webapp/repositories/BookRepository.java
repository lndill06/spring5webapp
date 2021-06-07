package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Stores data for Book objects.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
