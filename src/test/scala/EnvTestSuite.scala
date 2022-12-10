
class EnvTestSuite extends munit.FunSuite:
    test("should envname of app in TestRegistry be test") {
        val app = TestRegistry.app
        assertEquals(app.getEnvName(), "test")
    }