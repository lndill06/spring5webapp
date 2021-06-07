package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Stores data for Publisher objects.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
