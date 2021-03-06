package com.kzl.lib.http.task.interfaces.sync.impl;

import android.content.Context;

import com.kzl.lib.http.client.impl.sync.GetImplSyncHttpClient;
import com.kzl.lib.http.client.interfaces.model.EmptyHttpResponse;

/**
 * 同步请求Get请求方式基类<br/>
 * Project:LuLuModuleLibs<br/>
 * Module:HttpModuleProjectInterfaces<br/>
 * Email: <A href="kezhenlu@qq.com">kezhenlu@qq.com</A><br/>
 * User: kenny.ke<br/>
 * Date: 2014/4/21<br/>
 * Time: 17:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public class GetImplSyncHttpTask<T extends EmptyHttpResponse> extends BaseImplSyncHttpTask<T> {

    public GetImplSyncHttpTask(Context context) {
        super(context,new GetImplSyncHttpClient());
    }
}
