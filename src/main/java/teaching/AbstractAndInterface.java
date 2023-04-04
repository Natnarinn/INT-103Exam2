package teaching;

public class AbstractAndInterface {
    public static void main(String[] args) {
//        Greeting g = new Greeting();
//
//        g.sayHi();
//        g.sayHello();

//        Mobile mobile = new Mobile();
//        mobile.call();
//        mobile.hangup();
//        mobile.capture();

//        RichMobile rmobile = new RichMobile();
//        rmobile.call();
//        rmobile.capture();
//        rmobile.hangup();
//        rmobile.track();

        RichMobileByExtend rxmobile = new RichMobileByExtend();
        rxmobile.call();
        rxmobile.capture();
        rxmobile.hangup();
        rxmobile.track();
    }
}

interface Gps {
    void track();
}

interface Camera {
    void capture();
}

interface Phone {
    void call();
    void hangup();
}

class Mobile implements Phone, Camera {

    @Override
    public void capture() {
        System.out.println("Mobile capture");
    }

    @Override
    public void call() {
        System.out.println("Mobile call");
    }

    @Override
    public void hangup() {
        System.out.println("Mobile hangup");
    }

}

class RichMobile implements Gps, Camera, Phone {

    @Override
    public void track() {
        System.out.println("Rich Mobile track");
    }

    @Override
    public void capture() {
        System.out.println("Rich Mobile capture");
    }

    @Override
    public void call() {
        System.out.println("Rich Mobile call");
    }

    @Override
    public void hangup() {
        System.out.println("Rich Mobile hangup");
    }
}

class RichMobileByExtend extends Mobile implements Gps {

    @Override
    public void track() {
        System.out.println("Rich mobile track");
    }
}

abstract class Abastract {
    void sayHello() {
        System.out.println("Hello");
    }

    abstract void sayHi();
}

class Greeting extends Abastract {

    @Override
    void sayHello() {
        System.out.println("Say Hello");
    }

    @Override
    void sayHi() {
        System.out.println("Say Hi");
    }
}
