package yj.zljjc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yj.zljjc.dao")
public class ZljjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZljjcApplication.class, args);
	}
}
