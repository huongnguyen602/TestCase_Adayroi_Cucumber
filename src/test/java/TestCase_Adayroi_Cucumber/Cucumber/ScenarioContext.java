package TestCase_Adayroi_Cucumber.Cucumber;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.Context;

public class ScenarioContext {
	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}

	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}

	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());

	}

	public Boolean isContain(Context key) {
		return scenarioContext.containsKey(key.toString());

	}
}
