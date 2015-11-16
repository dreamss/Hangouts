// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.ECParameterSpec;
import lmo;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, AndroidPrivateKey

public class DefaultAndroidKeyStore
    implements AndroidKeyStore
{

    public DefaultAndroidKeyStore()
    {
    }

    private static Object a(AndroidPrivateKey androidprivatekey)
    {
        Object obj;
        obj = ((lmo)androidprivatekey).a();
        if (obj == null)
        {
            Log.e("AndroidKeyStoreInProcessImpl", "key == null");
            return null;
        }
        if (!(obj instanceof RSAPrivateKey))
        {
            Log.e("AndroidKeyStoreInProcessImpl", "does not implement RSAPrivateKey");
            return null;
        }
        try
        {
            androidprivatekey = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Cannot find system OpenSSLRSAPrivateKey class: ")).append(androidprivatekey).toString());
            return null;
        }
        if (!androidprivatekey.isInstance(obj))
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Private key is not an OpenSSLRSAPrivateKey instance, its class name is:")).append(obj.getClass().getCanonicalName()).toString());
            return null;
        }
        try
        {
            androidprivatekey = androidprivatekey.getDeclaredMethod("getOpenSSLKey", new Class[0]);
            androidprivatekey.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Exception while trying to retrieve system EVP_PKEY handle: ")).append(androidprivatekey).toString());
            return null;
        }
        obj = androidprivatekey.invoke(obj, new Object[0]);
        androidprivatekey.setAccessible(false);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        Log.e("AndroidKeyStoreInProcessImpl", "getOpenSSLKey() returned null");
        return null;
        obj;
        androidprivatekey.setAccessible(false);
        throw obj;
        return obj;
    }

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((lmo)androidprivatekey).a();
        if (androidprivatekey instanceof ECKey)
        {
            return ((ECKey)androidprivatekey).getParams().getOrder().toByteArray();
        } else
        {
            return null;
        }
    }

    public Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        Class class1;
        Object obj;
        try
        {
            class1 = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Cannot find system OpenSSLEngine class: ")).append(androidprivatekey).toString());
            return null;
        }
        obj = a(androidprivatekey);
        if (obj == null)
        {
            return null;
        }
        androidprivatekey = obj.getClass().getDeclaredMethod("getEngine", new Class[0]);
        try
        {
            androidprivatekey.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Exception while trying to retrieve OpenSSLEngine object: ")).append(androidprivatekey).toString());
            return null;
        }
        obj = androidprivatekey.invoke(obj, new Object[0]);
        androidprivatekey.setAccessible(false);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Log.e("AndroidKeyStoreInProcessImpl", "getEngine() returned null");
        if (class1.isInstance(obj))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Engine is not an OpenSSLEngine instance, its class name is:")).append(obj.getClass().getCanonicalName()).toString());
        return null;
        androidprivatekey;
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("No getEngine() method on OpenSSLKey member:")).append(androidprivatekey).toString());
        return null;
        Exception exception;
        exception;
        androidprivatekey.setAccessible(false);
        throw exception;
        return obj;
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        Object obj = a(androidprivatekey);
        if (obj != null) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        return l;
_L2:
        androidprivatekey = obj.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
        long l1;
        try
        {
            androidprivatekey.setAccessible(true);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Exception while trying to retrieve system EVP_PKEY handle: ")).append(androidprivatekey).toString());
            return 0L;
        }
        l1 = ((Number)androidprivatekey.invoke(obj, new Object[0])).longValue();
        androidprivatekey.setAccessible(false);
        l = l1;
        if (l1 != 0L) goto _L4; else goto _L3
_L3:
        Log.e("AndroidKeyStoreInProcessImpl", "getPkeyContext() returned null");
        return l1;
        androidprivatekey;
        Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("No getPkeyContext() method on OpenSSLKey member:")).append(androidprivatekey).toString());
        return 0L;
        Exception exception;
        exception;
        androidprivatekey.setAccessible(false);
        throw exception;
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((lmo)androidprivatekey).a().getAlgorithm();
        if ("RSA".equalsIgnoreCase(androidprivatekey))
        {
            return 0;
        }
        return !"EC".equalsIgnoreCase(androidprivatekey) ? 255 : 2;
    }

    public byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = ((lmo)androidprivatekey).a();
        if (androidprivatekey instanceof RSAKey)
        {
            return ((RSAKey)androidprivatekey).getModulus().toByteArray();
        } else
        {
            return null;
        }
    }

    public byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[])
    {
        PrivateKey privatekey = ((lmo)androidprivatekey).a();
        androidprivatekey = privatekey.getAlgorithm();
        if (!"RSA".equalsIgnoreCase(androidprivatekey)) goto _L2; else goto _L1
_L1:
        androidprivatekey = Signature.getInstance("NONEwithRSA");
_L4:
        if (androidprivatekey == null)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Unsupported private key algorithm: ")).append(privatekey.getAlgorithm()).toString());
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            if ("EC".equalsIgnoreCase(androidprivatekey))
            {
                androidprivatekey = Signature.getInstance("NONEwithECDSA");
                continue; /* Loop/switch isn't completed */
            }
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey) { }
        androidprivatekey = null;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            androidprivatekey.initSign(privatekey);
            androidprivatekey.update(abyte0);
            androidprivatekey = androidprivatekey.sign();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            Log.e("AndroidKeyStoreInProcessImpl", (new StringBuilder("Exception while signing message with ")).append(privatekey.getAlgorithm()).append(" private key: ").append(androidprivatekey).toString());
            return null;
        }
        return androidprivatekey;
    }

    public void releaseKey(AndroidPrivateKey androidprivatekey)
    {
    }
}
