package et.com.aem.core.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProviderDTO {
    @SerializedName("medical_providers")
    private List<MedicalProvider> medicalProviders;

    public List<MedicalProvider> getMedicalProviders() {
        return medicalProviders;
    }

    public void setMedicalProviders(List<MedicalProvider> medicalProviders) {
        this.medicalProviders = medicalProviders;
    }

}
