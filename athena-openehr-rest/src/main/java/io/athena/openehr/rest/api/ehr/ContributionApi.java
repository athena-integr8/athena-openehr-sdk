package io.athena.openehr.rest.api.ehr;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

public interface ContributionApi {

    Response createContribution(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Contribution theContribution);

    Response getContributionById(
            @NotBlank final String theEhrId,
            @NotBlank final String theContributionUid);

}
