package io.athena.openehr.rest.api.ehr;

import io.openehr.rm.Folder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

public interface DirectoryApi {

    Response createDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Folder theDirectory);

    Response updateDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String theIfMatch,
            @NotBlank final String thePrefer,
            @NotNull final Folder theDirectory);

    Response deleteDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String theIfMatch);

    Response getFolderInDirectoryVersionAtTime(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionAtTime,
            @NotBlank final String thePath);

    Response getFolderInDirectoryVersion(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionUid,
            @NotBlank final String thePath);

}
