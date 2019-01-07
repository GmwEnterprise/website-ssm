package cn.edu.cqut.chat.entity;

import java.util.Date;

public class ChatMessage {

  private Integer id;
  private String msgSender;
  private String msgReceiver;
  private String msgType;
  private String msgContentWords;
  private byte[] msgContentImg;
  private Date msgSendDatetime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMsgSender() {
    return msgSender;
  }

  public void setMsgSender(String msgSender) {
    this.msgSender = msgSender;
  }

  public String getMsgReceiver() {
    return msgReceiver;
  }

  public void setMsgReceiver(String msgReceiver) {
    this.msgReceiver = msgReceiver;
  }

  public String getMsgType() {
    return msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public String getMsgContentWords() {
    return msgContentWords;
  }

  public void setMsgContentWords(String msgContentWords) {
    this.msgContentWords = msgContentWords;
  }

  public byte[] getMsgContentImg() {
    return msgContentImg;
  }

  public void setMsgContentImg(byte[] msgContentImg) {
    this.msgContentImg = msgContentImg;
  }

  public Date getMsgSendDatetime() {
    return msgSendDatetime;
  }

  public void setMsgSendDatetime(Date msgSendDatetime) {
    this.msgSendDatetime = msgSendDatetime;
  }
}
