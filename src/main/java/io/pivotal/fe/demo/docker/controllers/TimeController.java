package io.pivotal.fe.demo.docker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sgupta
 * @since 10/14/15.
 */
@RestController
@RequestMapping(value = "/time/**", produces = "application/json")
public class TimeController {

  @RequestMapping("/")
  @ResponseBody
  public Map<String,Object> getTime() {
    Long now = System.currentTimeMillis();
    Date date = new Date(now);

    Map<String,Object> response = new HashMap<>();
    response.put("milliseconds", now);
    response.put("date", date.toString());

    return response;
  }

}
