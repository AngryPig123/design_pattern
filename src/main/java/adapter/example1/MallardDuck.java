package adapter.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shguddnr2@coremethod.co.kr
 * @version 1.0
 * @description
 * @since 24. 10. 31.
 */
@Slf4j
public class MallardDuck implements Duck {
    
    @Override
    public void quack() {
        log.info("quack this class = {}", this.getClass().getSimpleName());
    }

    @Override
    public void fly() {
        log.info("fly this class = {}", this.getClass().getSimpleName());
    }

}
