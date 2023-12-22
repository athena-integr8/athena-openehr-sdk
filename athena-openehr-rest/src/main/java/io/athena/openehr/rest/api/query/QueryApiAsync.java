package io.athena.openehr.rest.api.query;

import io.athena.openehr.rest.model.AdHocQuery;
import io.athena.openehr.rest.model.StoredQuery;
import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.util.concurrent.CompletionStage;

public interface QueryApiAsync {

    CompletionStage<Response> executeAdHocAQL(@Nonnull final String theQuery,
                                    final String theEhrId,
                                    final Integer theOffset,
                                    final Integer theFetch,
                                    @Nonnull final UriInfo theUriInfo);

    CompletionStage<Response> executeAdHocAQL(@Nonnull final AdHocQuery theAdHocQuery);

    CompletionStage<Response> executeStoredAQL(@Nonnull final String theQualifiedQueryName,
                              final String theEhrId,
                              final Integer theOffset,
                              final Integer theFetch,
                              @Nonnull final UriInfo theUriInfo);

    CompletionStage<Response> executeStoredAQL(@Nonnull final String theQualifiedQueryName,
                              @Nonnull final StoredQuery theStoredQuery);

    CompletionStage<Response> executeStoredAQLVersion(@Nonnull final String theQualifiedQueryName,
                                     @Nonnull final String theVersion,
                                     final String theEhrId,
                                     final Integer theOffset,
                                     final Integer theFetch,
                                     @Nonnull final UriInfo theUriInfo);

    CompletionStage<Response> executeStoredAQVersionL(@Nonnull final String theQualifiedQueryName,
                                     @Nonnull final String theVersion,
                                     @Nonnull final StoredQuery theStoredQuery);

}
