package fr.sii.sonar.web.client.js.quality;

import fr.sii.sonar.report.core.common.repository.JsonFileRuleRepository;
import fr.sii.sonar.report.core.common.repository.WithDefaultRuleRepository;

/**
 * Repository for jshint rules
 * 
 * @author Aurélien Baudet
 *
 */
public class JshintRuleRepository extends WithDefaultRuleRepository {

	public JshintRuleRepository() {
		super(new JsonFileRuleRepository(JsQualityConstants.REPOSITORY_KEY, JsQualityConstants.LANGUAGE_KEY, JsQualityConstants.REPOSITORY_NAME, JshintRuleRepository.class.getResourceAsStream(JsQualityConstants.RULES_PATH)));
	}

}