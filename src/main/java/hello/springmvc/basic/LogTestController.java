package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // <- 사용시 메소드 리턴값이 view 페이지가 아닌 String 그대로 노출됨
public class LogTestController {

    // @Slf4j 어노테이션 사용시 Logger 선언 필요없음
//    private final Logger log = LoggerFactory.getLogger(getClass()); // getClass() == LogTestController.Class

    @GetMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
