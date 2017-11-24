# 概述
用于消费kafka的消息
# 文件
* `src/main/resources/application.yml` 配置kafka连接信息等
* `src/main/java/DemoKafkaApplication` 启动类
* `src/main/demo.hewe.demokafka.consumer.LogstashConsumer` 消费者,监听消息,收到后打印在控制台.