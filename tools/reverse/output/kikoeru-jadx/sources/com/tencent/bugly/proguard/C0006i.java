package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class C0006i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f4987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4988b;

    public C0006i(StringBuilder sb, int i10) {
        this.f4987a = sb;
        this.f4988b = i10;
    }

    private void a(String str) {
        for (int i10 = 0; i10 < this.f4988b; i10++) {
            this.f4987a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f4987a;
            sb.append(str);
            sb.append(": ");
        }
    }

    public C0006i a(boolean z10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(z10 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    public C0006i a(byte b10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append((int) b10);
        sb.append('\n');
        return this;
    }

    public C0006i a(char c3, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(c3);
        sb.append('\n');
        return this;
    }

    public C0006i a(short s10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append((int) s10);
        sb.append('\n');
        return this;
    }

    public C0006i a(int i10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(i10);
        sb.append('\n');
        return this;
    }

    public C0006i a(long j10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(j10);
        sb.append('\n');
        return this;
    }

    public C0006i a(float f10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(f10);
        sb.append('\n');
        return this;
    }

    public C0006i a(double d10, String str) {
        a(str);
        StringBuilder sb = this.f4987a;
        sb.append(d10);
        sb.append('\n');
        return this;
    }

    public C0006i a(String str, String str2) {
        a(str2);
        if (str == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        StringBuilder sb2 = this.f4987a;
        sb2.append(str);
        sb2.append('\n');
        return this;
    }

    public C0006i a(byte[] bArr, String str) {
        a(str);
        if (bArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(bArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(bArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (byte b10 : bArr) {
            c0006i.a(b10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public C0006i a(short[] sArr, String str) {
        a(str);
        if (sArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(sArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(sArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (short s10 : sArr) {
            c0006i.a(s10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public C0006i a(int[] iArr, String str) {
        a(str);
        if (iArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(iArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(iArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (int i10 : iArr) {
            c0006i.a(i10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public C0006i a(long[] jArr, String str) {
        a(str);
        if (jArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(jArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(jArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (long j10 : jArr) {
            c0006i.a(j10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public C0006i a(float[] fArr, String str) {
        a(str);
        if (fArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(fArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(fArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (float f10 : fArr) {
            c0006i.a(f10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public C0006i a(double[] dArr, String str) {
        a(str);
        if (dArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(dArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(dArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (double d10 : dArr) {
            c0006i.a(d10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    public <K, V> C0006i a(Map<K, V> map, String str) {
        a(str);
        if (map == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(map.size());
            sb2.append(", {}");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(map.size());
        sb3.append(", {");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        C0006i c0006i2 = new C0006i(this.f4987a, this.f4988b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c0006i.a('(', (String) null);
            c0006i2.a(entry.getKey(), (String) null);
            c0006i2.a(entry.getValue(), (String) null);
            c0006i.a(')', (String) null);
        }
        a('}', (String) null);
        return this;
    }

    public <T> C0006i a(T[] tArr, String str) {
        a(str);
        if (tArr == null) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb2 = this.f4987a;
            sb2.append(tArr.length);
            sb2.append(", []");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f4987a;
        sb3.append(tArr.length);
        sb3.append(", [");
        sb3.append('\n');
        C0006i c0006i = new C0006i(this.f4987a, this.f4988b + 1);
        for (T t10 : tArr) {
            c0006i.a(t10, (String) null);
        }
        a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> C0006i a(Collection<T> collection, String str) {
        if (collection == null) {
            a(str);
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\t');
            return this;
        }
        return a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> C0006i a(T t10, String str) {
        if (t10 == 0) {
            StringBuilder sb = this.f4987a;
            sb.append("null");
            sb.append('\n');
            return this;
        }
        if (t10 instanceof Byte) {
            a(((Byte) t10).byteValue(), str);
            return this;
        }
        if (t10 instanceof Boolean) {
            a(((Boolean) t10).booleanValue(), str);
            return this;
        }
        if (t10 instanceof Short) {
            a(((Short) t10).shortValue(), str);
            return this;
        }
        if (t10 instanceof Integer) {
            a(((Integer) t10).intValue(), str);
            return this;
        }
        if (t10 instanceof Long) {
            a(((Long) t10).longValue(), str);
            return this;
        }
        if (t10 instanceof Float) {
            a(((Float) t10).floatValue(), str);
            return this;
        }
        if (t10 instanceof Double) {
            a(((Double) t10).doubleValue(), str);
            return this;
        }
        if (t10 instanceof String) {
            a((String) t10, str);
            return this;
        }
        if (t10 instanceof Map) {
            a((Map) t10, str);
            return this;
        }
        if (t10 instanceof List) {
            a((Collection) t10, str);
            return this;
        }
        if (t10 instanceof AbstractC0010m) {
            a((AbstractC0010m) t10, str);
            return this;
        }
        if (t10 instanceof byte[]) {
            a((byte[]) t10, str);
            return this;
        }
        if (t10 instanceof boolean[]) {
            a((boolean[]) t10, str);
            return this;
        }
        if (t10 instanceof short[]) {
            a((short[]) t10, str);
            return this;
        }
        if (t10 instanceof int[]) {
            a((int[]) t10, str);
            return this;
        }
        if (t10 instanceof long[]) {
            a((long[]) t10, str);
            return this;
        }
        if (t10 instanceof float[]) {
            a((float[]) t10, str);
            return this;
        }
        if (t10 instanceof double[]) {
            a((double[]) t10, str);
            return this;
        }
        if (t10.getClass().isArray()) {
            a((Object[]) t10, str);
            return this;
        }
        throw new C0007j("write object error: unsupport type.");
    }

    public C0006i a(AbstractC0010m abstractC0010m, String str) {
        a('{', str);
        if (abstractC0010m == null) {
            StringBuilder sb = this.f4987a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC0010m.a(this.f4987a, this.f4988b + 1);
        }
        a('}', (String) null);
        return this;
    }
}
