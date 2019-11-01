package com.spicak.customProfileAnnotation.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author pavelspicak, 01/11/2019.
 */
@Component
@DevProfile
public class DevComponent
{
	private Logger logger = LoggerFactory.getLogger(DevComponent.class);

	public DevComponent()
	{
		logger.info("dev component created.");
	}
}
