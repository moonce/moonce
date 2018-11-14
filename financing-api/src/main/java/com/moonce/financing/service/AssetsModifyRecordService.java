package com.moonce.financing.service;

import com.moonce.financing.entity.Assets;
import com.moonce.financing.entity.AssetsModifyRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AssetsModifyRecordService {
    void save(AssetsModifyRecord assetsModifyRecord);

    AssetsModifyRecord get(Integer id);

    List<AssetsModifyRecord> list(AssetsModifyRecord assetsModifyRecord);

    Page<AssetsModifyRecord> page(Pageable pageable);

    void delete(Integer id);
}
