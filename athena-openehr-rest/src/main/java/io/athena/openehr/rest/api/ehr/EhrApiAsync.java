package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface EhrApiAsync {

    CompletionStage<Response> createEhr(
            @NotBlank final String thePrefer,
            @Nullable final EhrStatus theEhrStatus);

    CompletionStage<Response> getEhrBySubjectId(
            @NotBlank final String theSubjectId,
            @NotBlank final String theSubjectNamespace);

    CompletionStage<Response> createEhrWithId(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @Nullable final EhrStatus theEhrStatus);

    CompletionStage<Response> getEhrById(
            @NotBlank final String theEhrId);

}
