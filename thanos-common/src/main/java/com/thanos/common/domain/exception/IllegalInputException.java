package com.thanos.common.domain.exception;


import com.thanos.common.domain.exception.ResultCase.Id;

public class IllegalInputException extends ApplicationException {

  public IllegalInputException(String message) {
    super(Id.illegal_input, message);
  }

  public IllegalInputException(String message, Throwable cause) {
    super(Id.illegal_input, message, cause);
  }

  public IllegalInputException(Id id, String message) {
    super(id, message);
  }

  public IllegalInputException(Id id, String message, Throwable cause) {
    super(id, message, cause);
  }
}
