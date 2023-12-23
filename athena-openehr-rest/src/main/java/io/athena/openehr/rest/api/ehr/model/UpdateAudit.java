package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.DvText;
import io.openehr.base.PartyProxy;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateAudit {

    @JsonProperty("_type")
    private String type = "UPDATE_AUDIT";

    @NotNull
    @JsonProperty("change_type")
    private TerminologyCode changeType;

    @JsonProperty("description")
    private DvText description;

    @NotNull
    @JsonProperty("committer")
    private PartyProxy committer;

}
