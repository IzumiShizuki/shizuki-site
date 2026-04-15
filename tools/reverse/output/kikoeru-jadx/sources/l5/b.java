package l5;

import b7.c3;
import java.util.ArrayList;
import ya.a1;
import ya.f0;
import ya.g0;
import ya.i0;
import ya.p;
import ya.x0;
import ya.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f11711b = new z(new p(new c3(22), x0.f26071b), new p(new c3(23), x0.f26072c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11712a = new ArrayList();

    @Override // l5.a
    public final long a(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f11712a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((o6.a) arrayList.get(i10)).f16243b;
            long j12 = ((o6.a) arrayList.get(i10)).f16245d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // l5.a
    public final boolean b(o6.a aVar, long j10) {
        long j11 = aVar.f16243b;
        p4.c.c(j11 != -9223372036854775807L);
        p4.c.c(aVar.f16244c != -9223372036854775807L);
        boolean z10 = j11 <= j10 && j10 < aVar.f16245d;
        ArrayList arrayList = this.f11712a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((o6.a) arrayList.get(size)).f16243b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // l5.a
    public final i0 c(long j10) {
        ArrayList arrayList = this.f11712a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((o6.a) arrayList.get(0)).f16243b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o6.a aVar = (o6.a) arrayList.get(i10);
                    if (j10 >= aVar.f16243b && j10 < aVar.f16245d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f16243b) {
                        break;
                    }
                }
                a1 a1VarW = i0.w(f11711b, arrayList2);
                f0 f0VarP = i0.p();
                for (int i11 = 0; i11 < a1VarW.f25948d; i11++) {
                    f0VarP.c(((o6.a) a1VarW.get(i11)).f16242a);
                }
                return f0VarP.f();
            }
        }
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // l5.a
    public final void clear() {
        this.f11712a.clear();
    }

    @Override // l5.a
    public final long d(long j10) {
        ArrayList arrayList = this.f11712a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((o6.a) arrayList.get(0)).f16243b) {
            return -9223372036854775807L;
        }
        long jMax = ((o6.a) arrayList.get(0)).f16243b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((o6.a) arrayList.get(i10)).f16243b;
            long j12 = ((o6.a) arrayList.get(i10)).f16245d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // l5.a
    public final void e(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11712a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((o6.a) arrayList.get(i10)).f16243b;
            if (j10 > j11 && j10 > ((o6.a) arrayList.get(i10)).f16245d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
