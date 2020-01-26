package mn.data.generate.value.issue.domain;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExampleEntity {

  @Id
  @GeneratedValue
  @Column(nullable = false, unique = true, updatable = false, insertable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()")
  private UUID id;

  @GeneratedValue
  @Column(nullable = false, unique = true, updatable = false, insertable = false, columnDefinition = "uuid DEFAULT uuid_generate_v4()")
  private UUID anotherId;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UUID getAnotherId() {
    return anotherId;
  }

  public void setAnotherId(UUID anotherId) {
    this.anotherId = anotherId;
  }
}
