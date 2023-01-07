package com.petstore.restclient.api;

import com.petstore.restclient.api.*;
import com.petstore.restclient.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.io.File;
import com.petstore.restclient.model.ModelApiResponse;
import com.petstore.restclient.model.Pet;

import java.util.List;
import com.petstore.restclient.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-01-07T15:53:36.794+02:00[Africa/Harare]")
public abstract class PetApiService {
      public abstract Response addPet(Pet pet,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByStatus( @NotNull List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByTags( @NotNull List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePet(Pet pet,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response uploadFile(Long petId,String additionalMetadata,InputStream fileInputStream, FormDataContentDisposition fileDetail,SecurityContext securityContext)
      throws NotFoundException;
}
