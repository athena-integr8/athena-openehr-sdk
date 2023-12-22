package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.DvText;
import io.openehr.base.FeederAudit;
import io.openehr.base.PartyProxy;
import io.openehr.base.UidBasedId;
import io.openehr.rm.Archetyped;
import io.openehr.rm.ItemStructure;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * EHR Status resource.
 */
@Data
public class EhrStatus {

    @JsonProperty("name")
    @NotBlank
    private DvText name;

    @JsonProperty("archetype_node_id")
    @NotBlank
    private String archetypeNodeId;

    @JsonProperty("uid")
    private UidBasedId uid;

    @JsonProperty("archetype_details")
    private Archetyped archetypeDetails;

    @JsonProperty("feeder_audit")
    private FeederAudit feederAudit;

    @JsonProperty("_type")
    private String type = "EHR_STATUS";

    @JsonProperty("subject")
    @NotBlank
    private PartyProxy subject;

    @JsonProperty("is_queryable")
    private boolean isQueryable = true;

    @JsonProperty("is_modifiable")
    private boolean isModifiable = true;

    @JsonProperty("other_details")
    private ItemStructure otherDetails;

}
