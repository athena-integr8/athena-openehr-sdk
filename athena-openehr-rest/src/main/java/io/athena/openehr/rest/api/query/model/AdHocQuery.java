package io.athena.openehr.rest.api.query.model;

import lombok.Data;

import java.util.Map;

@Data
public class AdHocQuery {

    String query;
    Integer offset;
    Integer fetch;
    Map<String, Object> queryParameters;

}
