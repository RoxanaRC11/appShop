package empresa.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class AppShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppShopApplication.class, args);
	}

}
