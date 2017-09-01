package it.solari.services;

import it.solari.model.HelloInput;

public class SayHelloService {

  public String hello(HelloInput input) {
    return "Hello my dear " + input.getName() + " " + input.getSurname() + "!";
  }

}
