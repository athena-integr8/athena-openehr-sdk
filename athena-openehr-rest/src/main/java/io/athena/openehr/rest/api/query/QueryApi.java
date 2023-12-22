package io.athena.openehr.rest.api.query;

import io.athena.openehr.rest.api.query.model.AdHocQuery;
import io.athena.openehr.rest.api.query.model.StoredQuery;
import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public interface QueryApi {

    Response executeAdHocAQL(@Nonnull final String theQuery,
                             final String theEhrId,
                             final Integer theOffset,
                             final Integer theFetch,
                             @Nonnull final UriInfo theUriInfo);

    Response executeAdHocAQL(@Nonnull final AdHocQuery theAdHocQuery);

    Response executeStoredAQL(@Nonnull final String theQualifiedQueryName,
                              final String theEhrId,
                              final Integer theOffset,
                              final Integer theFetch,
                              @Nonnull final UriInfo theUriInfo);

    Response executeStoredAQL(@Nonnull final String theQualifiedQueryName,
                              @Nonnull final StoredQuery theStoredQuery);

    Response executeStoredAQLVersion(@Nonnull final String theQualifiedQueryName,
                                     @Nonnull final String theVersion,
                                     final String theEhrId,
                                     final Integer theOffset,
                                     final Integer theFetch,
                                     @Nonnull final UriInfo theUriInfo);

    Response executeStoredAQVersionL(@Nonnull final String theQualifiedQueryName,
                                     @Nonnull final String theVersion,
                                     @Nonnull final StoredQuery theStoredQuery);

}
