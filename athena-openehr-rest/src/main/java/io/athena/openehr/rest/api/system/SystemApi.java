package io.athena.openehr.rest.api.system;

import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;

/**
 * The OpenEHR system API.
 */
public interface SystemApi {

    /**
     * Get the system options and conformance.
     *
     * @return The system options and conformance.
     */
    @Nonnull
    Response getOptionsAndConformance();

}
