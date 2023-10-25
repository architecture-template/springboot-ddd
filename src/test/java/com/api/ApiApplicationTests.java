package com.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.when;
import com.api.domain.model.Example;
import com.api.domain.repository.ExampleRepository;
import com.api.app.controller.ExampleController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiApplicationTests {

    @MockBean
    private ExampleRepository exampleRepository;

    @MockBean
    private ExampleController exampleController;

    @Test
    void contextLoads() {
        // TODO: Test code
    }
}
