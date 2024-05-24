camel-examples
===============

Version Caviats
---------------
Getting the versions of the jar files right is important.  
Versions
- Red Hat Integration - Camel K  1.10.6
- Apache Camel 3.18.6.redhat-00009




#1:  Seda(asyncronous local messages) passing between two RouteBuildingers.
- execute using: `kamel run --name basic Basic.java Basic2.java --dev`
- seda works within the same JVM.  Each time you run a deployment build with kamel it creates a separate jvm/container/pod.
- If you want an asyncronous sink that works accross pods(multiple deployments), consider kafka, or file based notification.

#2: JSONObjectExample using Exchange
- This example imports a json object.  It's important that you get a compatible mvn version of json object for your particular version of Camel
- This example uses an exchange. In Apache Camel, an "Exchange" represents a message as it moves through a Camel route. It encapsulates the message itself along with any associated metadata and context information. 
