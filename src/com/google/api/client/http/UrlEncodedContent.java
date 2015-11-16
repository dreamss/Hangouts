// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hsc;
import hsk;
import htg;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.api.client.http:
//            AbstractHttpContent, UrlEncodedParser, HttpRequest, HttpMediaType

public class UrlEncodedContent extends AbstractHttpContent
{

    private Object data;

    public UrlEncodedContent(Object obj)
    {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
    }

    private static boolean appendParam(boolean flag, Writer writer, String s, Object obj)
    {
        boolean flag1 = flag;
        if (obj != null)
        {
            if (hsc.a(obj))
            {
                flag1 = flag;
            } else
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    writer.write("&");
                }
                writer.write(s);
                if (obj instanceof Enum)
                {
                    s = hsk.a((Enum)obj).b();
                } else
                {
                    s = obj.toString();
                }
                s = htg.a(s);
                flag1 = flag;
                if (s.length() != 0)
                {
                    writer.write("=");
                    writer.write(s);
                    return flag;
                }
            }
        }
        return flag1;
    }

    public static UrlEncodedContent getContent(HttpRequest httprequest)
    {
        HttpContent httpcontent = httprequest.getContent();
        if (httpcontent != null)
        {
            return (UrlEncodedContent)httpcontent;
        } else
        {
            UrlEncodedContent urlencodedcontent = new UrlEncodedContent(new HashMap());
            httprequest.setContent(urlencodedcontent);
            return urlencodedcontent;
        }
    }

    public final Object getData()
    {
        return data;
    }

    public UrlEncodedContent setData(Object obj)
    {
        data = h.a(obj);
        return this;
    }

    public volatile AbstractHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        return setMediaType(httpmediatype);
    }

    public UrlEncodedContent setMediaType(HttpMediaType httpmediatype)
    {
        super.setMediaType(httpmediatype);
        return this;
    }

    public void writeTo(OutputStream outputstream)
    {
        outputstream = new BufferedWriter(new OutputStreamWriter(outputstream, getCharset()));
        Iterator iterator = hsc.b(data).entrySet().iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)iterator.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj != null)
            {
                obj1 = htg.a((String)((java.util.Map.Entry) (obj1)).getKey());
                Class class1 = obj.getClass();
                if ((obj instanceof Iterable) || class1.isArray())
                {
                    obj = g.f(obj).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        flag = appendParam(flag, outputstream, ((String) (obj1)), ((Iterator) (obj)).next());
                    }
                } else
                {
                    flag = appendParam(flag, outputstream, ((String) (obj1)), obj);
                }
            }
        } while (true);
        outputstream.flush();
    }
}
