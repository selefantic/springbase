package com.sele.config;

import org.springframework.beans.factory.annotation.Value;

public class RemoteConfig {
	@Value("${server.value}")
    public String value;

}
