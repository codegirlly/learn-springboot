package service.impl;

import org.springframework.stereotype.Service;
import service.LyService;

@Service
public class LyServiceImpl implements LyService{

    @Override
    public String cook() {
        return "手抓饼";
    }

}
