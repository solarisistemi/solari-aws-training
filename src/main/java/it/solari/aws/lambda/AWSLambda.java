package it.solari.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Base AWS Lambda function
 *
 * @param <T>
 */
public abstract class AWSLambda<T> implements RequestHandler<T, String> {
  
  public abstract String handleRequest(T input, Context context);

  

}
