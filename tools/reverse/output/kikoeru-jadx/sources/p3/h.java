package p3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f16538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Constructor f16539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f16540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f16541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f16542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f16543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f16544u;

    public h() throws NoSuchMethodException {
        Method methodL;
        Constructor<?> constructor;
        Method methodK;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodK = K(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodL = L(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodL = null;
            constructor = null;
            methodK = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f16538o = cls;
        this.f16539p = constructor;
        this.f16540q = methodK;
        this.f16541r = method;
        this.f16542s = method2;
        this.f16543t = method3;
        this.f16544u = methodL;
    }

    public static Method K(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Typeface J(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f16538o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f16544u.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method L(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p3.f, n7.e
    public final Typeface i(Context context, s3.f[] fVarArr) throws IOException {
        Object objNewInstance;
        boolean zBooleanValue;
        Typeface typefaceJ;
        boolean zBooleanValue2;
        if (fVarArr.length >= 1) {
            Method method = this.f16540q;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (s3.f fVar : fVarArr) {
                        if (fVar.f19380f == 0) {
                            Uri uri = fVar.f19375a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, x0.x(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f16539p.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = fVarArr.length;
                        int i10 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f16543t;
                            if (i10 < length) {
                                s3.f fVar2 = fVarArr[i10];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(fVar2.f19375a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue2 = ((Boolean) this.f16541r.invoke(objNewInstance, byteBuffer, Integer.valueOf(fVar2.f19376b), null, Integer.valueOf(fVar2.f19377c), Integer.valueOf(fVar2.f19378d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue2 = false;
                                    }
                                    if (!zBooleanValue2) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i10++;
                            } else if (z10) {
                                try {
                                    zBooleanValue = ((Boolean) this.f16542s.invoke(objNewInstance, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue && (typefaceJ = J(objNewInstance)) != null) {
                                    return Typeface.create(typefaceJ, 0);
                                }
                            } else {
                                method2.invoke(objNewInstance, null);
                            }
                        }
                    }
                } else {
                    s3.f fVarM = m(fVarArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fVarM.f19375a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fVarM.f19377c).setItalic(fVarM.f19378d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }
}
