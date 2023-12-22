package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.core.Response;

public interface EhrStatusApi {

    Response getEhrStatusByVersionId(@NotBlank final String theEhrId,
                                     @NotBlank final String theVersionId);

    Response getEhrStatusAtTime(@NotBlank final String theEhrId,
                                @NotBlank final String theVersionAtTime);

    Response updateEhrStatus(@NotBlank final String theEhrId,
                             @NotBlank final String theIfMatch,
                             @NotBlank final String thePrefer,
                             @NotBlank final EhrStatus theEhrStatus);

    Response getVersionedEhrStatus(@NotBlank final String theEhrId);

    Response getVersionedEhrStatusVersionAtTime(@NotBlank final String theEhrId,
                                                @NotBlank final String theVersionAtTime);

    Response getVersionedEhrStatusVersionById(@NotBlank final String theEhrId,
                                              @NotBlank final String theVersionUid);

}
