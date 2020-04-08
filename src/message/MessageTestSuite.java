package message;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To create a Test Suite, we just need to declare the
 * @RunWith annotation as a Suite and add all the test
 * cases to be executed using the SuiteClasses annotation.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MessageTestCase.class})
public class MessageTestSuite {}
