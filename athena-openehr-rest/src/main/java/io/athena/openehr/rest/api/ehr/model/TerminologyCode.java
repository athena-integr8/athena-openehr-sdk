package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TerminologyCode {

    @NotBlank
    @JsonProperty("terminology_id")
    private String terminologyId;

    @JsonProperty("terminology_version")
    private String terminologyVersion;

    @NotBlank
    @JsonProperty("code_string")
    private String codeString;

    @JsonProperty("uri")
    private String uri;

}
