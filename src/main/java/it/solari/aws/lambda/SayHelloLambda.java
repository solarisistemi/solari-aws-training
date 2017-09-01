package it.solari.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import it.solari.model.HelloInput;
import it.solari.services.SayHelloService;

public class SayHelloLambda extends AWSLambda<HelloInput> {
  
  @Override
  public String handleRequest(HelloInput input, Context context) {
    context.getLogger().log("Input: " + input.getName() + "," + input.getSurname());
    SayHelloService srv = new SayHelloService();
    return srv.hello(input);
  }


}
