plugins {
    id("dev.prism")
}

group = "com.leclowndu93150"
version = "1.0.0"

prism {
    metadata {
        modId = "foxy"
        name = "Foxy"
        description = "Loads the Voxy LoD rendering mod on NeoForge by bridging its Fabric entrypoints and APIs."
        license = "MIT"
        author("leclowndu93150")
    }

    modrinthMaven()
    maven("NeoForged", "https://maven.neoforged.net/releases")

    version("26.2") {
        neoforge {
            loaderVersion = "26.2.0.93"

            dependencies {
                compileOnly("maven.modrinth:sodium:mc26.2-0.9.1-neoforge")
                runtimeOnly("maven.modrinth:sodium:mc26.2-0.9.1-neoforge")
                compileOnly("maven.modrinth:voxy:0.2.16-beta")
                implementation("maven.modrinth:voxy:0.2.16-beta")
                compileOnly("cpw.mods:modlauncher:11.0.5")
                compileOnly("cpw.mods:securejarhandler:3.0.8")
                compileOnly("net.neoforged.fancymodloader:loader:11.0.13")

                compileOnly("maven.modrinth:chunky:hEXc6nbN")
            }
        }
    }

}
