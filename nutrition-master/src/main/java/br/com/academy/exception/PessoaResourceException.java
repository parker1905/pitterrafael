package br.com.academy.exception;

public class PessoaResourceException extends Exception {

  private static final long serialVersionUID = -6681777147239341684L;

  public PessoaResourceException() {
    super();
  }

  public PessoaResourceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public PessoaResourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public PessoaResourceException(String message) {
    super(message);
  }

  public PessoaResourceException(Throwable cause) {
    super(cause);
  }

}
