package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Stores data for Author objects.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
