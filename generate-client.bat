rem This bat script generates the client code for the Petstore service {https://petstore.swagger.io/}
rem The swagger.yaml was obtained from the server side {https://petstore.swagger.io/v2/swagger.yaml}
rem This code generation makes use of the openapi code generator
rem The generated code is created in the "generated_client_code" directory
rem To get more help on other commands available, type the following on the command prompt "java -jar openapi-generator-cli-3.0.3.jar help generate"

java -jar openapi-generator-cli-3.0.3.jar generate --api-package com.petstore.restclient.api -i swagger.yaml --invoker-package com.petstore.restclient.invoker -l jaxrs-jersey --library jersey1 --model-package com.petstore.restclient.model -o generated_client_code
