// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import hsc;
import hsk;
import htg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.api.client.http:
//            GenericUrl

public class UriTemplate
{

    private static final String COMPOSITE_NON_EXPLODE_JOINER = ",";
    static final Map COMPOSITE_PREFIXES = new HashMap();

    public UriTemplate()
    {
    }

    public static String expand(String s, Object obj, boolean flag)
    {
        Map map;
        StringBuilder stringbuilder;
        int i;
        int l;
        map = getMap(obj);
        stringbuilder = new StringBuilder();
        i = 0;
        l = s.length();
_L2:
        Object obj1;
        String s1;
        boolean flag1;
        int j;
label0:
        {
            if (i < l)
            {
                j = s.indexOf('{', i);
                if (j != -1)
                {
                    break label0;
                }
                if (i == 0 && !flag)
                {
                    return s;
                }
                stringbuilder.append(s.substring(i));
            }
            if (flag)
            {
                GenericUrl.addQueryParams(map.entrySet(), stringbuilder);
            }
            return stringbuilder.toString();
        }
        stringbuilder.append(s.substring(i, j));
        i = s.indexOf('}', j + 2);
        obj = s.substring(j + 1, i);
        i++;
        flag1 = ((String) (obj)).endsWith("*");
        obj1 = getCompositeOutput(((String) (obj)));
        int i1 = ((CompositeOutput) (obj1)).getVarNameStartIndex();
        int k = ((String) (obj)).length();
        j = k;
        if (flag1)
        {
            j = k - 1;
        }
        s1 = ((String) (obj)).substring(i1, j);
        obj = map.remove(s1);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Iterator))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = getListPropertyValue(s1, (Iterator)obj, flag1, ((CompositeOutput) (obj1)));
