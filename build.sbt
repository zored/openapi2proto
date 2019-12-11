name := "openapi2proto"

version := "0.1"

scalaVersion := "2.12.10"

resolvers ++= Dependencies.resolvers

libraryDependencies ++= Dependencies.common

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "utf-8",
  "-explaintypes",
  "-feature",
  "-language:_",
  // "-release",
  // "10",
  "-opt:l:inline",
  "-opt-warnings:_",
  "-unchecked",
  // "-Xcheckinit",
  "-Xexperimental",
  // "-Xfatal-warnings",
  "-Xfuture",
  "-Xlint:_",
  "-Xsource:2.13",
  "-Ybackend-parallelism",
  "8",
  "-Yno-adapted-args",
  "-Ypartial-unification",
  // "-Ystatistics",
  "-Ywarn-dead-code",
  "-Ywarn-extra-implicit",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused:_",
  "-Ywarn-value-discard"
)

javaOptions in (Test, run) ++= Seq(
  "--add-modules=java.xml.bind",
  "--illegal-access=permit",
  "-Djava.security.egd=file:/dev/urandom",
  "-Dscala.concurrent.context.maxExtraThreads=0",
  "-Duser.timezone=Europe/Moscow",
  "-server",
  // "-Xms2g",
  // "-Xmx4g",
  "-Xss6m",
  "-XX:+AggressiveOpts",
  "-XX:+AlwaysPreTouch",
  "-XX:+DisableExplicitGC",
  "-XX:+TieredCompilation",
  "-XX:+UnlockDiagnosticVMOptions",
  "-XX:+UnlockExperimentalVMOptions",
  "-XX:+UseCGroupMemoryLimitForHeap",
  "-XX:+EnableJVMCI",
  "-XX:+UseJVMCICompiler",
  "-XX:InitialRAMFraction=1",
  "-XX:MaxRAMFraction=1",
  "-XX:MinRAMFraction=1",
  "-XX:+UseAES",
  "-XX:+UseAESIntrinsics",
  "-XX:+UseG1GC",
  "-XX:+UseStringDeduplication",
  "-XX:-UseBiasedLocking",
  "-XX:ConcGCThreads=5",
  "-XX:G1HeapRegionSize=16m",
  "-XX:G1MaxNewSizePercent=80",
  "-XX:G1MixedGCLiveThresholdPercent=50",
  "-XX:G1NewSizePercent=50",
  "-XX:InitiatingHeapOccupancyPercent=10",
  "-XX:MaxGCPauseMillis=100",
  "-XX:NewSize=512m",
  "-XX:ParallelGCThreads=20",
  "-XX:ReservedCodeCacheSize=256m",
  "-XX:TargetSurvivorRatio=90"
)

graalVMNativeImageOptions += "--no-fallback"
graalVMNativeImageOptions += "--allow-incomplete-classpath"
graalVMNativeImageOptions += "--report-unsupported-elements-at-runtime"

enablePlugins(GraalVMNativeImagePlugin)

addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
