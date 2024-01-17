plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":planify-entity-api"))
    implementation("io.swagger.core.v3:swagger-annotations:2.2.20")
    implementation("io.swagger:swagger-annotations:1.6.11")
    implementation("org.springframework:spring-web:6.0.11")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
