// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class fzg
    implements Collection, Set
{

    static Object a[];
    static int b;
    static Object c[];
    static int d;
    int e[];
    Object f[];
    int g;
    fzj h;

    public fzg()
    {
        e = fzi.b;
        f = fzi.d;
        g = 0;
    }

    private static void a(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        fzg;
        JVM INSTR monitorenter ;
        if (d < 10)
        {
            aobj[0] = ((Object) (c));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        c = aobj;
        d++;
_L3:
        fzg;
        JVM INSTR monitorexit ;
        return;
        ai;
        fzg;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        fzg;
        JVM INSTR monitorenter ;
        if (b >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (a));
        aobj[1] = ai;
        i--;
        break MISSING_BLOCK_LABEL_130;
_L9:
        a = aobj;
        b++;
_L7:
        fzg;
        JVM INSTR monitorexit ;
        return;
        ai;
        fzg;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        i--;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L8
_L5:
        return;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L9
    }

    private void b(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        fzg;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aobj = c;
        f = aobj;
        c = (Object[])aobj[0];
        e = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        d--;
        fzg;
        JVM INSTR monitorexit ;
        return;
        fzg;
        JVM INSTR monitorexit ;
_L4:
        e = new int[i];
        f = new Object[i];
        return;
        Exception exception;
        exception;
        fzg;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        fzg;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        exception = ((Exception) (a));
        f = exception;
        a = (Object[])exception[0];
        e = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        b--;
        fzg;
        JVM INSTR monitorexit ;
        return;
        exception;
        fzg;
        JVM INSTR monitorexit ;
        throw exception;
        fzg;
        JVM INSTR monitorexit ;
          goto _L4
    }

    int a()
    {
        int l = g;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int k;
        int j = fzi.a(e, l, 0);
        i = j;
        if (j >= 0)
        {
            i = j;
            if (f[j] != null)
            {
                for (k = j + 1; k < l && e[k] == 0; k++)
                {
                    if (f[k] == null)
                    {
                        return k;
                    }
                }

                j--;
label0:
                do
                {
label1:
                    {
                        if (j < 0 || e[j] != 0)
                        {
                            break label1;
                        }
                        i = j;
                        if (f[j] == null)
                        {
                            break label0;
                        }
                        j--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~k;
    }

    int a(Object obj, int i)
    {
        int i1 = g;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l;
        int k = fzi.a(e, i1, i);
        j = k;
        if (k >= 0)
        {
            j = k;
            if (!obj.equals(f[k]))
            {
                for (l = k + 1; l < i1 && e[l] == i; l++)
                {
                    if (obj.equals(f[l]))
                    {
                        return l;
                    }
                }

                k--;
label0:
                do
                {
label1:
                    {
                        if (k < 0 || e[k] != i)
                        {
                            break label1;
                        }
                        j = k;
                        if (obj.equals(f[k]))
                        {
                            break label0;
                        }
                        k--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~l;
    }

    public Object a(int i)
    {
        int j = 8;
        Object obj = f[i];
        if (g <= 1)
        {
            a(e, f, g);
            e = fzi.b;
            f = fzi.d;
            g = 0;
        } else
        if (e.length > 8 && g < e.length / 3)
        {
            if (g > 8)
            {
                j = g + (g >> 1);
            }
            int ai[] = e;
            Object aobj[] = f;
            b(j);
            g = g - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, e, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (f)), 0, i);
            }
            if (i < g)
            {
                System.arraycopy(ai, i + 1, e, i, g - i);
                System.arraycopy(((Object) (aobj)), i + 1, ((Object) (f)), i, g - i);
                return obj;
            }
        } else
        {
            g = g - 1;
            if (i < g)
            {
                System.arraycopy(e, i + 1, e, i, g - i);
                System.arraycopy(((Object) (f)), i + 1, ((Object) (f)), i, g - i);
            }
            f[g] = null;
            return obj;
        }
        return obj;
    }

    public boolean add(Object obj)
    {
        int k;
        byte byte0;
        int l;
        byte0 = 8;
        int i;
        if (obj == null)
        {
            i = a();
            k = 0;
        } else
        {
            k = obj.hashCode();
            i = a(obj, k);
        }
        if (i >= 0)
        {
            return false;
        }
        l = ~i;
        if (g < e.length) goto _L2; else goto _L1
_L1:
        if (g < 8) goto _L4; else goto _L3
_L3:
        int j = g + (g >> 1);
_L6:
        int ai[] = e;
        Object aobj[] = f;
        b(j);
        if (e.length > 0)
        {
            System.arraycopy(ai, 0, e, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (f)), 0, aobj.length);
        }
        a(ai, aobj, g);
_L2:
        if (l < g)
        {
            System.arraycopy(e, l, e, l + 1, g - l);
            System.arraycopy(((Object) (f)), l, ((Object) (f)), l + 1, g - l);
        }
        e[l] = k;
        f[l] = obj;
        g = g + 1;
        return true;
_L4:
        j = byte0;
        if (g < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = false;
        int i = g + collection.size();
        if (e.length < i)
        {
            int ai[] = e;
            Object aobj[] = f;
            b(i);
            if (g > 0)
            {
                System.arraycopy(ai, 0, e, 0, g);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (f)), 0, g);
            }
            a(ai, aobj, g);
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= add(collection.next());
        }

        return flag;
    }

    public void clear()
    {
        if (g != 0)
        {
            a(e, f, g);
            e = fzi.b;
            f = fzi.d;
            g = 0;
        }
    }

    public boolean contains(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (a() < 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (a(obj, obj.hashCode()) < 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (!(obj instanceof Set))
            {
                break label0;
            }
            obj = (Set)obj;
            if (size() != ((Set) (obj)).size())
            {
                return false;
            }
            int i = 0;
            do
            {
                boolean flag;
                try
                {
                    if (i >= g)
                    {
                        break;
                    }
                    flag = ((Set) (obj)).contains(f[i]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                if (!flag)
                {
                    return false;
                }
                i++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public int hashCode()
    {
        int i = 0;
        int ai[] = e;
        int k = g;
        int j = 0;
        for (; i < k; i++)
        {
            j += ai[i];
        }

        return j;
    }

    public boolean isEmpty()
    {
        return g <= 0;
    }

    public Iterator iterator()
    {
        if (h == null)
        {
            h = new fzh(this);
        }
        return h.e().iterator();
    }

    public boolean remove(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = a();
        } else
        {
            i = a(obj, obj.hashCode());
        }
        if (i >= 0)
        {
            a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= remove(collection.next());
        }

        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        int i = g;
        boolean flag = false;
        for (i--; i >= 0; i--)
        {
            if (!collection.contains(f[i]))
            {
                a(i);
                flag = true;
            }
        }

        return flag;
    }

    public int size()
    {
        return g;
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[g];
        System.arraycopy(((Object) (f)), 0, ((Object) (aobj)), 0, g);
        return aobj;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length < g)
        {
            aobj = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), g);
        }
        System.arraycopy(((Object) (f)), 0, ((Object) (aobj)), 0, g);
        if (aobj.length > g)
        {
            aobj[g] = null;
        }
        return aobj;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(g * 14);
        stringbuilder.append('{');
        int i = 0;
        while (i < g) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = f[i];
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Set)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
