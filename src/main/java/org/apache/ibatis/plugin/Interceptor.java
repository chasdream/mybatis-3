/**
 * Copyright 2009-2019 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.plugin;

import java.util.Properties;

/**
 * @author Clinton Begin
 */
public interface Interceptor {

  /**
   * 要进行拦截的时候执行的方法
   */
  Object intercept(Invocation invocation) throws Throwable;

  /**
   * 插件用于封装目标对象，通过该方法可以返回目标对象本身，也可以返回一个目标对象的代理，
   * 可以决定是否要进行拦截进而决定要返回一个什么样的目标对象
   */
  default Object plugin(Object target) {
    return Plugin.wrap(target, this);
  }

  /**
   * 在Mybatis进行配置插件的时候可以配置自定义相关属性
   */
  default void setProperties(Properties properties) {
    // NOP
  }

}
