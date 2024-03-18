plugins {
    id("java")
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
    id("org.flywaydb.flyway") version "6.4.3"
}

group="org.planify"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":planify-api"))
    implementation(project(":planify-entity-api"))
    implementation("org.apache.logging.log4j:log4j-core:2.17.1")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.2")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("io.swagger:swagger-annotations:1.6.11")
    implementation("org.hibernate.orm:hibernate-core:6.2.6.Final")
    implementation("org.postgresql:postgresql:42.6.0")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.20")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("org.springframework.data:spring-data-jpa:3.1.5")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.flywaydb:flyway-core:9.22.3")
    implementation("org.springframework.boot:spring-boot-starter-security:3.1.5")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.5")
    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")
}

tasks.test {
    useJUnitPlatform()
}
