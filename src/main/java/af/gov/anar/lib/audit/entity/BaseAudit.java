package af.gov.anar.lib.audit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Base class for {@link Audit} with {@link #uuid} and {@link #createdAt}
 */
@MappedSuperclass
@Data
@AllArgsConstructor
public class BaseAudit {

	/**
	 * Field for immutable universally unique identifier (UUID)
	 */
	@Id
	@Column(name = "log_id", nullable = false, updatable = false)
	private String uuid;

	@Column(name = "log_dtimes", nullable = false, updatable = false)
	private LocalDateTime createdAt;

	/**
	 * Constructor to initialize {@link BaseAudit} with uuid and timestamp
	 */
	public BaseAudit() {
		uuid = UUID.randomUUID().toString();
		createdAt = LocalDateTime.now();
	}

}
