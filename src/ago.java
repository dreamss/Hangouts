// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

public final class ago
    implements agq
{

    public final HttpClient a;

    public ago(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    public HttpResponse a(afw afw1, Map map)
    {
        afw1.a();
        JVM INSTR tableswitch -1 7: default 56
    //                   -1 66
    //                   0 180
    //                   1 210
    //                   2 235
    //                   3 195
    //                   4 260
    //                   5 275
    //                   6 290
    //                   7 305;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        throw new IllegalStateException("Unknown request method.");
_L2:
        Object obj;
        byte abyte0[] = afw1.i();
        int i;
        if (abyte0 != null)
        {
            obj = new HttpPost(afw1.c());
            ((HttpPost) (obj)).addHeader("Content-Type", afw1.h());
            ((HttpPost) (obj)).setEntity(new ByteArrayEntity(abyte0));
        } else
        {
            obj = new HttpGet(afw1.c());
        }
_L12:
        a(((HttpUriRequest) (obj)), map);
        a(((HttpUriRequest) (obj)), afw1.g());
        map = ((HttpUriRequest) (obj)).getParams();
        i = afw1.d.a();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(((HttpUriRequest) (obj)));
_L3:
        obj = new HttpGet(afw1.c());
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new HttpDelete(afw1.c());
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new HttpPost(afw1.c());
        ((HttpPost) (obj)).addHeader("Content-Type", afw1.k());
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new HttpPut(afw1.c());
        ((HttpPut) (obj)).addHeader("Content-Type", afw1.k());
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new HttpHead(afw1.c());
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new HttpOptions(afw1.c());
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new HttpTrace(afw1.c());
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new agp(afw1.c());
        ((agp) (obj)).addHeader("Content-Type", afw1.k());
        if (true) goto _L12; else goto _L11
_L11:
    }
}
