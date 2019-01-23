package cn.edu.cqut.chat.dto;

public class BaseDto<Entity> {

  private Entity entity;

  public BaseDto(Entity entity) {
    this.entity = entity;
  }

  public BaseDto() {
  }

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }
}
