package io.athena.openehr.rest.api.query.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Map;

@Data
public class StoredQuery {

    @JsonProperty("offset")
    @NotNull
    private Integer offset = 0;

    @JsonProperty("fetch")
    @NotNull
    private Integer fetch;

    @JsonProperty("query_parameters")
    @NotNull
    private Map<String, Object> queryParameters;

}
