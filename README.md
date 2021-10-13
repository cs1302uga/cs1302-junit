# cs1302-junit

**A quickstart project for unit testing on Odin using JUnit 5.**

## Prerequisites

The instructions on this page assume you're cloning the project on
an Odin account with the CSCI 1302 profile activated.

## Resources

* [JUnit 5.8.1 API](https://junit.org/junit5/docs/5.8.1/api/)

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
   │     ├─ descriptive name for testThat() ✔
   │     └─ descriptive name for testThis() ✔
   └─ JUnit Vintage ✔

   Test run finished after 75 ms
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
   [         2 tests successful      ]
   [         0 tests failed          ]
   ```

   If you need to include more dependencies on the classpath, then separate them
   with a colon as usual. For example:

   ```text
   $ ConsoleLauncher -cp bin:some/other/path:some/lib.jar -c cs1302.test.Tests
   ```
