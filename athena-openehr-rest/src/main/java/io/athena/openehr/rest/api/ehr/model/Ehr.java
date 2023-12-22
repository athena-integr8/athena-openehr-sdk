package io.athena.openehr.rest.api.ehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openehr.base.DvDateTime;
import io.openehr.base.HierObjectId;
import io.openehr.base.ObjectRef;
import lombok.Data;

@Data
public class Ehr {

    @JsonProperty("system_id")
    private HierObjectId systemId;

    @JsonProperty("ehr_id")
    private HierObjectId ehrId;

    @JsonProperty("ehr_status")
    private ObjectRef ehrStatus;

    @JsonProperty("ehr_access")
    private ObjectRef ehrAccess;

    @JsonProperty("time_created")
    private DvDateTime timeCreated;

}
