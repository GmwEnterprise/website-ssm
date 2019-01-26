package cn.edu.cqut.chat.common.exception;

/**
 * 继承了RuntimeException，事务控制中抛出该异常才能回滚
 */
public class CrudException extends RuntimeException {

  public CrudException(String message) {
    super(message);
  }
}
