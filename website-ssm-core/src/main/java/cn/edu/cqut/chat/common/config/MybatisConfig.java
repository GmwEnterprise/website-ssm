package cn.edu.cqut.chat.common.config;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.Configuration;

class MybatisConfig {

  Configuration getDefaultConfiguration() {
    Configuration conf = new Configuration();
    conf.setUseGeneratedKeys(true);
    conf.setMapUnderscoreToCamelCase(true);
    conf.setLogImpl(Slf4jImpl.class);
    return conf;
  }
}
