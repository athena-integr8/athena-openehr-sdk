package io.athena.openehr.rest.api.query.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ResultSetColumn {

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("path")
    private String path;

}
