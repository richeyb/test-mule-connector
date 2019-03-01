package org.mule.extension.gh.test.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;

/**
 * This class is a container for operations, every public method in this class
 * will be taken as an extension operation.
 */
public class GhtestOperations {
  @MediaType(value = ANY, strict = false)
  public String helloWorld() {
    return "Hello World";
  }
}
