package cn.edu.cqut.chat.config;

import org.apache.ibatis.session.Configuration;

public class MybatisConfig {

  public Configuration getDefaultConfiguration() {
    Configuration conf = new Configuration();
    conf.setUseGeneratedKeys(true);
    return conf;
  }
}
