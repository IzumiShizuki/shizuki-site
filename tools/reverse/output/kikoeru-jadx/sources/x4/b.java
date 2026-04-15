package x4;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;
import p4.c0;
import r.y1;
import ya.a1;
import ya.f0;
import ya.i0;
import ya.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f24582c = new b(i0.u(a.f24577d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f24583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f24584e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f24585a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24586b;

    static {
        Object[] objArr = {2, 5, 6};
        ya.q.c(3, objArr);
        f24583d = i0.o(3, objArr);
        ah.j jVar = new ah.j(4);
        jVar.G(5, 6);
        jVar.G(17, 6);
        jVar.G(7, 6);
        jVar.G(30, 10);
        jVar.G(18, 6);
        jVar.G(6, 8);
        jVar.G(8, 8);
        jVar.G(14, 8);
        f24584e = jVar.c();
    }

    public b(a1 a1Var) {
        for (int i10 = 0; i10 < a1Var.f25948d; i10++) {
            a aVar = (a) a1Var.get(i10);
            this.f24585a.put(aVar.f24578a, aVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f24585a.size(); i11++) {
            iMax = Math.max(iMax, ((a) this.f24585a.valueAt(i11)).f24579b);
        }
        this.f24586b = iMax;
    }

    public static a1 a(int[] iArr, int i10) {
        f0 f0VarP = i0.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            f0VarP.a(new a(i11, i10));
        }
        return f0VarP.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x4.b b(android.content.Context r19, android.content.Intent r20, m4.d r21, r.y1 r22) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.b.b(android.content.Context, android.content.Intent, m4.d, r.y1):x4.b");
    }

    public static b c(Context context, m4.d dVar, y1 y1Var) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, y1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(m4.d r17, m4.q r18) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.b.d(m4.d, m4.q):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                SparseArray sparseArray = bVar.f24585a;
                int i10 = c0.f16548a;
                SparseArray sparseArray2 = this.f24585a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (c0.f16548a >= 31) {
                            zContentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i11 = 0; i11 < size; i11++) {
                                    if (Objects.equals(sparseArray2.valueAt(i11), sparseArray.get(sparseArray2.keyAt(i11)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.f24586b != bVar.f24586b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = c0.f16548a;
        SparseArray sparseArray = this.f24585a;
        if (i10 >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.f24586b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f24586b + ", audioProfiles=" + this.f24585a + "]";
    }
}
