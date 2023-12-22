package io.athena.openehr.rest.api.query.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultSetMetadata {

    @JsonProperty("_href")
    private String href;

    @JsonProperty("_type")
    private String type;

    @JsonProperty("_schema_version")
    private String schemaVersion;

    @JsonProperty("_created")
    private String created;

    @JsonProperty("_generator")
    private String generator;

    @JsonProperty("_executed_aql")
    private String executedAQL;

}
