package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.DvEhrUri;
import io.openehr.base.DvMultimedia;
import io.openehr.base.DvText;
import io.openehr.base.PartyProxy;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class UpdateAttestation {

    @JsonProperty("_type")
    private String type = "UPDATE_ATTESTATION";

    @NotNull
    @JsonProperty("change_type")
    private TerminologyCode changeType;

    @JsonProperty("description")
    private DvText description;

    @NotNull
    @JsonProperty("committer")
    private PartyProxy committer;

    @JsonProperty("attested_view")
    private DvMultimedia attestedView;

    @JsonProperty("proof")
    private String proof;

    @JsonProperty("items")
    private List<DvEhrUri> items;

    @NotNull
    @JsonProperty("reason")
    private DvText reason;

    @NotNull
    @JsonProperty("is_pending")
    private Boolean pending;

}
