package edu.szymczak;

import edu.szymczak.controller.ClientLoginViewController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class ClientTests {

    private ClientLoginViewController clientLoginViewController = new ClientLoginViewController();

    @Test
    void MockitoTest() {
        ClientLoginViewController clientLoginViewControllerMock = mock(ClientLoginViewController.class);
        when(clientLoginViewControllerMock.getName()).thenReturn("mocked");
        assert clientLoginViewControllerMock.getName().equals("mocked");
    }

}
