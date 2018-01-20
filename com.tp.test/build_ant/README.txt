* Ant must be downloaded and installed on your computer
* Place the Ant directory on Program Files under the Apache
* Set the path; Add the ant path to the PATH system variable
* Set the path of the Java JDK at the very first part of the PATH system variable
* Set JAVA_HOME path

* https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/

E.g.
JAVA_HOME
C:\Program Files\Java\jdk-9.0.1

https://stackoverflow.com/questions/9930181/ant-build-not-working-unable-to-find-a-javac-compiler



Quick work around for the same is

Copy C:\Program Files\Java\jdk1.7.0_03\lib\tools.jar to C:\Program Files\Java\jre7\lib\

This exception is coming because JAVA_HOME is being set as C:\Program Files\Java\jre7 and Ant is not able to find tools.jar in it.


JDK 9 has no tools.jar
https://stackoverflow.com/questions/35240134/declare-maven-dependency-on-tools-jar-to-work-on-jdk-9

I cannot make this work yet on JDK 9.