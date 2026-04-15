package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.a;
import tb.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f5172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap f5173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f5174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f5175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f5176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f5177f;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f5172a = enumMap;
        enumMap.put(b.f20607a, 0);
        enumMap.put(b.f20608b, 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f5173b = enumMap2;
        a aVar = a.f20601a;
        enumMap2.put(aVar, 0);
        a aVar2 = a.f20602b;
        enumMap2.put(aVar2, 1);
        a aVar3 = a.f20603c;
        enumMap2.put(aVar3, 2);
        a aVar4 = a.f20604d;
        enumMap2.put(aVar4, 3);
        a aVar5 = a.f20605e;
        enumMap2.put(aVar5, 4);
        f5174c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f5175d = new HashSet();
        f5176e = null;
        f5177f = true;
        new HashMap();
    }

    public MMKV(long j10) {
        this.nativeHandle = j10;
    }

    private native long actualSize(long j10);

    private native String[] allKeys(long j10, boolean z10);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j10);

    private native boolean containsKey(long j10, String str);

    private native long count(long j10, boolean z10);

    private static native long createNB(int i10);

    private native boolean decodeBool(long j10, String str, boolean z10);

    private native byte[] decodeBytes(long j10, String str);

    private native double decodeDouble(long j10, String str, double d10);

    private native float decodeFloat(long j10, String str, float f10);

    private native int decodeInt(long j10, String str, int i10);

    private native long decodeLong(long j10, String str, long j11);

    private native String decodeString(long j10, String str, String str2);

    private native String[] decodeStringSet(long j10, String str);

    private static native void destroyNB(long j10, int i10);

    private native boolean encodeBool(long j10, String str, boolean z10);

    private native boolean encodeBool_2(long j10, String str, boolean z10, int i10);

    private native boolean encodeBytes(long j10, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j10, String str, byte[] bArr, int i10);

    private native boolean encodeDouble(long j10, String str, double d10);

    private native boolean encodeDouble_2(long j10, String str, double d10, int i10);

    private native boolean encodeFloat(long j10, String str, float f10);

    private native boolean encodeFloat_2(long j10, String str, float f10, int i10);

    private native boolean encodeInt(long j10, String str, int i10);

    private native boolean encodeInt_2(long j10, String str, int i10, int i11);

    private native boolean encodeLong(long j10, String str, long j11);

    private native boolean encodeLong_2(long j10, String str, long j11, int i10);

    private native boolean encodeSet(long j10, String str, String[] strArr);

    private native boolean encodeSet_2(long j10, String str, String[] strArr, int i10);

    private native boolean encodeString(long j10, String str, String str2);

    private native boolean encodeString_2(long j10, String str, String str2, int i10);

    private static native long getDefaultMMKV(int i10, String str);

    private static native long getMMKVWithAshmemFD(String str, int i10, int i11, String str2);

    private static native long getMMKVWithID(String str, int i10, String str2, String str3, long j10);

    private static native long getMMKVWithIDAndSize(String str, int i10, int i11, String str2);

    public static MMKV h() {
        if (f5176e == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        long defaultMMKV = getDefaultMMKV(1, null);
        if (defaultMMKV == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [DefaultMMKV] in JNI");
        }
        if (!f5177f) {
            return new MMKV(defaultMMKV);
        }
        HashSet hashSet = f5175d;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(defaultMMKV))) {
                    if (!checkProcessMode(defaultMMKV)) {
                        throw new IllegalArgumentException("Opening a multi-process MMKV instance [DefaultMMKV] with SINGLE_PROCESS_MODE!");
                    }
                    hashSet.add(Long.valueOf(defaultMMKV));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new MMKV(defaultMMKV);
    }

    public static void i() {
        synchronized (f5175d) {
            f5177f = true;
        }
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i10, boolean z10);

    private static void mmkvLogImp(int i10, String str, int i11, String str2, String str3) {
        int iOrdinal = f5174c[i10].ordinal();
        if (iOrdinal == 0) {
            Log.d("MMKV", str3);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("MMKV", str3);
        } else if (iOrdinal == 2) {
            Log.w("MMKV", str3);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            Log.e("MMKV", str3);
        }
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        b bVar = b.f20607a;
        sb.append(bVar);
        s(sb.toString());
        Integer num = (Integer) f5172a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        StringBuilder sb = new StringBuilder("Recover strategic for ");
        sb.append(str);
        sb.append(" is ");
        b bVar = b.f20607a;
        sb.append(bVar);
        s(sb.toString());
        Integer num = (Integer) f5172a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void p(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + "/mmkv";
        if ((context.getApplicationInfo().flags & 2) == 0) {
            synchronized (f5175d) {
                f5177f = false;
            }
            Log.i("MMKV", "Disable checkProcessMode()");
        } else {
            i();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        System.loadLibrary("mmkv");
        jniInitialize(str, absolutePath, 1, false);
        f5176e = str;
    }

    public static native int pageSize();

    public static void r() {
        setLogLevel(4);
    }

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j10, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    public static void s(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = (Integer) f5173b.get(a.f20602b);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private static native void setCallbackHandler(boolean z10, boolean z11);

    private static native void setLogLevel(int i10);

    private static native void setWantsContentChangeNotify(boolean z10);

    private native void sync(boolean z10);

    private native long totalSize(long j10);

    private native int valueSize(long j10, String str, boolean z10);

    public static native String version();

    private native int writeValueToNB(long j10, String str, long j11, int i10);

    public final boolean a(String str) {
        return containsKey(this.nativeHandle, str);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public final boolean b(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    public final double c(String str) {
        return decodeDouble(this.nativeHandle, str, 0.0d);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public final float d(String str) {
        return decodeFloat(this.nativeHandle, str, 0.0f);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public final int e(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public native boolean enableAutoKeyExpire(int i10);

    public final long f(String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    public final String g(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        return decodeBool(this.nativeHandle, str, z10);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return decodeFloat(this.nativeHandle, str, f10);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return decodeInt(this.nativeHandle, str, i10);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return decodeLong(this.nativeHandle, str, j10);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public final void j(double d10, String str) {
        encodeDouble(this.nativeHandle, str, d10);
    }

    public final void k(int i10, String str) {
        encodeInt(this.nativeHandle, str, i10);
    }

    public final void l(long j10, String str) {
        encodeLong(this.nativeHandle, str, j10);
    }

    public native void lock();

    public final void m(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
    }

    public native String mmapID();

    public final void n(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
    }

    public final void o(String str, boolean z10) {
        encodeBool(this.nativeHandle, str, z10);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        encodeBool(this.nativeHandle, str, z10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        encodeInt(this.nativeHandle, str, i10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        encodeLong(this.nativeHandle, str, j10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    public final void q(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        q(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public final void t() {
        sync(true);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }
}
