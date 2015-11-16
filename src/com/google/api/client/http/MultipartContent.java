// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import h;
import hof;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.api.client.http:
//            AbstractHttpContent, HttpMediaType, HttpContent, HttpHeaders, 
//            HttpEncoding, HttpEncodingStreamingContent

public class MultipartContent extends AbstractHttpContent
{

    static final String NEWLINE = "\r\n";
    private static final String TWO_DASHES = "--";
    private ArrayList parts;

    public MultipartContent()
    {
        super((new HttpMediaType("multipart/related")).setParameter("boundary", "__END_OF_PART__"));
        parts = new ArrayList();
    }

    public MultipartContent addPart(Part part)
    {
        parts.add(h.b(part));
        return this;
    }

    public final String getBoundary()
    {
        return getMediaType().getParameter("boundary");
    }

    public final Collection getParts()
    {
        return Collections.unmodifiableCollection(parts);
    }

    public boolean retrySupported()
    {
        for (Iterator iterator = parts.iterator(); iterator.hasNext();)
        {
            if (!((Part)iterator.next()).content.retrySupported())
            {
                return false;
            }
        }

        return true;
    }

    public MultipartContent setBoundary(String s)
    {
        getMediaType().setParameter("boundary", (String)h.b(s));
        return this;
    }

    public MultipartContent setContentParts(Collection collection)
    {
        parts = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); addPart(new Part((HttpContent)collection.next()))) { }
        return this;
    }

    public volatile AbstractHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        return setMediaType(httpmediatype);
    }

    public MultipartContent setMediaType(HttpMediaType httpmediatype)
    {
        super.setMediaType(httpmediatype);
        return this;
    }

    public MultipartContent setParts(Collection collection)
    {
        parts = new ArrayList(collection);
        return this;
    }

    public void writeTo(OutputStream outputstream)
    {
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream, getCharset());
        String s = getBoundary();
        Iterator iterator = parts.iterator();
        while (iterator.hasNext()) 
        {
            Object obj1 = (Part)iterator.next();
            HttpHeaders httpheaders = (new HttpHeaders()).setAcceptEncoding(null);
            if (((Part) (obj1)).headers != null)
            {
                httpheaders.fromHttpHeaders(((Part) (obj1)).headers);
            }
            httpheaders.setContentEncoding(null).setUserAgent(null).setContentType(null).setContentLength(null).set("Content-Transfer-Encoding", null);
            Object obj = ((Part) (obj1)).content;
            if (obj != null)
            {
                httpheaders.set("Content-Transfer-Encoding", Arrays.asList(new String[] {
                    "binary"
                }));
                httpheaders.setContentType(((HttpContent) (obj)).getType());
                obj1 = ((Part) (obj1)).encoding;
                long l;
                if (obj1 == null)
                {
                    l = ((HttpContent) (obj)).getLength();
                } else
                {
                    httpheaders.setContentEncoding(((HttpEncoding) (obj1)).getName());
                    obj1 = new HttpEncodingStreamingContent(((hof) (obj)), ((HttpEncoding) (obj1)));
                    l = AbstractHttpContent.computeLength(((HttpContent) (obj)));
                    obj = obj1;
                }
                obj1 = obj;
                if (l != -1L)
                {
                    httpheaders.setContentLength(Long.valueOf(l));
                    obj1 = obj;
                }
            } else
            {
                obj1 = null;
            }
            outputstreamwriter.write("--");
            outputstreamwriter.write(s);
            outputstreamwriter.write("\r\n");
            HttpHeaders.serializeHeadersForMultipartRequests(httpheaders, null, null, outputstreamwriter);
            if (obj1 != null)
            {
                outputstreamwriter.write("\r\n");
                outputstreamwriter.flush();
                ((hof) (obj1)).writeTo(outputstream);
            }
            outputstreamwriter.write("\r\n");
        }
        outputstreamwriter.write("--");
        outputstreamwriter.write(s);
        outputstreamwriter.write("--");
        outputstreamwriter.write("\r\n");
        outputstreamwriter.flush();
    }

    private class Part
    {

        HttpContent content;
        HttpEncoding encoding;
        HttpHeaders headers;

        public HttpContent getContent()
        {
            return content;
        }

        public HttpEncoding getEncoding()
        {
            return encoding;
        }

        public HttpHeaders getHeaders()
        {
            return headers;
        }

        public Part setContent(HttpContent httpcontent)
        {
            content = httpcontent;
            return this;
        }

        public Part setEncoding(HttpEncoding httpencoding)
        {
            encoding = httpencoding;
            return this;
        }

        public Part setHeaders(HttpHeaders httpheaders)
        {
            headers = httpheaders;
            return this;
        }

        public Part()
        {
            this(null);
        }

        public Part(HttpContent httpcontent)
        {
            this(null, httpcontent);
        }

        public Part(HttpHeaders httpheaders, HttpContent httpcontent)
        {
            setHeaders(httpheaders);
            setContent(httpcontent);
        }
    }

}
