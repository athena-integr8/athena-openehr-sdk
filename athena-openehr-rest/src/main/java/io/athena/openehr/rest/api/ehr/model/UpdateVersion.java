package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.HierObjectId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class UpdateVersion {

    @JsonProperty("uid")
    private HierObjectId uid;

    @JsonProperty("signature")
    private String signature;

    @NotNull
    @JsonProperty("lifecycle_state")
    private TerminologyCode lifecycleState;

    private List<UpdateAttestation> attestations;

    @NotNull
    @JsonProperty("data")
    private Versionable data;

    @NotNull
    @JsonProperty("commit_audit")
    private UpdateAudit commitAudit;

}
