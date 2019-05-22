package py.eder.colman.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//import py.eder.colman.controller.HomeController;
//habilitar el modulo MVC de spring 
@EnableWebMvc
//Cargar los paquetes del Controller y DAO
//@ComponentScan(basePackageClasses = { HomeController.class })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	//indicamos que es un objeto de configuración 
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//prefijo de la pagina
		resolver.setPrefix("/recursos/");
		//sub-fijo o extension del archivo
		//letra E del ejercicio 
		resolver.setSuffix(".html");
		return resolver;
	}
}
