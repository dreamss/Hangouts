// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;

public final class ho
{

    private static final Object a = new Object();
    private static char b[] = new char[24];

    private static int a(char ac[], int i, char c, int j, boolean flag, int k)
    {
label0:
        {
label1:
            {
                if (!flag)
                {
                    k = j;
                    if (i <= 0)
                    {
                        break label0;
                    }
                }
                int i1;
                int j1;
                if (i > 99)
                {
                    int l = i / 100;
                    ac[j] = (char)(l + 48);
                    k = j + 1;
                    i -= l * 100;
                } else
                {
                    k = j;
                }
                if (i <= 9)
                {
                    j1 = k;
                    i1 = i;
                    if (j == k)
                    {
                        break label1;
                    }
                }
                j = i / 10;
                ac[k] = (char)(j + 48);
                j1 = k + 1;
                i1 = i - j * 10;
            }
            ac[j1] = (char)(i1 + 48);
            i = j1 + 1;
            ac[i] = c;
            k = i + 1;
        }
        return k;
    }

    public static void a(long l, long l1, PrintWriter printwriter)
    {
        if (l == 0L)
        {
            printwriter.print("--");
            return;
        } else
        {
            b(l - l1, printwriter);
            return;
        }
    }

    public static void a(long l, PrintWriter printwriter)
    {
        b(l, printwriter);
    }

    private static void b(long l, PrintWriter printwriter)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        char ac[];
        if (b.length < 0)
        {
            b = new char[0];
        }
        ac = b;
        int i;
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        ac[0] = '0';
        i = 1;
_L1:
        printwriter.print(new String(b, 0, i));
        obj;
        JVM INSTR monitorexit ;
        return;
        boolean flag;
        if (l > 0L)
        {
            c = '+';
        } else
        {
            l = -l;
            c = '-';
        }
        k1 = (int)(l % 1000L);
        i = (int)Math.floor(l / 1000L);
        if (i <= 0x15180)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        j = i / 0x15180;
_L4:
        for (i -= j * 0x15180; i <= 3600;)
        {
            break MISSING_BLOCK_LABEL_294;
        }

        k = i / 3600;
_L3:
        for (i -= k * 3600; i <= 60;)
        {
            break MISSING_BLOCK_LABEL_288;
        }

        j1 = i / 60;
        i1 = j1;
        i -= j1 * 60;
_L2:
        ac[0] = c;
        j = a(ac, j, 'd', 1, false, 0);
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = a(ac, k, 'h', j, flag, 0);
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = a(ac, i1, 'm', j, flag, 0);
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = a(ac, k1, 'm', a(ac, i, 's', j, flag, 0), true, 0);
        ac[i] = 's';
        i++;
          goto _L1
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
        i1 = 0;
          goto _L2
        k = 0;
          goto _L3
        j = 0;
          goto _L4
    }

}
