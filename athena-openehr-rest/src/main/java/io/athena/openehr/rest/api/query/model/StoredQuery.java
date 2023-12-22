package io.athena.openehr.rest.api.query.model;

import lombok.Data;

import java.util.Map;

@Data
public class StoredQuery {

    private Integer offset;
    private Integer fetch;
    private Map<String, Object> queryParameters;

}