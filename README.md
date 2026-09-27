# spring-lab

Hands-on Maven lab: the `~/java-puzzles` algorithm drills, rebuilt with
enterprise project structure. Same logic, professional clothes — and the
launchpad for Spring Boot work.

## Layout (the Maven standard)

```
spring-lab/
├── pom.xml                          # the build file: dependencies, plugins, Java version
└── src/
    ├── main/java/com/raja/puzzles/  # production code
    └── test/java/com/raja/puzzles/  # JUnit 5 tests (mirror the main tree)
```

`pom.xml` declares: Java 21, JUnit 5 (`junit-jupiter`, test scope only),
plus the compiler and surefire (test-runner) plugins.

## On your Ubuntu WSL box

```bash
# one-time setup
sudo apt update && sudo apt install -y maven
mvn -v          # confirm it sees your JDK 21

# unzip this project next to your puzzles, e.g. ~/spring-lab
cd ~/spring-lab

# the Maven lifecycle in three commands
mvn compile     # compile src/main
mvn test        # compile + run all JUnit tests (surefire)
mvn package     # compile + test + build target/spring-lab-1.0.0.jar
```

`mvn test` should show `Tests run: 6, Failures: 0, Errors: 0`.

## Adding your next drill

1. New class → `src/main/java/com/raja/puzzles/ContainerWithMostWater.java`
   (package `com.raja.puzzles;`, no `main` method needed)
2. New test → `src/test/java/com/raja/puzzles/ContainerWithMostWaterTest.java`
   (one `@Test` method per case from your old harness)
3. Run `mvn test`

## Going further

- `git init` here and push to GitHub — portfolio material.
- When you're ready for Spring Boot, this same `pom.xml` shape grows a
  `spring-boot-starter-parent` and starters — exactly like the `hello-boot`
  project in this goal's files.
