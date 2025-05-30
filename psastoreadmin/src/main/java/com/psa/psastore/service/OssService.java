package com.psa.psastore.service;

import com.psa.psastore.dto.OssCallbackResult;
import com.psa.psastore.dto.OssPolicyResult;
import jakarta.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
