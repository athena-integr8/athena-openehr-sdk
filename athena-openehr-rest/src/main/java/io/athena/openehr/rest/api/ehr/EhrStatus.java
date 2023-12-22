package io.athena.openehr.rest.api.ehr;

import io.openehr.base.DvText;
import io.openehr.base.FeederAudit;
import io.openehr.base.PartyProxy;
import io.openehr.base.UidBasedId;
import io.openehr.rm.Archetyped;
import io.openehr.rm.ItemStructure;
import lombok.Data;

/**
 * EHR Status resource.
 */
@Data
public class EhrStatus {

    private DvText name;
    private String archetypeNodeId;
    private UidBasedId uid;
    private Archetyped archetypeDetails;
    private FeederAudit feederAudit;
    private String type = "EHR_STATUS";
    private PartyProxy subject;
    private boolean isQueryable = true;
    private boolean isModifiable = true;
    private ItemStructure otherDetails;

}
