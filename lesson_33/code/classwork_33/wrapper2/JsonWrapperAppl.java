package classwork_33.wrapper2;

import json_wrapper.wrapper1.JsonWrapper;

public class JsonWrapperAppl {
    public static void main(String[] args) {

        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("10");
        System.out.println(wrapper2.getValue() + "Hello!");

        JsonWrapper2<Integer>wrapper3 = new JsonWrapper2<>(100);

        System.out.println(wrapper3.getValue() * 3);




    }
}
