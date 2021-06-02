plugins {
    java
    kotlin("jvm") version "1.5.10"
    antlr
    application
}

group = "club.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    antlr("org.antlr:antlr4:4.9.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.register("runFirstKotlin") {
    application.mainClass.set("FirstKt")
    dependsOn("generateGrammarSource")
    dependsOn("run")
}
tasks.register("runSecondKotlin") {
    application.mainClass.set("SecondKt")
    dependsOn("generateGrammarSource")
    dependsOn("run")
}
tasks.register("runFirstJava") {
    application.mainClass.set("First")
    dependsOn("generateGrammarSource")
    dependsOn("run")
}
tasks.register("runSecondJava") {
    application.mainClass.set("Second")
    dependsOn("generateGrammarSource")
    dependsOn("run")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages", "-package", "interpreter")
    outputDirectory = File("$buildDir/generated-src/antlr/main/interpreter/")
}