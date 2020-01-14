### Audit Library of Anar Framework

#### Usage Guide

```
		<dependency>
	               <groupId>af.gov.anar.lib.audit</groupId>
	                <artifactId>anar-lib-audit</artifactId>
                        <version>${project.version}</version>
		</dependency>

```

Sample Use Case

```$xslt

	@Autowired
	private AuditHandler<AuditRequestDto> auditHandler;


		AuditRequestBuilder auditRequestBuilder = new AuditRequestBuilder();
		auditRequestBuilder.setActionTimeStamp(LocalDateTime.now(ZoneOffset.UTC))
				.setApplicationId(String.valueOf(ApplicationContext.map().get(Constants.APP_ID)))
				.setApplicationName(String.valueOf(ApplicationContext.map().get(Constants.APP_NAME)))
				.setCreatedBy(userService.userName()).setDescription(auditEventEnum.getDescription())
				.setEventId(auditEventEnum.getId()).setEventName(auditEventEnum.getName())
				.setEventType(auditEventEnum.getType()).setHostIp(hostIP).setHostName(hostName).setId(refId)
				.setIdType(refIdType).setModuleId(appModuleEnum.getId()).setModuleName(appModuleEnum.getName())
				.setSessionUserId(SessionContext.userId()).setSessionUserName(SessionContext.userName());
		auditHandler.addAudit(auditRequestBuilder.build());

```
#### Documentation

Refer to this repository **Wiki** section.
https://github.com/Anar-Framework/anar-lib-audit/wiki



