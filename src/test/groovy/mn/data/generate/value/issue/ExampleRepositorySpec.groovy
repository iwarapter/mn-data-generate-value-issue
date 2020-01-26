package mn.data.generate.value.issue

import io.micronaut.test.annotation.MicronautTest
import mn.data.generate.value.issue.domain.ExampleEntity
import mn.data.generate.value.issue.repository.ExampleRepository
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest(transactional = false)
class ExampleRepositorySpec extends Specification {

  @Inject
  ExampleRepository repository

  def "we should see both generated ID's"() {
    given:
    ExampleEntity entity = new ExampleEntity()

    when:
    def foo = repository.save(entity)

    then:
    entity.id != null
    entity.anotherId != null
  }
}
