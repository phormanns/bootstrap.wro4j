package de.jalin.wro4j;

import java.util.Map;

import ro.isdc.wro.manager.factory.ConfigurableWroManagerFactory;
import ro.isdc.wro.model.resource.processor.ResourcePostProcessor;
import ro.isdc.wro.model.resource.processor.ResourcePreProcessor;

public class CustomizedWroManagerFactory extends ConfigurableWroManagerFactory {

	@Override
	protected void contributePreProcessors(Map<String, ResourcePreProcessor> map) {
		super.contributePreProcessors(map);
	}
	
	@Override
	protected void contributePostProcessors(
			Map<String, ResourcePostProcessor> map) {
		map.put("updatedLessCss", new UpdatedLessCssProcessor());
		super.contributePostProcessors(map);
	}
	
}
