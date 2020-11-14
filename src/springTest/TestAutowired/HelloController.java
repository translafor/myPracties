package springTest.TestAutowired;

public class HelloController {
    @Autowired
    HelloService helloService;

    public HelloService getHelloService(){
        return helloService;
    }
}
