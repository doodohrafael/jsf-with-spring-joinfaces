package com.rafael.jsfwithspringjoinfaces.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JsfSpringWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
//		Pacote raiz no qual o Spring irá procurar por suas classes.
		context.setConfigLocation("com.rafael.jsfspring");
//		context.scan("com.rafael.jsfspring");

//		Adiciona um ouvinte ao ServletContext que carregará o contexto.
		container.addListener(new ContextLoaderListener(context));
		
		container.addListener(new RequestContextListener());

//		Cria e registra nosso servlet dispatcher
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(context));

		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}
}