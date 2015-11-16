// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import hsx;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l;

// Referenced classes of package com.google.api.client.json:
//            JsonParser, JsonToken, JsonFactory

public class JsonObjectParser
    implements hsx
{

    private final JsonFactory jsonFactory;
    private final Set wrapperKeys;

    public JsonObjectParser(JsonFactory jsonfactory)
    {
        this(new Builder(jsonfactory));
    }

    protected JsonObjectParser(Builder builder)
    {
        jsonFactory = builder.jsonFactory;
        wrapperKeys = new HashSet(builder.wrapperKeys);
    }

    private void initializeParser(JsonParser jsonparser)
    {
        boolean flag;
        flag = true;
        if (wrapperKeys.isEmpty())
        {
            return;
        }
        Exception exception;
        if (jsonparser.skipToKey(wrapperKeys) == null || jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
        {
            flag = false;
        }
        l.a(flag, "wrapper key(s) not found: %s", new Object[] {
            wrapperKeys
        });
        return;
        exception;
        jsonparser.close();
        throw exception;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public Set getWrapperKeys()
    {
        return Collections.unmodifiableSet(wrapperKeys);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
    {
        return parseAndClose(inputstream, charset, ((Type) (class1)));
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Type type)
    {
        inputstream = jsonFactory.createJsonParser(inputstream, charset);
        initializeParser(inputstream);
        return inputstream.parse(type, true);
    }

    public Object parseAndClose(Reader reader, Class class1)
    {
        return parseAndClose(reader, ((Type) (class1)));
    }

    public Object parseAndClose(Reader reader, Type type)
    {
        reader = jsonFactory.createJsonParser(reader);
        initializeParser(reader);
        return reader.parse(type, true);
    }

    private class Builder
    {

        final JsonFactory jsonFactory;
        Collection wrapperKeys;

        public JsonObjectParser build()
        {
            return new JsonObjectParser(this);
        }

        public final JsonFactory getJsonFactory()
        {
            return jsonFactory;
        }

        public final Collection getWrapperKeys()
        {
            return wrapperKeys;
        }

        public Builder setWrapperKeys(Collection collection)
        {
            wrapperKeys = collection;
            return this;
        }

        public Builder(JsonFactory jsonfactory)
        {
            wrapperKeys = new HashSet();
            jsonFactory = (JsonFactory)h.a(jsonfactory);
        }
    }

}
