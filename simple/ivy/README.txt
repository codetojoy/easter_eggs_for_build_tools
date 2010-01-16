
*** Requirements

- Apache Ivy 2.1.0
- lower version may or may not be OK
- set IVY_HOME to install location

*** Usage (Unix) 

./run.sh clean
./run.sh compile
./run.sh test

*** Usage (Windows)

- adapt run.sh as appropriate, it is not difficult

OR 

ant -lib %IVY_HOME%\ivy-2.1.0.jar clean
ant -lib %IVY_HOME%\ivy-2.1.0.jar compile
ant -lib %IVY_HOME%\ivy-2.1.0.jar test

