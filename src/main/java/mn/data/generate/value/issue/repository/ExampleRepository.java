package mn.data.generate.value.issue.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import java.util.Optional;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import mn.data.generate.value.issue.domain.ExampleEntity;

@Repository
public interface ExampleRepository extends PageableRepository<ExampleEntity, UUID> {

  Optional<ExampleEntity> findByAnotherId(@NotNull UUID id);

}
