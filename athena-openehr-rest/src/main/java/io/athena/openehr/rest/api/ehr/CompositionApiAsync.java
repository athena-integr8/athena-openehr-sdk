package io.athena.openehr.rest.api.ehr;

import io.openehr.rm.Composition;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface CompositionApiAsync {

    CompletionStage<Response> createComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Composition theComposition);

    CompletionStage<Response> getComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId,
            final String theVersionAtTime);

    CompletionStage<Response> updateComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId,
            @NotBlank final String theIfMatch,
            @NotBlank final String thePrefer,
            @NotNull final Composition theComposition);

    CompletionStage<Response> deleteComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId);

    CompletionStage<Response> getVersionedComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid);

    CompletionStage<Response> getVersionedCompositionRevisionHistory(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid);

    CompletionStage<Response> getVersionedCompositionVersionAtTime(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid,
            final String theVersionAtTime);

    CompletionStage<Response> getVersionedCompositionVersionById(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid,
            @NotBlank final String theVersionUid);

}
