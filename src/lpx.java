// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class lpx
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final lpy b[] = new lpy[25];

    private static String a(String s, int ai[])
    {
        char c;
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder();
        i = ai[0];
        l = s.length();
        c = s.charAt(i);
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) goto _L2; else goto _L1
_L1:
        int j;
        stringbuilder.append(c);
        do
        {
            j = i;
            if (i + 1 >= l)
            {
                break;
            }
            j = i;
            if (s.charAt(i + 1) != c)
            {
                break;
            }
            stringbuilder.append(c);
            i++;
        } while (true);
          goto _L3
_L2:
        int k;
        stringbuilder.append('\'');
        k = 0;
_L7:
        j = i;
        if (i >= l) goto _L3; else goto _L4
_L4:
        c = s.charAt(i);
        if (c != '\'') goto _L6; else goto _L5
_L5:
        if (i + 1 < l && s.charAt(i + 1) == '\'')
        {
            i++;
            stringbuilder.append(c);
            j = k;
        } else
        if (k == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
_L8:
        i++;
        k = j;
          goto _L7
_L6:
        if (k != 0 || (c < 'A' || c > 'Z') && (c < 'a' || c > 'z'))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        j = i - 1;
_L3:
        ai[0] = j;
        return stringbuilder.toString();
        stringbuilder.append(c);
        j = k;
          goto _L8
    }

    public static lpy a(String s)
    {
        lpy lpy1;
label0:
        {
            if (s.length() == 0)
            {
                throw new IllegalArgumentException("Invalid pattern specification");
            }
            lpy1 = (lpy)a.get(s);
            Object obj = lpy1;
            if (lpy1 == null)
            {
                obj = new lpz();
                a(((lpz) (obj)), s);
                lpy1 = ((lpz) (obj)).a();
                if (a.size() >= 500)
                {
                    break label0;
                }
                obj = (lpy)a.putIfAbsent(s, lpy1);
                if (obj == null)
                {
                    break label0;
                }
            }
            return ((lpy) (obj));
        }
        return lpy1;
    }

    private static void a(lpz lpz1, String s)
    {
        int ai[];
        int i;
        int l;
        l = s.length();
        ai = new int[1];
        i = 0;
_L23:
        String s1;
        int k;
        int i1;
        char c;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_839;
        }
        ai[0] = i;
        s1 = a(s, ai);
        i1 = ai[0];
        k = s1.length();
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_839;
        }
        c = s1.charAt(0);
        c;
        JVM INSTR lookupswitch 22: default 244
    //                   39: 783
    //                   67: 286
    //                   68: 699
    //                   69: 677
    //                   71: 272
    //                   72: 605
    //                   75: 625
    //                   77: 539
    //                   83: 655
    //                   89: 298
    //                   90: 741
    //                   97: 587
    //                   100: 577
    //                   101: 667
    //                   104: 595
    //                   107: 615
    //                   109: 635
    //                   115: 645
    //                   119: 709
    //                   120: 298
    //                   121: 298
    //                   122: 719;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L11 _L11 _L21
_L2:
        break MISSING_BLOCK_LABEL_783;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        lpz1 = String.valueOf(s1);
        int j;
        if (lpz1.length() != 0)
        {
            lpz1 = "Illegal pattern component: ".concat(lpz1);
        } else
        {
            lpz1 = new String("Illegal pattern component: ");
        }
        throw new IllegalArgumentException(lpz1);
_L6:
        lpz1.j();
_L24:
        i = i1 + 1;
        if (true) goto _L23; else goto _L22
_L22:
        lpz1.e(k, k);
          goto _L24
_L11:
        if (k == 2)
        {
            boolean flag;
            if (i1 + 1 < l)
            {
                ai[0] = ai[0] + 1;
                if (b(a(s, ai)))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                ai[0] = ai[0] - 1;
            } else
            {
                flag = true;
            }
            switch (c)
            {
            default:
                lpz1.a((new lnh()).c() - 30, flag);
                break;

            case 120: // 'x'
                lpz1.b((new lnh()).d() - 30, flag);
                break;
            }
        } else
        {
            i = 9;
            j = i;
            if (i1 + 1 < l)
            {
                ai[0] = ai[0] + 1;
                if (b(a(s, ai)))
                {
                    i = k;
                }
                ai[0] = ai[0] - 1;
                j = i;
            }
            switch (c)
            {
            case 89: // 'Y'
                lpz1.d(k, j);
                break;

            case 120: // 'x'
                lpz1.b(k, j);
                break;

            case 121: // 'y'
                lpz1.c(k, j);
                break;
            }
        }
        if (true) goto _L24; else goto _L25
_L25:
_L9:
        if (k >= 3)
        {
            if (k >= 4)
            {
                lpz1.h();
            } else
            {
                lpz1.i();
            }
        } else
        {
            lpz1.k(k);
        }
          goto _L24
_L14:
        lpz1.h(k);
          goto _L24
_L13:
        lpz1.e();
          goto _L24
_L16:
        lpz1.f(k);
          goto _L24
_L7:
        lpz1.c(k);
          goto _L24
_L17:
        lpz1.d(k);
          goto _L24
_L8:
        lpz1.e(k);
          goto _L24
_L18:
        lpz1.b(k);
          goto _L24
_L19:
        lpz1.a(k);
          goto _L24
_L10:
        lpz1.a(k, k);
          goto _L24
_L15:
        lpz1.g(k);
          goto _L24
_L5:
        if (k >= 4)
        {
            lpz1.f();
        } else
        {
            lpz1.g();
        }
          goto _L24
_L4:
        lpz1.i(k);
          goto _L24
_L20:
        lpz1.j(k);
          goto _L24
_L21:
        if (k >= 4)
        {
            lpz1.k();
        } else
        {
            lpz1.l();
        }
          goto _L24
_L12:
        if (k == 1)
        {
            lpz1.a("Z", false);
        } else
        if (k == 2)
        {
            lpz1.a("Z", true);
        } else
        {
            lpz1.m();
        }
          goto _L24
        s1 = s1.substring(1);
        if (s1.length() == 1)
        {
            lpz1.a(s1.charAt(0));
        } else
        {
            lpz1.a(new String(s1));
        }
          goto _L24
    }

    private static boolean b(String s)
    {
        int i;
        boolean flag;
        flag = true;
        i = s.length();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        s.charAt(0);
        JVM INSTR lookupswitch 19: default 180
    //                   67: 182
    //                   68: 182
    //                   70: 182
    //                   72: 182
    //                   75: 182
    //                   77: 184
    //                   83: 182
    //                   87: 182
    //                   89: 182
    //                   99: 182
    //                   100: 182
    //                   101: 182
    //                   104: 182
    //                   107: 182
    //                   109: 182
    //                   115: 182
    //                   119: 182
    //                   120: 182
    //                   121: 182;
           goto _L2 _L3 _L3 _L3 _L3 _L3 _L4 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L2:
        flag = false;
_L3:
        return flag;
_L4:
        if (i <= 2)
        {
            return true;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
