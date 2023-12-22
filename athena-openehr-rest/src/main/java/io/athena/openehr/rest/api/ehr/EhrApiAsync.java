package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface EhrApiAsync {

    CompletionStage<Response> createEhr(@Nonnull final String thePrefer,
                                        @Nullable final EhrStatus theEhrStatus);

    CompletionStage<Response> getEhrBySubjectId(@Nonnull final String theSubjectId,
                                                @Nonnull final String theSubjectNamespace);

    CompletionStage<Response> createEhrWithId(@Nonnull final String theEhrId,
                                              @Nonnull final String thePrefer,
                                              @Nullable final EhrStatus theEhrStatus);

    CompletionStage<Response> getEhrById(@Nonnull final String theEhrId);

}
