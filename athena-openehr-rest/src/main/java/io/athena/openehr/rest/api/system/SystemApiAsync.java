package io.athena.openehr.rest.api.system;

import jakarta.annotation.Nonnull;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

/**
 * The asynchronous version of the OpenEHR system API.
 */
public interface SystemApiAsync {

    /**
     * Get the system options and conformance.
     *
     * @return The system options and conformance.
     */
    @Nonnull
    CompletionStage<Response> getOptionsAndConformance();

}
