package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

/**
 * packageName    : mockito
 * fileName       : MockitoTest
 * author         : AngryPig123
 * date           : 24. 10. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 26.        AngryPig123       최초 생성
 */
@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @InjectMocks
    private InjectMockServiceImpl injectMockService;

    @Mock
    private DependencyService dependencyService;

    @Test
    void test() {
        //given
        when(dependencyService.returnString()).thenReturn("ABCDEFG");

        //when
        Assertions.assertEquals("ABCDEFG".toLowerCase(), injectMockService.returnLowerString());

        //then
        then(dependencyService).should(times(1)).returnString();
    }

    static class InjectMockServiceImpl implements InjectMockService {

        private final DependencyService dependencyService;

        public InjectMockServiceImpl(DependencyService dependencyService) {
            this.dependencyService = dependencyService;
        }

        @Override
        public String returnLowerString() {
            return dependencyService.returnString().toLowerCase();
        }

    }

    interface InjectMockService {
        String returnLowerString();
    }

    interface DependencyService {
        String returnString();
    }

}
