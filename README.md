# cs1302-junit

**A quickstart project for unit testing on Odin using JUnit 5.**

## Getting Started

1. Clone this project:

   ```text
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-junit.git
   $ cd cs1302-junit
   ```

2. Compile the test cases:

   ```text
   $ javac -cp ${JUNIT_JAR} src/cs1302/test/Tests.java
   ```

   If you need to include more dependencies on the classpath, then separate them
   with a colon as usual. For example:

   ```text
   $ javac -cp ${JUNIT_JAR}:bin:some/other/path:some/lib.jar  src/cs1302/test/Tests.java
   ```
3. Run the test cases on Odin using JUnit's Console Launcher:

   ```text
   $ ConsoleLauncher -cp bin -c cs1302.test.Tests
   ```

   If you need to include more dependencies on the classpath, then separate them
   with a colon as usual. For example:

   ```text
   $ ConsoleLauncher -cp bin:some/other/path:some/lib.jar -c cs1302.test.Tests
   ```
