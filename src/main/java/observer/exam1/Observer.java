package observer.exam1;

interface Observer {

    //  method to update the observer, used by subject
    void update();

    void setSubject(Subject subject);

}

class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println("no new message");
        } else {
            System.out.println(msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }

}