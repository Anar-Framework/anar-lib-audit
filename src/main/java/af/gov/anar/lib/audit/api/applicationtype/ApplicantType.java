package af.gov.anar.lib.audit.api.applicationtype;

import af.gov.anar.lib.audit.exception.common.BaseCheckedException;

import java.util.Map;

public interface ApplicantType {

	/**
	 * @param map contains attribute and its value
	 * @return the applicant code for given attribute combination
	 * @throws BaseCheckedException if provided map or its attribute
	 *                                           value pairs is null
	 */
	public String getApplicantType(Map<String, Object> map) throws BaseCheckedException;

}