package fi.multisilta.liquibase.repo;


import fi.multisilta.liquibase.model.TestItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestItemRepository extends PagingAndSortingRepository<TestItem, Long> {

}
