package com.adwork.photos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.HttpSolrServerFactoryBean;

@Configuration
public class SolrContext {
	//@Resource
	//private Environment environment;
	
	
	
	@Bean
	public HttpSolrServerFactoryBean solrServerFactoryBean(){
		HttpSolrServerFactoryBean httpSolrServerFactoryBean = new HttpSolrServerFactoryBean();
		httpSolrServerFactoryBean.setUrl("http://localhost:8983/solr/");
		
		return httpSolrServerFactoryBean;
	}
	
	@Bean
	public SolrTemplate solrTemplate() throws Exception{
		return new SolrTemplate(solrServerFactoryBean().getObject());
	}

}
