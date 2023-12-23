package io.athena.openehr.rest.api.ehr;

import io.openehr.rm.Composition;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

public interface CompositionApi {

    Response createComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Composition theComposition);

    Response getComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId,
            final String theVersionAtTime);

    Response updateComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId,
            @NotBlank final String theIfMatch,
            @NotBlank final String thePrefer,
            @NotNull final Composition theComposition);

    Response deleteComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theUidBasedId);

    Response getVersionedComposition(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid);

    Response getVersionedCompositionRevisionHistory(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid);

    Response getVersionedCompositionVersionAtTime(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid,
            final String theVersionAtTime);

    Response getVersionedCompositionVersionById(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionedObjectUid,
            @NotBlank final String theVersionUid);

}
