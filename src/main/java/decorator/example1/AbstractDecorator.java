package decorator.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : decorator
 * fileName       : AbstractDecorator
 * author         : AngryPig123
 * date           : 24. 10. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 26.        AngryPig123       최초 생성
 */
abstract class AbstractDecorator extends Component {
    protected Component component;

    public void SetTheComponent(Component component) {
        this.component = component;
    }

    public void doJob() {
        if (this.component != null) {
            this.component.doJob();
        }
    }

}

@Slf4j
class ConcreteDecorateEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        //  add additional responsibilities
        log.info("super class is = {}", this.getClass().getSuperclass().getSimpleName());
        log.info("this class = {}", this.getClass().getSimpleName());
    }
}

@Slf4j
class ConcreteDecorateEx_2 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        //  add additional responsibilities
        log.info("super class is = {}", this.getClass().getSuperclass().getSimpleName());
        log.info("this class = {}", this.getClass().getSimpleName());
    }
}
