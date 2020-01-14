package af.gov.anar.lib.audit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The Audit Entity class with required fields to be captured and recorded
 */
@Entity
@Table(name = "audit_log", schema = "audit")
@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Audit  {

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
	public Audit() {
		uuid = UUID.randomUUID().toString();
		createdAt = LocalDateTime.now();
	}

	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "event_id", nullable = false, updatable = false, length = 64)
	private String eventId;

	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "event_name", nullable = false, updatable = false, length = 128)
	private String eventName;

	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "event_type", nullable = false, updatable = false, length = 64)
	private String eventType;

	@NotNull
	@Column(name = "action_dtimes", nullable = false, updatable = false)
	private LocalDateTime actionTimeStamp;

	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "host_name", nullable = false, updatable = false, length = 128)
	private String hostName;

	@NotNull
	@Size(min = 1, max = 16)
	@Column(name = "host_ip", nullable = false, updatable = false, length = 16)
	private String hostIp;

	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "app_id", nullable = false, updatable = false, length = 64)
	private String applicationId;

	@NotNull
	@Size(min = 1, max = 128)
	@Column(name = "app_name", nullable = false, updatable = false, length = 128)
	private String applicationName;

	@NotNull
	@Size(min = 1, max = 256)
	@Column(name = "session_user_id", nullable = false, updatable = false, length = 256)
	private String sessionUserId;

	@Size(max = 128)
	@Column(name = "session_user_name", updatable = false, length = 128)
	private String sessionUserName;

	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "ref_id", nullable = false, updatable = false, length = 64)
	private String id;

	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "ref_id_type", nullable = false, updatable = false, length = 64)
	private String idType;

	@NotNull
	@Size(min = 1, max = 256)
	@Column(name = "cr_by", nullable = false, updatable = false, length = 256)
	private String createdBy;

	@Size(max = 128)
	@Column(name = "module_name", updatable = false, length = 128)
	private String moduleName;

	@Size(max = 64)
	@Column(name = "module_id", updatable = false, length = 64)
	private String moduleId;

	@Size(max = 2048)
	@Column(name = "log_desc", updatable = false, length = 2048)
	private String description;
}
