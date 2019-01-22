package cn.edu.cqut.chat.common.config;

import org.apache.ibatis.session.Configuration;

class MybatisConfig {

  Configuration getDefaultConfiguration() {
    Configuration conf = new Configuration();
    conf.setUseGeneratedKeys(true);
    conf.setMapUnderscoreToCamelCase(true);
    return conf;
  }
}
