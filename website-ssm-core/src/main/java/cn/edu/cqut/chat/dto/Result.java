package cn.edu.cqut.chat.dto;

public class Result<E> {

  private boolean success;

  private String message;

  private E data;

  public static <E> Result<E> yes(String message, E data) {
    Result<E> result = new Result<>();
    result.success = true;
    result.message = message;
    result.data = data;
    return result;
  }

  public static Result no(String message) {
    Result result = new Result();
    result.success = false;
    result.message = message;
    return result;
  }

  @Override
  public String toString() {
    return String.format("Result{success=%s, message='%s', data=%s}", success, message, data);
  }
}
