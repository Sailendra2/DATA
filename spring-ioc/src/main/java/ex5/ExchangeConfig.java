package ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {
	
	@Bean("xe")
	public ExchangeService getservice() {
		System.out.println("Exchange srvice object returned");
		return new ExchangeService();
	}
}
