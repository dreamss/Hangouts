// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class uh
    implements Comparable
{

    public final ResolveInfo a;
    public float b;
    final ug c;

    public uh(ug ug, ResolveInfo resolveinfo)
    {
        c = ug;
        super();
        a = resolveinfo;
    }

    public int compareTo(Object obj)
    {
        return Float.floatToIntBits(((uh)obj).b) - Float.floatToIntBits(b);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (uh)obj;
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((uh) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Float.floatToIntBits(b) + 31;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("resolveInfo:").append(a.toString());
        stringbuilder.append("; weight:").append(new BigDecimal(b));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
