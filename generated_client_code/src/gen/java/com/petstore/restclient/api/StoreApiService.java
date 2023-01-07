package com.petstore.restclient.api;

import com.petstore.restclient.api.*;
import com.petstore.restclient.model.*;

import com.sun.jersey.multipart.FormDataParam;

import java.util.Map;
import com.petstore.restclient.model.Order;

import java.util.List;
import com.petstore.restclient.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-01-07T15:53:36.794+02:00[Africa/Harare]")
public abstract class StoreApiService {
      public abstract Response deleteOrder( @Min(1L)Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getInventory(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getOrderById( @Min(1L) @Max(10L)Long orderId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response placeOrder(Order order,SecurityContext securityContext)
      throws NotFoundException;
}
