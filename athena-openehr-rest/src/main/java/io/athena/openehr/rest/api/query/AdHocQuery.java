package io.athena.openehr.rest.api.query;

import jakarta.ws.rs.core.UriInfo;
import lombok.Data;

@Data
public class AdHocQuery {

    String theQuery;
    Integer theOffset;
    Integer theFetch;
    UriInfo theUriInfo;

}
