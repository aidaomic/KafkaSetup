package conusmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class ConusmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConusmerApplication.class, args);
	}

	@KafkaListener(topics = "baeldung", groupId = "foo")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in group foo: " + message);
	}

	@KafkaListener(topics = "Test")
	public void listenGroup(String message) {
		System.out.println("Received Message in group: " + message);
	}
}
