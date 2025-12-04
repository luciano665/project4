# Polyglot Maven Demo

This repository shows how to mix Java and Clojure in a single Maven module. Java code can call into Clojure namespaces (and vice-versa) without additional build steps.

## Layout

```
src/main/java      # Java production code
src/main/clojure   # Clojure production namespaces
src/test/java      # Java tests (JUnit 5)
src/test/clojure   # Clojure tests (clojure.test)
```

Maven is configured via the `clojure-maven-plugin` so that Clojure sources are compiled during the regular `compile` and `test-compile` phases. The resulting classes land under `target/classes`, making them visible to the Java compiler.

## Usage

1. Install a JDK (17+) plus Maven 3.9+.
2. From the project root run:
   ```bash
   mvn verify
   ```
   This will compile both languages and execute Java (JUnit 5) and Clojure (`clojure.test`) test suites.
3. Run the sample Java entry point:
   ```bash
   mvn exec:java -Dexec.mainClass=com.example.polyglot.Greeter -Dexec.args=\"Ada\"
   ```

## Highlights

- `Greeter.java` is a plain Java class that calls Clojure vars via `clojure.java.api.Clojure`.
- `polyglot.core` contains the Clojure business logic shared by both languages.
- Tests in both ecosystems demonstrate that tooling remains native to each language.

You can extend this baseline by adding more modules, wiring dependency injection on the Java side, or exposing Clojure multimethods back to Java. The current setup keeps everything in one module to keep the feedback loop quick.

# project4
