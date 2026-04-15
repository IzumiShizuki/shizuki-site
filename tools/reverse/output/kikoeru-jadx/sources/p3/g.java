package p3;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.u0;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n7.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Class f16534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Constructor f16535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Method f16536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Method f16537r;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f16535p = constructor;
        f16534o = cls;
        f16536q = method2;
        f16537r = method;
    }

    @Override // n7.e
    public final Typeface i(Context context, s3.f[] fVarArr) {
        Object objNewInstance;
        Typeface typeface;
        boolean zBooleanValue;
        try {
            objNewInstance = f16535p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            u0 u0Var = new u0(0);
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    s3.f fVar = fVarArr[i10];
                    Uri uri = fVar.f19375a;
                    Object objX = (ByteBuffer) u0Var.get(uri);
                    if (objX == null) {
                        objX = x0.x(context, uri);
                        u0Var.put(uri, objX);
                    }
                    if (objX == null) {
                        break;
                    }
                    try {
                        zBooleanValue = ((Boolean) f16536q.invoke(objNewInstance, objX, Integer.valueOf(fVar.f19376b), null, Integer.valueOf(fVar.f19377c), Boolean.valueOf(fVar.f19378d))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        zBooleanValue = false;
                    }
                    if (!zBooleanValue) {
                        break;
                    }
                    i10++;
                } else {
                    try {
                        Object objNewInstance2 = Array.newInstance((Class<?>) f16534o, 1);
                        Array.set(objNewInstance2, 0, objNewInstance);
                        typeface = (Typeface) f16537r.invoke(null, objNewInstance2);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
