//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/simpleJsJvmProjectWithTests/dependencies.txt`
//

actual fun cTests_platformDependentCTests(): String = "pJsTests"
fun pJsTests_platformOnly() = "pJsTests"

fun pJsTestsTest() {
  pJsTests_platformOnly()
  pJsMain_platformOnly()
  cMain_platformIndependentCMain()
  cMain_platformDependentCMain()
  cTests_platformIndependentCTests()
  cTests_platformDependentCTests()
}
