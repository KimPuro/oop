import model.Member;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        findUser("userName");
        System.out.println();

    }
        public static void findUser(String userName){
            Map<String, Member> map = new HashMap<>();
            UtilService util = UtilServiceImpl.getInstance();
            for (int i = 0; i < 5; i++) {
                map.put(util.createRandomLowerCaseUsername(), Member.builder()
                        .build());
            }
    }


}
