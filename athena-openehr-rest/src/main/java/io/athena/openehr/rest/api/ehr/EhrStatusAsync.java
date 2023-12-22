package io.athena.openehr.rest.api.ehr;

import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface EhrStatusAsync {

    CompletionStage<Response> getEhrStatusByVersionId(@Nonnull final String theEhrId,
                                                      @Nonnull final String theVersionId);

    CompletionStage<Response> getEhrStatusAtTime(@Nonnull final String theEhrId,
                                                 @Nonnull final String theVersionAtTime);

    CompletionStage<Response> updateEhrStatus(@Nonnull final String theEhrId,
                                              @Nonnull final String theIfMatch,
                                              @Nonnull final String thePrefer,
                                              @Nonnull final EhrStatus theEhrStatus);

    CompletionStage<Response> getVersionedEhrStatus(@Nonnull final String theEhrId);

    CompletionStage<Response> getVersionedEhrStatusVersionAtTime(@Nonnull final String theEhrId,
                                                                 @Nonnull final String theVersionAtTime);

    CompletionStage<Response> getVersionedEhrStatusVersionById(@Nonnull final String theEhrId,
                                                               @Nonnull final String theVersionUid);

}
