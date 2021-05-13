package com.sanctionco.jmail;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class JmailApplication extends Application<JmailConfiguration> {

  public static void main(String[] args) throws Exception {
    new JmailApplication().run(args);
  }

  @Override
  public void run(JmailConfiguration jmailConfiguration, Environment environment) {
    environment.jersey().register(new JmailResource());
  }
}
