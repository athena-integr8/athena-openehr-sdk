package io.athena.openehr.rest.api.system.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class OptionsAndConformance {

    @JsonProperty("solution")
    private String solution;

    @JsonProperty("solution_version")
    private String solutionVersion;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("restapi_specs_version")
    private String restapiSpecsVersion;

    @JsonProperty("conformance_profile")
    private String conformanceProfile;

    @JsonProperty("endpoints")
    private List<String> endpoints;

}
