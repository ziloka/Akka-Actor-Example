Java [Akka](https://akka.io/) [Actor](https://github.com/akka/akka/tree/v2.6.16#akka-) Model [Example](https://github.com/akka/akka/blob/v2.6.16/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/IntroTest.java)

## Dependencies
**Gradle**
```gradle
  def versions = [
    ScalaBinary: "2.13"
  ]
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.16")
  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
```

***Maven***
```xml
<dependency>
  <groupId>com.typesafe.akka</groupId>
  <artifactId>akka-bom_2.13</artifactId>
  <version>2.6.16</version>
</dependency>
<dependency>
  <groupId>com.typesafe.akka</groupId>
  <artifactId>akka-actor-typed_2.13</artifactId>
  <version>VERSION</version>
</dependency>
```