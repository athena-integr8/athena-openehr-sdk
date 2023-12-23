package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.*;
import io.openehr.rm.Archetyped;
import io.openehr.rm.ContentItem;
import io.openehr.rm.EventContext;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class Versionable {

    @NotBlank
    @JsonProperty("name")
    private DvText name;

    @NotBlank
    @JsonProperty("archetype_node_id")
    private String archetypeNodeId;

    @JsonProperty("uid")
    private UidBasedId uid;

    @JsonProperty("archetype_details")
    private Archetyped archetypeDetails;

    @JsonProperty("feeder_audit")
    private FeederAudit feederAudit;

    @JsonProperty("_type")
    private String type = "COMPOSITION";

    @NotNull
    @JsonProperty("language")
    private CodePhrase language;

    @NotNull
    @JsonProperty("territory")
    private CodePhrase territory;

    @NotNull
    @JsonProperty("category")
    private DvCodedText category;

    @NotNull
    @JsonProperty("context")
    private EventContext context;

    @NotNull
    @JsonProperty("composer")
    private PartyProxy composer;

    @NotEmpty
    @JsonProperty("content")
    private List<ContentItem> content;


}
