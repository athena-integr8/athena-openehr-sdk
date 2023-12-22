package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.ws.rs.core.Response;

public interface EhrApi {

    Response createEhr(@Nonnull final String thePrefer,
                       @Nullable final EhrStatus theEhrStatus);

    Response getEhrBySubjectId(@Nonnull final String theSubjectId,
                               @Nonnull final String theSubjectNamespace);

    Response createEhrWithId(@Nonnull final String theEhrId,
                             @Nonnull final String thePrefer,
                             @Nullable final EhrStatus theEhrStatus);

    Response getEhrById(@Nonnull final String theEhrId);

}
