package com.ioc.servict.impl;

import com.ioc.servict.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s2")
public class Divide implements UserService{

    @Override
    public double sum(double sum1, double sum2) {
        return sum1/sum2;
    }
}
