package com.tencent.bugly.proguard;

import a0.c;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.t0;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class C0008k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f4990b = "GBK";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k$a */
    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f4991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4992b;
    }

    public C0008k() {
    }

    private void b() {
        a(c.E(this).f4991a);
    }

    public void a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f4989a;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f4989a = ByteBuffer.wrap(bArr);
    }

    public C0008k(byte[] bArr) {
        this.f4989a = ByteBuffer.wrap(bArr);
    }

    public static int a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f4991a = (byte) (b10 & 15);
        int i10 = (b10 & 240) >> 4;
        aVar.f4992b = i10;
        if (i10 != 15) {
            return 1;
        }
        aVar.f4992b = byteBuffer.get();
        return 2;
    }

    public C0008k(byte[] bArr, int i10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f4989a = byteBufferWrap;
        byteBufferWrap.position(i10);
    }

    private int b(a aVar) {
        return a(aVar, this.f4989a.duplicate());
    }

    private void b(int i10) {
        ByteBuffer byteBuffer = this.f4989a;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t10.getClass(), iA));
                for (int i11 = 0; i11 < iA; i11++) {
                    tArr[i11] = a((Object) t10, 0, true);
                }
                return tArr;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public void a(a aVar) {
        a(aVar, this.f4989a);
    }

    public boolean a(int i10) {
        int i11;
        try {
            a aVar = new a();
            while (true) {
                int iB = b(aVar);
                i11 = aVar.f4992b;
                if (i10 <= i11 || aVar.f4991a == 11) {
                    break;
                }
                b(iB);
                a(aVar.f4991a);
            }
        } catch (C0005h | BufferUnderflowException unused) {
        }
        return i10 == i11;
    }

    public void a() {
        a aVar = new a();
        do {
            a(aVar);
            a(aVar.f4991a);
        } while (aVar.f4991a != 11);
    }

    private void a(byte b10) {
        int i10 = 0;
        switch (b10) {
            case 0:
                b(1);
                return;
            case 1:
                b(2);
                return;
            case 2:
                b(4);
                return;
            case 3:
                b(8);
                return;
            case 4:
                b(4);
                return;
            case 5:
                b(8);
                return;
            case 6:
                int i11 = this.f4989a.get();
                if (i11 < 0) {
                    i11 += 256;
                }
                b(i11);
                return;
            case 7:
                b(this.f4989a.getInt());
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                int iA = a(0, 0, true);
                while (i10 < iA * 2) {
                    b();
                    i10++;
                }
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                int iA2 = a(0, 0, true);
                while (i10 < iA2) {
                    b();
                    i10++;
                }
                return;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVarE = c.E(this);
                if (aVarE.f4991a == 0) {
                    b(a(0, 0, true));
                    return;
                } else {
                    StringBuilder sbO = h0.o(b10, "skipField with invalid type, type value: ", ", ");
                    sbO.append((int) aVarE.f4991a);
                    throw new C0005h(sbO.toString());
                }
            default:
                throw new C0005h("invalid type.");
        }
    }

    public boolean a(boolean z10, int i10, boolean z11) {
        return a((byte) 0, i10, z11) != 0;
    }

    public byte a(byte b10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return b10;
        }
        byte b11 = c.E(this).f4991a;
        if (b11 == 0) {
            return this.f4989a.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new C0005h("type mismatch.");
    }

    public short a(short s10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return s10;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 0) {
            return this.f4989a.get();
        }
        if (b10 == 1) {
            return this.f4989a.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new C0005h("type mismatch.");
    }

    public int a(int i10, int i11, boolean z10) {
        if (!a(i11)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return i10;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 0) {
            return this.f4989a.get();
        }
        if (b10 == 1) {
            return this.f4989a.getShort();
        }
        if (b10 == 2) {
            return this.f4989a.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new C0005h("type mismatch.");
    }

    public long a(long j10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return j10;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 12) {
            return 0L;
        }
        if (b10 == 0) {
            return this.f4989a.get();
        }
        if (b10 == 1) {
            return this.f4989a.getShort();
        }
        if (b10 == 2) {
            return this.f4989a.getInt();
        }
        if (b10 == 3) {
            return this.f4989a.getLong();
        }
        throw new C0005h("type mismatch.");
    }

    public float a(float f10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return f10;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 4) {
            return this.f4989a.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new C0005h("type mismatch.");
    }

    public double a(double d10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return d10;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 4) {
            return this.f4989a.getFloat();
        }
        if (b10 == 5) {
            return this.f4989a.getDouble();
        }
        if (b10 == 12) {
            return 0.0d;
        }
        throw new C0005h("type mismatch.");
    }

    public String a(int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        byte b10 = c.E(this).f4991a;
        if (b10 == 6) {
            int i11 = this.f4989a.get();
            if (i11 < 0) {
                i11 += 256;
            }
            byte[] bArr = new byte[i11];
            this.f4989a.get(bArr);
            try {
                return new String(bArr, this.f4990b);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 == 7) {
            int i12 = this.f4989a.getInt();
            if (i12 <= 104857600 && i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                this.f4989a.get(bArr2);
                try {
                    return new String(bArr2, this.f4990b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C0005h(t0.B(i12, "String too long: "));
        }
        throw new C0005h("type mismatch.");
    }

    public <K, V> HashMap<K, V> a(Map<K, V> map, int i10, boolean z10) {
        return (HashMap) a(new HashMap(), map, i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i10, boolean z10) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (a(i10)) {
                if (c.E(this).f4991a == 8) {
                    int iA = a(0, 0, true);
                    if (iA < 0) {
                        throw new C0005h(t0.B(iA, "size invalid: "));
                    }
                    for (int i11 = 0; i11 < iA; i11++) {
                        map.put(a(key, 0, true), a(value, 1, true));
                    }
                } else {
                    throw new C0005h("type mismatch.");
                }
            } else if (z10) {
                throw new C0005h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    public boolean[] a(boolean[] zArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                boolean[] zArr2 = new boolean[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    zArr2[i11] = a(zArr2[0], 0, true);
                }
                return zArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public byte[] a(byte[] bArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        a aVarE = c.E(this);
        byte b10 = aVarE.f4991a;
        if (b10 == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                byte[] bArr2 = new byte[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    bArr2[i11] = a(bArr2[0], 0, true);
                }
                return bArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        if (b10 == 13) {
            a aVarE2 = c.E(this);
            if (aVarE2.f4991a == 0) {
                int iA2 = a(0, 0, true);
                if (iA2 >= 0) {
                    byte[] bArr3 = new byte[iA2];
                    this.f4989a.get(bArr3);
                    return bArr3;
                }
                StringBuilder sbO = h0.o(i10, "invalid size, tag: ", ", type: ");
                sbO.append((int) aVarE.f4991a);
                sbO.append(", ");
                sbO.append((int) aVarE2.f4991a);
                sbO.append(", size: ");
                sbO.append(iA2);
                throw new C0005h(sbO.toString());
            }
            StringBuilder sbO2 = h0.o(i10, "type mismatch, tag: ", ", type: ");
            sbO2.append((int) aVarE.f4991a);
            sbO2.append(", ");
            sbO2.append((int) aVarE2.f4991a);
            throw new C0005h(sbO2.toString());
        }
        throw new C0005h("type mismatch.");
    }

    public short[] a(short[] sArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                short[] sArr2 = new short[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    sArr2[i11] = a(sArr2[0], 0, true);
                }
                return sArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public int[] a(int[] iArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                int[] iArr2 = new int[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    iArr2[i11] = a(iArr2[0], 0, true);
                }
                return iArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public long[] a(long[] jArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                long[] jArr2 = new long[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    jArr2[i11] = a(jArr2[0], 0, true);
                }
                return jArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public float[] a(float[] fArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                float[] fArr2 = new float[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    fArr2[i11] = a(fArr2[0], 0, true);
                }
                return fArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public double[] a(double[] dArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        if (c.E(this).f4991a == 9) {
            int iA = a(0, 0, true);
            if (iA >= 0) {
                double[] dArr2 = new double[iA];
                for (int i11 = 0; i11 < iA; i11++) {
                    dArr2[i11] = a(dArr2[0], 0, true);
                }
                return dArr2;
            }
            throw new C0005h(t0.B(iA, "size invalid: "));
        }
        throw new C0005h("type mismatch.");
    }

    public <T> T[] a(T[] tArr, int i10, boolean z10) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) b(tArr[0], i10, z10);
        }
        throw new C0005h("unable to get type of key and value.");
    }

    public <T> List<T> a(List<T> list, int i10, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrB = b(list.get(0), i10, z10);
            if (objArrB == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrB) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public AbstractC0010m a(AbstractC0010m abstractC0010m, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new C0005h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC0010m abstractC0010m2 = (AbstractC0010m) abstractC0010m.getClass().newInstance();
            if (c.E(this).f4991a == 10) {
                abstractC0010m2.a(this);
                a();
                return abstractC0010m2;
            }
            throw new C0005h("type mismatch.");
        } catch (Exception e10) {
            throw new C0005h(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> Object a(T t10, int i10, boolean z10) {
        if (t10 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i10, z10));
        }
        if (t10 instanceof Boolean) {
            return Boolean.valueOf(a(false, i10, z10));
        }
        if (t10 instanceof Short) {
            return Short.valueOf(a((short) 0, i10, z10));
        }
        if (t10 instanceof Integer) {
            return Integer.valueOf(a(0, i10, z10));
        }
        if (t10 instanceof Long) {
            return Long.valueOf(a(0L, i10, z10));
        }
        if (t10 instanceof Float) {
            return Float.valueOf(a(0.0f, i10, z10));
        }
        if (t10 instanceof Double) {
            return Double.valueOf(a(0.0d, i10, z10));
        }
        if (t10 instanceof String) {
            return String.valueOf(a(i10, z10));
        }
        if (t10 instanceof Map) {
            return a((Map) t10, i10, z10);
        }
        if (t10 instanceof List) {
            return a((List) t10, i10, z10);
        }
        if (t10 instanceof AbstractC0010m) {
            return a((AbstractC0010m) t10, i10, z10);
        }
        if (t10.getClass().isArray()) {
            if (!(t10 instanceof byte[]) && !(t10 instanceof Byte[])) {
                if (t10 instanceof boolean[]) {
                    return a((boolean[]) null, i10, z10);
                }
                if (t10 instanceof short[]) {
                    return a((short[]) null, i10, z10);
                }
                if (t10 instanceof int[]) {
                    return a((int[]) null, i10, z10);
                }
                if (t10 instanceof long[]) {
                    return a((long[]) null, i10, z10);
                }
                if (t10 instanceof float[]) {
                    return a((float[]) null, i10, z10);
                }
                if (t10 instanceof double[]) {
                    return a((double[]) null, i10, z10);
                }
                return a((Object[]) t10, i10, z10);
            }
            return a((byte[]) null, i10, z10);
        }
        throw new C0005h("read object error: unsupport type.");
    }

    public int a(String str) {
        this.f4990b = str;
        return 0;
    }
}
