package com.petstore.restclient.api;

import com.petstore.restclient.model.*;
import com.petstore.restclient.api.UserApiService;
import com.petstore.restclient.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.sun.jersey.multipart.FormDataParam;
import javax.validation.constraints.*;

import java.util.List;
import com.petstore.restclient.model.User;

import java.util.Map;
import java.util.List;
import com.petstore.restclient.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-01-07T15:53:36.794+02:00[Africa/Harare]")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUser(
        @ApiParam(value = "Created user object" ,required=true) User user,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(user,securityContext);
    }
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUsersWithArrayInput(
        @ApiParam(value = "List of user object" ,required=true) List<User> user,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithArrayInput(user,securityContext);
    }
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createUsersWithListInput(
        @ApiParam(value = "List of user object" ,required=true) List<User> user,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithListInput(user,securityContext);
    }
    @DELETE
    @Path("/{username}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response deleteUser(
        @ApiParam(value = "The name that needs to be deleted",required=true) @PathParam("username") String username,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response getUserByName(
        @ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathParam("username") String username,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @GET
    @Path("/login")
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = String.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = String.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class) })
    public Response loginUser(
        @ApiParam(value = "The user name for login",required=true) @QueryParam("username") String username,
        @ApiParam(value = "The password for login in clear text",required=true) @QueryParam("password") String password,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")
    
    
    @io.swagger.annotations.ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags={ "user",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response logoutUser(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = Void.class) })
    public Response updateUser(
        @ApiParam(value = "name that need to be updated",required=true) @PathParam("username") String username,
        @ApiParam(value = "Updated user object" ,required=true) User user,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(username,user,securityContext);
    }
}
