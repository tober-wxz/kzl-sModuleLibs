package com.kzl.lib.http.sample.http.base.async.impl;

import android.content.Context;
import com.kzl.lib.http.client.impl.async.GetImplAsyncHttpClient;
import com.kzl.lib.http.sample.module.BaseResponse;

/**
 * http async get 请求基类<br/>
 * Project:LuLuModuleLibs<br/>
 * Module:HttpModuleSample<br/>
 * Email: <A href="kezhenlu@qq.com">kezhenlu@qq.com</A><br/>
 * User: kenny.ke<br/>
 * Date: 2014/4/21<br/>
 * Time: 17:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public class ImplBaseGetAsyncHttpTask<T extends BaseResponse> extends ImplBaseAsyncHttpTask<T> {
    public ImplBaseGetAsyncHttpTask(Context context) {
        super(context, new GetImplAsyncHttpClient());
    }
}
