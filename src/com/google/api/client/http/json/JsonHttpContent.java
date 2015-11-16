// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.json;

import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import h;
import java.io.OutputStream;

public class JsonHttpContent extends AbstractHttpContent
{

    private final Object data;
    private final JsonFactory jsonFactory;
    private String wrapperKey;

    public JsonHttpContent(JsonFactory jsonfactory, Object obj)
    {
        super("application/json; charset=UTF-8");
        jsonFactory = (JsonFactory)h.a(jsonfactory);
        data = h.a(obj);
    }

    public final Object getData()
    {
        return data;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final String getWrapperKey()
    {
        return wrapperKey;
    }

    public volatile AbstractHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        return setMediaType(httpmediatype);
    }

    public JsonHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        super.setMediaType(httpmediatype);
        return this;
    }

    public JsonHttpContent setWrapperKey(String s)
    {
        wrapperKey = s;
        return this;
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream = jsonFactory.createJsonGenerator(outputstream, getCharset());
        if (wrapperKey != null)
        {
            outputstream.writeStartObject();
            outputstream.writeFieldName(wrapperKey);
        }
        outputstream.serialize(data);
        if (wrapperKey != null)
        {
            outputstream.writeEndObject();
        }
        outputstream.flush();
    }
}
