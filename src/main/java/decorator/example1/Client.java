package decorator.example1;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : decorator
 * fileName       : Client
 * author         : AngryPig123
 * date           : 24. 10. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 26.        AngryPig123       최초 생성
 */
@Slf4j
public class Client {

    public static void main(String[] args) {

        ConcreteComponent cc = new ConcreteComponent();
        cc.doJob();
        log.info("\n");

        ConcreteDecorateEx_1 ccEx1 = new ConcreteDecorateEx_1();
        ccEx1.SetTheComponent(cc);
        ccEx1.doJob();
        log.info("\n");

        ConcreteDecorateEx_2 ccEx2 = new ConcreteDecorateEx_2();
        ccEx2.SetTheComponent(ccEx1);
        ccEx2.doJob();

    }

}
