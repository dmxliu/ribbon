package com.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cloud.config.DemoProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class CloudSimple1ApplicationTests {


	
	
	
	@Autowired
	private DemoProperties demoProperties;
	
	@Test
	public void getProperties() {
		System.out.println(demoProperties.toString());
	}

}
