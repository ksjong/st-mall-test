package stmalltest.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmalltest.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveryManagements",
    path = "deliveryManagements"
)
public interface DeliveryManagementRepository
    extends PagingAndSortingRepository<DeliveryManagement, Long> {}
