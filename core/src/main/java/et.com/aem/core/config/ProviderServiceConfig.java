package et.com.aem.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Provider Service Configuration Url")
public @interface ProviderServiceConfig {
    @AttributeDefinition(name = "Provider API URL", description = "URL for the Provider API")
    String apiUrl();
}
