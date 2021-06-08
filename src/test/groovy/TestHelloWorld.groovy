class TestHelloWorld extends GroovyTestCase {

        void testHelloWorld() {
            assertEquals("Hello World!", HelloWorld.getMessage());
        }

    void testFailure() {
        assertTrue(false)
    }

}
