package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.HierObjectId;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class Contribution {

    @JsonProperty("uid")
    private HierObjectId uid;

    @NotEmpty
    @JsonProperty("versions")
    private List<UpdateVersion> versions;

    @NotNull
    @JsonProperty("audit")
    private UpdateAudit audit;

}
