package io.athena.openehr.rest.api.ehr;

import io.openehr.rm.Folder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.core.Response;

import java.util.concurrent.CompletionStage;

public interface DirectoryApiAsync {

    CompletionStage<Response> createDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String thePrefer,
            @NotNull final Folder theDirectory);

    CompletionStage<Response> updateDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String theIfMatch,
            @NotBlank final String thePrefer,
            @NotNull final Folder theDirectory);

    CompletionStage<Response> deleteDirectory(
            @NotBlank final String theEhrId,
            @NotBlank final String theIfMatch);

    CompletionStage<Response> getFolderInDirectoryVersionAtTime(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionAtTime,
            @NotBlank final String thePath);

    CompletionStage<Response> getFolderInDirectoryVersion(
            @NotBlank final String theEhrId,
            @NotBlank final String theVersionUid,
            @NotBlank final String thePath);

}
