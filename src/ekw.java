// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ekw
{

    private static final Pattern a = Pattern.compile(" +");
    private static final Pattern b = Pattern.compile("\\W");
    private static ekw c = new ekw(new ekx[0]);
    private static Object d;
    private final ekx e[];
    private final Pattern f;

    private ekw(ekx aekx[])
    {
        Arrays.sort(aekx);
        StringBuilder stringbuilder = new StringBuilder("(");
        for (int i = 0; i < aekx.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(")|(");
            }
            stringbuilder.append(b.matcher(aekx[i].b).replaceAll("\\\\$0"));
        }

        f = Pattern.compile(stringbuilder.append(")").toString());
        e = aekx;
    }

    public static ekw a(ContentResolver contentresolver)
    {
        ekw;
        JVM INSTR monitorenter ;
        Object obj = fzd.a(contentresolver);
        if (obj != d) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("UrlRules", 2))
        {
            (new StringBuilder("Using cached rules, versionToken: ")).append(obj);
        }
        contentresolver = c;
_L6:
        ekw;
        JVM INSTR monitorexit ;
        return contentresolver;
_L2:
        Object obj1;
        obj1 = fzd.a(contentresolver, new String[] {
            "url:"
        });
        contentresolver = new ArrayList();
        obj1 = ((Map) (obj1)).entrySet().iterator();
_L4:
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        String s;
        s = ((String)((java.util.Map.Entry) (obj2)).getKey()).substring(4);
        obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj2)).length() == 0) goto _L4; else goto _L5
_L5:
        if (Log.isLoggable("UrlRules", 2))
        {
            (new StringBuilder("  Rule ")).append(s).append(": ").append(((String) (obj2)));
        }
        contentresolver.add(new ekx(s, ((String) (obj2))));
          goto _L4
        eky eky1;
        eky1;
        Log.e("UrlRules", "Invalid rule from Gservices", eky1);
          goto _L4
        contentresolver;
        throw contentresolver;
        c = new ekw((ekx[])contentresolver.toArray(new ekx[contentresolver.size()]));
        d = obj;
        if (Log.isLoggable("UrlRules", 2))
        {
            (new StringBuilder("New rules stored, versionToken: ")).append(obj);
        }
        contentresolver = c;
          goto _L6
    }

    static Pattern a()
    {
        return a;
    }

    public ekx a(String s)
    {
        s = f.matcher(s);
        if (s.lookingAt())
        {
            for (int i = 0; i < e.length; i++)
            {
                if (s.group(i + 1) != null)
                {
                    return e[i];
                }
            }

        }
        return ekx.e;
    }

}
