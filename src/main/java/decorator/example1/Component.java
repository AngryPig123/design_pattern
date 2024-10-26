package decorator.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : decorator
 * fileName       : Component
 * author         : AngryPig123
 * date           : 24. 10. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 26.        AngryPig123       최초 생성
 */
abstract class Component {
    public abstract void doJob();
}

@Slf4j
class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        log.info("super class is = {}", this.getClass().getSuperclass().getSimpleName());
        log.info("this class = {}", this.getClass().getSimpleName());
    }
}