buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.0-alpha05")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

tasks.withType<Wrapper>().configureEach {
    distributionType = Wrapper.DistributionType.ALL
}
