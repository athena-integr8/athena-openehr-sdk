package io.athena.openehr.rest.api.query.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Map;

@Data
public class AdHocQuery {

    @JsonProperty("q")
    @NotBlank
    String query;

    @JsonProperty("offset")
    Integer offset = 0;

    @JsonProperty("fetch")
    Integer fetch;

    @JsonProperty("query_parameters")
    Map<String, Object> queryParameters;

}
