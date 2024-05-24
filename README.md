camel-examples
===============

#1:  Seda(asyncronous local messages) passing between two RouteBuildingers.
- execute using: `kamel run --name basic Basic.java Basic2.java --dev`
- seda works within the same JVM.  Each time you run a deployment build with kamel it creates a separate jvm/container/pod.
- If you want an asyncronous sink that works accross pods(multiple deployments), consider kafka, or file based notification.

#2: 
