package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.core.Response;

public interface EhrApi {

    Response createEhr(
            @NotBlank final String thePrefer,
            @Nullable final EhrStatus theEhrStatus);

    Response getEhrBySubjectId(
            @NotBlank final String theSubjectId,
            @Nonnull final String theSubjectNamespace);

    Response createEhrWithId(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @Nullable final EhrStatus theEhrStatus);

    Response getEhrById(
            @NotBlank final String theEhrId);

}
