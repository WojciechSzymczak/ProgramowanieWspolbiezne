package edu.szymczak.client;

import edu.szymczak.client.service.BasicLoginService;
import edu.szymczak.common.service.LoginOutputDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class BasicLoginServiceTests {

    BasicLoginService loginService = new BasicLoginService();

    @Test
    void MockitoTest() {
        loginService = Mockito.mock(BasicLoginService.class);
        Mockito.when(loginService.login(null)).thenReturn(new LoginOutputDAO(0, "SUCCESS", "3817fefea9f57f1c516e8ae53176e20d"));
        assert loginService.login(null).getStatusMessage().equals("SUCCESS");
    }
}
