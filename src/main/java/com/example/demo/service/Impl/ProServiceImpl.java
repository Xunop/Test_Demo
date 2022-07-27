package com.example.demo.service.Impl;

import com.example.demo.mapper.ProMapper;
import com.example.demo.service.ProService;
import org.springframework.stereotype.Service;

/**
 * @Author xun
 * @create 2022/7/19 16:34
 */
@Service
public class ProServiceImpl implements ProService {

    private final ProMapper proMapper;
    public ProServiceImpl(ProMapper proMapper) {
        this.proMapper = proMapper;
    }

    @Override
    public Integer findProId(String proName) {
        return proMapper.selectProName(proName);
    }
}
