package com.sele.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-transaction.xml"})
public class ConfigClass {

}
