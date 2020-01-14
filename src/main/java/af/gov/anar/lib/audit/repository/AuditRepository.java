
package af.gov.anar.lib.audit.repository;

import af.gov.anar.lib.audit.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface with data access and data modification functions on
 * {@link Audit}
 */
public interface AuditRepository extends JpaRepository<Audit, String> {

}
