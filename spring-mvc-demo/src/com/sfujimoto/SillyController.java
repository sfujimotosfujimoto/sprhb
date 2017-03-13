package com.sfujimoto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sfujimoto on 2017/03/13.
 */
@Controller
public class SillyController {
    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }
}
