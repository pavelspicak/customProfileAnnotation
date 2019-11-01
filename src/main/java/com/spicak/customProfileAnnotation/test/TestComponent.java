package com.spicak.customProfileAnnotation.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author pavelspicak, 01/11/2019.
 */
@Component
@TestProfile
public class TestComponent
{
	private Logger logger = LoggerFactory.getLogger(TestComponent.class);

	public TestComponent()
	{
		logger.info("test component created.");
	}
}
