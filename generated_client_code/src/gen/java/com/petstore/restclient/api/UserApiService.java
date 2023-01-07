package com.petstore.restclient.api;

import com.petstore.restclient.api.*;
import com.petstore.restclient.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.util.List;
import com.petstore.restclient.model.User;

import java.util.List;
import com.petstore.restclient.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-01-07T15:53:36.794+02:00[Africa/Harare]")
public abstract class UserApiService {
      public abstract Response createUser(User user,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response createUsersWithArrayInput(List<User> user,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response createUsersWithListInput(List<User> user,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteUser(String username,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getUserByName(String username,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response loginUser( @NotNull String username, @NotNull String password,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response logoutUser(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateUser(String username,User user,SecurityContext securityContext)
      throws NotFoundException;
}
