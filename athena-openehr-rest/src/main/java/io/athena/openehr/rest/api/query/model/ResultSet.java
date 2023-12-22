package io.athena.openehr.rest.api.query.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ResultSet {

    @JsonProperty("meta")
    private ResultSetMetadata metadata;

    @JsonProperty("name")
    private String name;

    @JsonProperty("q")
    private String query;

    @JsonProperty("columns")
    private List<ResultSetColumn> columns;

    @JsonProperty("rows")
    @NotNull
    private List<Map<String, Object>> rows;

}
