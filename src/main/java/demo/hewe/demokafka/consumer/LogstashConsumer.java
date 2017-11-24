package demo.hewe.demokafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @year 2017
 * @project demo-kafka
 * @description:<p></p>
 **/
@Component
public class LogstashConsumer {
    Logger LOG = LoggerFactory.getLogger(LogstashConsumer.class);

    @KafkaListener(topics = "logstash_test")
    public void processMessage(String content) {
        LOG.info("receive data : {}", content);
    }
}
