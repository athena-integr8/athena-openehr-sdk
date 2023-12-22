package io.athena.openehr.rest.api.ehr.model;

import io.openehr.base.DvDateTime;
import io.openehr.base.HierObjectId;
import io.openehr.base.ObjectRef;
import lombok.Data;

@Data
public class Ehr {

    private HierObjectId systemId;
    private HierObjectId ehrId;
    private ObjectRef ehrStatus;
    private ObjectRef ehrAccess;
    private DvDateTime timeCreated;

}
