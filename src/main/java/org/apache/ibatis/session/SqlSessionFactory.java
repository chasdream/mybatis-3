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
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * 工厂设计模式：用于创建SqlSession对象
 *
 * Creates an {@link SqlSession} out of a connection or a DataSource
 *
 * @author Clinton Begin
 */
public interface SqlSessionFactory {

  // 用来创建SqlSession对象，共有8个重载方法
  SqlSession openSession();

  // 用来创建SqlSession对象，设置是否自动提交
  SqlSession openSession(boolean autoCommit);

  // 用来创建SqlSession对象，设置连接
  SqlSession openSession(Connection connection);

  // 用来创建SqlSession对象，设置隔离级别
  SqlSession openSession(TransactionIsolationLevel level);

  // 用来创建SqlSession对象，设置执行器类型
  SqlSession openSession(ExecutorType execType);

  // 用来创建SqlSession对象，设置执行器类型和自动提交
  SqlSession openSession(ExecutorType execType, boolean autoCommit);

  // 用来创建SqlSession对象，设置执行器类型和隔离级别
  SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level);

  // 用来创建SqlSession对象，设置执行器类型和设置连接
  SqlSession openSession(ExecutorType execType, Connection connection);

  // 获取Configuration对象
  Configuration getConfiguration();

}
