# cs1302-junit

**A quickstart project for unit testing on Odin using JUnit 5.**

## Prerequisites

The instructions on this page assume you're cloning the project on
an Odin account with the CSCI 1302 profile activated.

## Resources

* [JUnit 5.8.1 API](https://junit.org/junit5/docs/5.8.1/api/)
* [JUnit 5.8.1 User Guide: Writing Tests](https://junit.org/junit5/docs/5.8.1/user-guide/#writing-tests)

## Getting Started

1. Clone this project:

   ```text
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-junit.git
   $ cd cs1302-junit
   ```

2. Inspect the tests:

    ```text
    $ cat src/cs1302/test/Tests.java
    ```

    You can also click [here](src/cs1302/test/Tests.java) to see `Tests.java`.

3. Compile the test cases:

   ```text
   $ javac -cp ${JUNIT_JAR} src/cs1302/test/Tests.java
   ```

   If you need to include more dependencies on the classpath, then separate them
   with a colon as usual. For example:

   ```text
   $ javac -cp ${JUNIT_JAR}:bin:some/other/path:some/lib.jar  src/cs1302/test/Tests.java
   ```
4. Run the test cases on Odin using JUnit's Console Launcher:

   ```text
   $ ConsoleLauncher -cp bin -c cs1302.test.Tests
   ```

   ```text
   Thanks for using JUnit! Support its development at https://junit.org/sponsoring

   ╷
   ├─ JUnit Jupiter ✔
   │  └─ REPLACE-ME ✔
   │     ├─ descriptive name for testThat() ✘ expected: java.lang.String@3e8c3cb<hello> but was: java.lang.String@563f38c4<hello>
   │     └─ descriptive name for testThis() ✔
   └─ JUnit Vintage ✔

   Failures (1):
     JUnit Jupiter:REPLACE-ME:descriptive name for testThat()
       MethodSource [className = 'cs1302.test.Tests', methodName = 'testThat', methodParameterTypes = '']
       => org.opentest4j.AssertionFailedError: expected: java.lang.String@3e8c3cb<hello> but was: java.lang.String@563f38c4<hello>
          org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)
          org.junit.jupiter.api.AssertSame.failNotSame(AssertSame.java:48)
          org.junit.jupiter.api.AssertSame.assertSame(AssertSame.java:37)
          org.junit.jupiter.api.AssertSame.assertSame(AssertSame.java:32)
          org.junit.jupiter.api.Assertions.assertSame(Assertions.java:2851)
          cs1302.test.Tests.testThat(Tests.java:29)
          java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
          java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
          java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
          java.base/java.lang.reflect.Method.invoke(Method.java:566)
          [...]

   Test run finished after 80 ms
   [         3 containers found      ]
   [         0 containers skipped    ]
   [         3 containers started    ]
   [         0 containers aborted    ]
   [         3 containers successful ]
   [         0 containers failed     ]
   [         2 tests found           ]
   [         0 tests skipped         ]
   [         2 tests started         ]
   [         0 tests aborted         ]
   [         1 tests successful      ]
   [         1 tests failed          ]
   ```

   If you need to include more dependencies on the classpath, then separate them
   with a colon as usual. For example:

   ```text
   $ ConsoleLauncher -cp bin:some/other/path:some/lib.jar -c cs1302.test.Tests
   ```
