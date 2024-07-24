package et.com.aem.core.models;

import com.google.gson.Gson;
import et.com.aem.core.api.MedicalProvider;
import et.com.aem.core.api.ProviderDTO;
import et.com.aem.core.services.ProviderService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProviderModel {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderModel.class);

    @OSGiService
    private ProviderService providerService;

    @ValueMapValue
    private String title;

    private List<MedicalProvider> providers;

    @PostConstruct
    protected void init() {
        ProviderDTO providerDTO = providerService.getProviderData();
        if (providerDTO != null && !providerDTO.getMedicalProviders().isEmpty()) {
            this.providers = providerDTO.getMedicalProviders();
            LOG.info("Provider data initialized: {}", new Gson().toJson(providers));
        } else {
            LOG.error("Received empty or null JSON data from the provider service");
        }
    }

    public List<MedicalProvider> getProviders() {
        return providers;
    }

    public String getTitle() {
        return title;
    }
}
