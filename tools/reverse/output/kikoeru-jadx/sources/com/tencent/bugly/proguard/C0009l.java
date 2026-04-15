package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.t0;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class C0009l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f4998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f4999b;

    public C0009l(int i10) {
        this.f4999b = "GBK";
        this.f4998a = ByteBuffer.allocate(i10);
    }

    public ByteBuffer a() {
        return this.f4998a;
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f4998a.position()];
        System.arraycopy(this.f4998a.array(), 0, bArr, 0, this.f4998a.position());
        return bArr;
    }

    public void a(int i10) {
        if (this.f4998a.remaining() < i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f4998a.capacity() + i10) * 2);
            byteBufferAllocate.put(this.f4998a.array(), 0, this.f4998a.position());
            this.f4998a = byteBufferAllocate;
        }
    }

    public void b(byte b10, int i10) {
        if (i10 < 15) {
            this.f4998a.put((byte) (b10 | (i10 << 4)));
        } else {
            if (i10 < 256) {
                this.f4998a.put((byte) (b10 | 240));
                this.f4998a.put((byte) i10);
                return;
            }
            throw new C0007j(t0.B(i10, "tag is too large: "));
        }
    }

    public C0009l() {
        this(128);
    }

    public void a(boolean z10, int i10) {
        a(z10 ? (byte) 1 : (byte) 0, i10);
    }

    public void a(byte b10, int i10) {
        a(3);
        if (b10 == 0) {
            b((byte) 12, i10);
        } else {
            b((byte) 0, i10);
            this.f4998a.put(b10);
        }
    }

    public void a(short s10, int i10) {
        a(4);
        if (s10 >= -128 && s10 <= 127) {
            a((byte) s10, i10);
        } else {
            b((byte) 1, i10);
            this.f4998a.putShort(s10);
        }
    }

    public void a(int i10, int i11) {
        a(6);
        if (i10 >= -32768 && i10 <= 32767) {
            a((short) i10, i11);
        } else {
            b((byte) 2, i11);
            this.f4998a.putInt(i10);
        }
    }

    public void a(long j10, int i10) {
        a(10);
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            a((int) j10, i10);
        } else {
            b((byte) 3, i10);
            this.f4998a.putLong(j10);
        }
    }

    public void a(float f10, int i10) {
        a(6);
        b((byte) 4, i10);
        this.f4998a.putFloat(f10);
    }

    public void a(double d10, int i10) {
        a(10);
        b((byte) 5, i10);
        this.f4998a.putDouble(d10);
    }

    public void a(String str, int i10) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f4999b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i10);
            this.f4998a.putInt(bytes.length);
            this.f4998a.put(bytes);
        } else {
            b((byte) 6, i10);
            this.f4998a.put((byte) bytes.length);
            this.f4998a.put(bytes);
        }
    }

    public <K, V> void a(Map<K, V> map, int i10) {
        a(8);
        b((byte) 8, i10);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public void a(boolean[] zArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(zArr.length, 0);
        for (boolean z10 : zArr) {
            a(z10, 0);
        }
    }

    public void a(byte[] bArr, int i10) {
        a(bArr.length + 8);
        b((byte) 13, i10);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f4998a.put(bArr);
    }

    public void a(short[] sArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(sArr.length, 0);
        for (short s10 : sArr) {
            a(s10, 0);
        }
    }

    public void a(int[] iArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(iArr.length, 0);
        for (int i11 : iArr) {
            a(i11, 0);
        }
    }

    public void a(long[] jArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(jArr.length, 0);
        for (long j10 : jArr) {
            a(j10, 0);
        }
    }

    public void a(float[] fArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(fArr.length, 0);
        for (float f10 : fArr) {
            a(f10, 0);
        }
    }

    public void a(double[] dArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(dArr.length, 0);
        for (double d10 : dArr) {
            a(d10, 0);
        }
    }

    private void a(Object[] objArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    public <T> void a(Collection<T> collection, int i10) {
        a(8);
        b((byte) 9, i10);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public void a(AbstractC0010m abstractC0010m, int i10) {
        a(2);
        b((byte) 10, i10);
        abstractC0010m.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public void a(Object obj, int i10) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i10);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i10);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i10);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i10);
            return;
        }
        if (obj instanceof Long) {
            a(((Long) obj).longValue(), i10);
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i10);
            return;
        }
        if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i10);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i10);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i10);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i10);
            return;
        }
        if (obj instanceof AbstractC0010m) {
            a((AbstractC0010m) obj, i10);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i10);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i10);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i10);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i10);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i10);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i10);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i10);
            return;
        }
        if (obj.getClass().isArray()) {
            a((Object[]) obj, i10);
        } else if (obj instanceof Collection) {
            a((Collection) obj, i10);
        } else {
            throw new C0007j("write object error: unsupport type. " + obj.getClass());
        }
    }

    public int a(String str) {
        this.f4999b = str;
        return 0;
    }
}
