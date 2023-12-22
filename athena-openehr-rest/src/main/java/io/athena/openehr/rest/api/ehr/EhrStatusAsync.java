package io.athena.openehr.rest.api.ehr;

import io.athena.openehr.rest.api.ehr.model.EhrStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface EhrStatusAsync {

    CompletionStage<Response> getEhrStatusByVersionId(@NotBlank final String theEhrId,
                                                      @NotBlank final String theVersionId);

    CompletionStage<Response> getEhrStatusAtTime(@NotBlank final String theEhrId,
                                                 @NotBlank final String theVersionAtTime);

    CompletionStage<Response> updateEhrStatus(@NotBlank final String theEhrId,
                                              @NotBlank final String theIfMatch,
                                              @NotBlank final String thePrefer,
                                              @NotBlank final EhrStatus theEhrStatus);

    CompletionStage<Response> getVersionedEhrStatus(@NotBlank final String theEhrId);

    CompletionStage<Response> getVersionedEhrStatusVersionAtTime(@NotBlank final String theEhrId,
                                                                 @NotBlank final String theVersionAtTime);

    CompletionStage<Response> getVersionedEhrStatusVersionById(@NotBlank final String theEhrId,
                                                               @NotBlank final String theVersionUid);

}
