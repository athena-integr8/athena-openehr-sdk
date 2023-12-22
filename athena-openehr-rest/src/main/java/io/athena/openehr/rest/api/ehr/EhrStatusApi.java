package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;

public interface EhrStatusApi {

    Response getEhrStatusByVersionId(@Nonnull final String theEhrId,
                                     @Nonnull final String theVersionId);

    Response getEhrStatusAtTime(@Nonnull final String theEhrId,
                                @Nonnull final String theVersionAtTime);

    Response updateEhrStatus(@Nonnull final String theEhrId,
                             @Nonnull final String theIfMatch,
                             @Nonnull final String thePrefer,
                             @Nonnull final EhrStatus theEhrStatus);

    Response getVersionedEhrStatus(@Nonnull final String theEhrId);

    Response getVersionedEhrStatusVersionAtTime(@Nonnull final String theEhrId,
                                                @Nonnull final String theVersionAtTime);

    Response getVersionedEhrStatusVersionById(@Nonnull final String theEhrId,
                                              @Nonnull final String theVersionUid);

}
