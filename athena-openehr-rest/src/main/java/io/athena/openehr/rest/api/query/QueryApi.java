package io.athena.openehr.rest.api.query;

import io.athena.openehr.rest.api.query.model.AdHocQuery;
import io.athena.openehr.rest.api.query.model.StoredQuery;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public interface QueryApi {

    Response executeAdHocAQL(@NotBlank final String theQuery,
                             @Nullable final String theEhrId,
                             @Nullable final Integer theOffset,
                             @Nullable final Integer theFetch,
                             @NotNull final UriInfo theUriInfo);

    Response executeAdHocAQL(@NotNull final AdHocQuery theAdHocQuery);

    Response executeStoredAQL(@NotBlank final String theQualifiedQueryName,
                              @Nullable final String theEhrId,
                              @Nullable final Integer theOffset,
                              @Nullable final Integer theFetch,
                              @NotNull final UriInfo theUriInfo);

    Response executeStoredAQL(@NotBlank final String theQualifiedQueryName,
                              @NotNull final StoredQuery theStoredQuery);

    Response executeStoredAQLVersion(@NotBlank final String theQualifiedQueryName,
                                     @NotBlank final String theVersion,
                                     @Nullable final String theEhrId,
                                     @Nullable final Integer theOffset,
                                     @Nullable final Integer theFetch,
                                     @NotNull final UriInfo theUriInfo);

    Response executeStoredAQVersionL(@NotBlank final String theQualifiedQueryName,
                                     @NotBlank final String theVersion,
                                     @NotNull final StoredQuery theStoredQuery);

}
