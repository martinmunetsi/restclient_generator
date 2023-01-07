# restclient generator
This project illustrates a mechanism to generate the RESTFul web service client code for a given web service. In this project the utilised web service is exposed on https://petstore.swagger.io/

This code generation makes use of the openapi code generator.


## Getting Started

To start with, the specification for the service is found on https://petstore.swagger.io/v2/swagger.yaml. This swagger.yaml file is saved on the machine generating the client code.

The openapi code generator dependency is a pre-requisite. In this project the "openapi-generator-cli-3.0.3.jar " is used.
The generate-client.bat script specifies the commands needed for the code generation.

The generated code is created in the "generated_client_code" directory

To get more help on other commands available, type the following on the command prompt "java -jar openapi-generator-cli-3.0.3.jar help generate"

The models of the service are generated to the "com.petstore.restclient.model" package. To locate the api invocation code go to the "com.petstore.restclient.api" package.