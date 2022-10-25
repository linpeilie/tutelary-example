package com.tutelary.example.tutelaryexample;

import cn.hutool.core.thread.ThreadUtil;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public void pause() {
        ThreadUtil.safeSleep(200);
    }

}
