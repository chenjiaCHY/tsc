package com.ntschy.tsc;

import com.ntschy.tsc.datasource.aop.DynamicDataSourceAnnotationAdvisor;
import com.ntschy.tsc.datasource.aop.DynamicDataSourceAnnotationInterceptor;
import com.ntschy.tsc.datasource.dynamic.DynamicDatasourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy
@Import(DynamicDatasourceRegister.class)
@SpringBootApplication
@EnableTransactionManagement
public class TscApplication {

	public static void main(String[] args) {
		SpringApplication.run(TscApplication.class, args);
	}

	@Bean
	public DynamicDataSourceAnnotationAdvisor dynamicDataSourceAnnotationAdvisor() {
		return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
	}
}
