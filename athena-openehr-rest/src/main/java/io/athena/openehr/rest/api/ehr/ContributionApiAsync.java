package io.athena.openehr.rest.api.ehr;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface ContributionApiAsync {

    CompletionStage<Response> createContribution(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Contribution theContribution);

    CompletionStage<Response> getContributionById(
            @NotBlank final String theEhrId,
            @NotBlank final String theContributionUid);

}
