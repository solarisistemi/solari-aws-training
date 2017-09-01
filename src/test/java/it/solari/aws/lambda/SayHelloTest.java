package it.solari.aws.lambda;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

import it.solari.model.HelloInput;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class SayHelloTest {

  private static HelloInput input;

  private static SayHelloLambda handler;

  @BeforeClass
  public static void createInput() throws IOException {
    
    handler = new SayHelloLambda();
    
    input = new HelloInput();
    input.setName("Solari");
    input.setSurname("Sistemi");
  }

  private Context createContext() {
    TestContext ctx = new TestContext();
    ctx.setFunctionName(SayHelloLambda.class.getName());
    return ctx;
  }

  @Test
  public void testSayHello() {
    Context ctx = createContext();
    String output = handler.handleRequest(input, ctx);
    Assert.assertEquals("Hello my dear Solari Sistemi!", output);
  }
}
