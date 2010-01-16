
*** Requirements

- Apache Ivy 2.1.0
- Gant 1.9.1
- lower version may or may not be OK
- set IVY_HOME to install location

*** Usage 

gant clean
gant compile
gant test

*** Notes

1. Be careful with double-quotes versus single-quotes

e.g. '${src.dir}' will be passed to Ant for evaluation but 
     "${src.dir}" will be evaluated by Groovy before going to Ant 

2. Ensure that closures and targets have different names
