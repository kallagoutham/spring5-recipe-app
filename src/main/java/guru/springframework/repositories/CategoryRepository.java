package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.hibernate.tuple.component.ComponentTuplizer;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
