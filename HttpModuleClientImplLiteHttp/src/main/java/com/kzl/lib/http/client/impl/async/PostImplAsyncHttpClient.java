package com.kzl.lib.http.client.impl.async;

import android.content.Context;

import com.kzl.lib.http.client.callback.IHttpExecute;
import com.kzl.lib.http.client.interfaces.IAsyncHttpClient;
import com.kzl.lib.http.client.interfaces.callback.IHttpResponseFilter;
import com.kzl.lib.http.client.interfaces.callback.IHttpResponseHandler;
import com.kzl.lib.http.client.interfaces.model.EmptyHttpRequest;
import com.kzl.lib.http.client.interfaces.model.EmptyHttpResponse;
import com.kzl.lib.http.client.utils.AsyncHttpUtil;
import com.litesuits.http.LiteHttpClient;
import com.litesuits.http.request.Request;
import com.litesuits.http.request.param.HttpMethod;
import com.litesuits.http.response.Response;

/**
 * 通过AsyncTask实现的post异步请求
 * Project:LuLuModuleLibs<br/>
 * Module:HttpModuleClientImplLiteHttp<br/>
 * Email: <A href="kezhenlu@qq.com">kezhenlu@qq.com</A><br/>
 * User: kenny.ke<br/>
 * Date: 2014/4/21<br/>
 * Time: 17:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public class PostImplAsyncHttpClient<T extends EmptyHttpResponse> implements IAsyncHttpClient<T> {
    @Override
    public void execute(final Context context, final String requestUrl, EmptyHttpRequest request, Class<T> classOfT, IHttpResponseHandler<T> handler, IHttpResponseFilter filter) {
        AsyncHttpUtil.execute(classOfT, handler, new IHttpExecute() {
            @Override
            public Response execute() {
                return LiteHttpClient.getInstance(context).execute(new Request(requestUrl).setMethod(HttpMethod.Post));
            }
        }, filter);
    }
}
