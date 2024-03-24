package observer.exam1;

public class Client {

    public static void main(String[] args) {

        MyTopic subject = new MyTopic();

        MyTopicSubscriber sub1 = new MyTopicSubscriber("sub1");
        MyTopicSubscriber sub2 = new MyTopicSubscriber("sub2");
        MyTopicSubscriber sub3 = new MyTopicSubscriber("sub3");

        subject.register(sub1);
        subject.register(sub2);
        subject.register(sub3);

        sub1.setSubject(subject);
        sub2.setSubject(subject);
        sub3.setSubject(subject);

        sub1.update();

        subject.postMessage("test");

    }

}
