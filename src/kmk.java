// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.Field;

final class kmk
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String a;
    private final byte b[];

    kmk(kmy kmy1)
    {
        a = kmy1.getClass().getName();
        b = kmy1.a();
    }

    protected Object readResolve()
    {
        Object obj;
        try
        {
            obj = Class.forName(a).getDeclaredField("DEFAULT_INSTANCE");
            ((Field) (obj)).setAccessible(true);
            obj = ((kmy)((Field) (obj)).get(null)).i().b(b).h();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            String s = String.valueOf(a);
            if (s.length() != 0)
            {
                s = "Unable to find proto buffer class: ".concat(s);
            } else
            {
                s = new String("Unable to find proto buffer class: ");
            }
            throw new RuntimeException(s, classnotfoundexception);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            String s1 = String.valueOf(a);
            if (s1.length() != 0)
            {
                s1 = "Unable to find DEFAULT_INSTANCE in ".concat(s1);
            } else
            {
                s1 = new String("Unable to find DEFAULT_INSTANCE in ");
            }
            throw new RuntimeException(s1, nosuchfieldexception);
        }
        catch (SecurityException securityexception)
        {
            String s2 = String.valueOf(a);
            if (s2.length() != 0)
            {
                s2 = "Unable to call DEFAULT_INSTANCE in ".concat(s2);
            } else
            {
                s2 = new String("Unable to call DEFAULT_INSTANCE in ");
            }
            throw new RuntimeException(s2, securityexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException("Unable to call parsePartialFrom", illegalaccessexception);
        }
        catch (kmr kmr1)
        {
            throw new RuntimeException("Unable to understand proto buffer", kmr1);
        }
        return obj;
    }
}