_L3:
        stringbuilder.append(obj);
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj instanceof Iterable) || obj.getClass().isArray())
        {
            obj = getListPropertyValue(s1, g.f(obj).iterator(), flag1, ((CompositeOutput) (obj1)));
        } else
        if (obj.getClass().isEnum())
        {
            obj1 = hsk.a((Enum)obj).b();
            if (obj1 != null)
            {
                obj = htg.c(((String) (obj1)));
            }
        } else
        if (!hsc.d(obj))
        {
            obj = getMapPropertyValue(s1, getMap(obj), flag1, ((CompositeOutput) (obj1)));
        } else
        if (((CompositeOutput) (obj1)).getReservedExpansion())
        {
            obj = htg.d(obj.toString());
        } else
        {
            obj = htg.c(obj.toString());
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static String expand(String s, String s1, Object obj, boolean flag)
    {
        if (!s1.startsWith("/")) goto _L2; else goto _L1
_L1:
        s = new GenericUrl(s);
        s.setRawPath(null);
        s = String.valueOf(s.build());
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
_L4:
        return expand(s, obj, flag);
_L2:
        String s2;
        s2 = s1;
        if (!s1.startsWith("http://"))
        {
            if (!s1.startsWith("https://"))
            {
                break; /* Loop/switch isn't completed */
            }
            s2 = s1;
        }
_L5:
        s = s2;
        if (true) goto _L4; else goto _L3
_L3:
        s = String.valueOf(s);
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s2 = s.concat(s1);
        } else
        {
            s2 = new String(s);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    static CompositeOutput getCompositeOutput(String s)
    {
        CompositeOutput compositeoutput = (CompositeOutput)COMPOSITE_PREFIXES.get(Character.valueOf(s.charAt(0)));
        s = compositeoutput;
        if (compositeoutput == null)
        {
            s = CompositeOutput.SIMPLE;
        }
        return s;
    }

    private static String getListPropertyValue(String s, Iterator iterator, boolean flag, CompositeOutput compositeoutput)
    {
        StringBuilder stringbuilder;
        if (!iterator.hasNext())
        {
            return "";
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(compositeoutput.getOutputPrefix());
        if (!flag) goto _L2; else goto _L1
_L1:
        String s1 = compositeoutput.getExplodeJoiner();
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && compositeoutput.requiresVarAssignment())
        {
            stringbuilder.append(htg.c(s));
            stringbuilder.append("=");
        }
        stringbuilder.append(compositeoutput.getEncodedValue(iterator.next().toString()));
        if (iterator.hasNext())
        {
            stringbuilder.append(s1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        String s2 = ",";
        s1 = s2;
        if (compositeoutput.requiresVarAssignment())
        {
            stringbuilder.append(htg.c(s));
            stringbuilder.append("=");
            s1 = s2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return stringbuilder.toString();
    }

    private static Map getMap(Object obj)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        obj = hsc.b(obj).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj1 = entry.getValue();
            if (obj1 != null && !hsc.a(obj1))
            {
                linkedhashmap.put(entry.getKey(), obj1);
            }
        } while (true);
        return linkedhashmap;
    }

    private static String getMapPropertyValue(String s, Map map, boolean flag, CompositeOutput compositeoutput)
    {
        if (map.isEmpty())
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(compositeoutput.getOutputPrefix());
        String s1;
        if (flag)
        {
            s1 = compositeoutput.getExplodeJoiner();
            s = "=";
        } else
        {
            if (compositeoutput.requiresVarAssignment())
            {
                stringbuilder.append(htg.c(s));
                stringbuilder.append("=");
            }
            s = ",";
            s1 = ",";
        }
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)map.next();
            String s2 = compositeoutput.getEncodedValue((String)((java.util.Map.Entry) (obj)).getKey());
            obj = compositeoutput.getEncodedValue(((java.util.Map.Entry) (obj)).getValue().toString());
            stringbuilder.append(s2);
            stringbuilder.append(s);
            stringbuilder.append(((String) (obj)));
            if (map.hasNext())
            {
                stringbuilder.append(s1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    static 
    {
        CompositeOutput.values();
    }

    private class CompositeOutput extends Enum
    {

        private static final CompositeOutput $VALUES[];
        public static final CompositeOutput AMP;
        public static final CompositeOutput DOT;
        public static final CompositeOutput FORWARD_SLASH;
        public static final CompositeOutput HASH;
        public static final CompositeOutput PLUS;
        public static final CompositeOutput QUERY;
        public static final CompositeOutput SEMI_COLON;
        public static final CompositeOutput SIMPLE;
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        public static CompositeOutput valueOf(String s)
        {
            return (CompositeOutput)Enum.valueOf(com/google/api/client/http/UriTemplate$CompositeOutput, s);
        }

        public static CompositeOutput[] values()
        {
            return (CompositeOutput[])$VALUES.clone();
        }

        String getEncodedValue(String s)
        {
            if (reservedExpansion)
            {
                return htg.c(s);
            } else
            {
                return htg.a(s);
            }
        }

        String getExplodeJoiner()
        {
            return explodeJoiner;
        }

        String getOutputPrefix()
        {
            return outputPrefix;
        }

        boolean getReservedExpansion()
        {
            return reservedExpansion;
        }

        int getVarNameStartIndex()
        {
            return propertyPrefix != null ? 1 : 0;
        }

        boolean requiresVarAssignment()
        {
            return requiresVarAssignment;
        }

        static 
        {
            PLUS = new CompositeOutput("PLUS", 0, Character.valueOf('+'), "", ",", false, true);
            HASH = new CompositeOutput("HASH", 1, Character.valueOf('#'), "#", ",", false, true);
            DOT = new CompositeOutput("DOT", 2, Character.valueOf('.'), ".", ".", false, false);
            FORWARD_SLASH = new CompositeOutput("FORWARD_SLASH", 3, Character.valueOf('/'), "/", "/", false, false);
            SEMI_COLON = new CompositeOutput("SEMI_COLON", 4, Character.valueOf(';'), ";", ";", true, false);
            QUERY = new CompositeOutput("QUERY", 5, Character.valueOf('?'), "?", "&", true, false);
            AMP = new CompositeOutput("AMP", 6, Character.valueOf('&'), "&", "&", true, false);
            SIMPLE = new CompositeOutput("SIMPLE", 7, null, "", ",", false, false);
            $VALUES = (new CompositeOutput[] {
                PLUS, HASH, DOT, FORWARD_SLASH, SEMI_COLON, QUERY, AMP, SIMPLE
            });
        }

        private CompositeOutput(String s, int i, Character character, String s1, String s2, boolean flag, boolean flag1)
        {
            super(s, i);
            propertyPrefix = character;
            outputPrefix = (String)h.a(s1);
            explodeJoiner = (String)h.a(s2);
            requiresVarAssignment = flag;
            reservedExpansion = flag1;
            if (character != null)
            {
                UriTemplate.COMPOSITE_PREFIXES.put(character, this);
            }
        }
    }

}
