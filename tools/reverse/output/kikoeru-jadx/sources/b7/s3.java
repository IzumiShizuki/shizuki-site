package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c7.q f2068a = new c7.q(null);

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static boolean d(h4 h4Var, h4 h4Var2) {
        m4.x0 x0Var = h4Var.f1831a;
        int i10 = x0Var.f14632b;
        m4.x0 x0Var2 = h4Var2.f1831a;
        return i10 == x0Var2.f14632b && x0Var.f14635e == x0Var2.f14635e && x0Var.f14638h == x0Var2.f14638h && x0Var.f14639i == x0Var2.f14639i;
    }

    public static int e(long j10, long j11) {
        if (j10 == -9223372036854775807L || j11 == -9223372036854775807L) {
            return 0;
        }
        if (j11 == 0) {
            return 100;
        }
        return p4.c0.i((int) ((j10 * 100) / j11), 0, 100);
    }

    public static long f(v3 v3Var, long j10, long j11, long j12) {
        h4 h4Var = v3Var.f2136c;
        h4 h4Var2 = v3Var.f2136c;
        boolean z10 = h4Var.equals(h4.f1820l) || j11 < h4Var2.f1833c;
        if (v3Var.f2155v) {
            if (z10 || j10 == -9223372036854775807L) {
                if (j12 == -9223372036854775807L) {
                    j12 = SystemClock.elapsedRealtime() - h4Var2.f1833c;
                }
                long j13 = h4Var2.f1831a.f14636f + ((long) (j12 * v3Var.f2140g.f14581a));
                long j14 = h4Var2.f1834d;
                return j14 != -9223372036854775807L ? Math.min(j13, j14) : j13;
            }
        } else if (z10 || j10 == -9223372036854775807L) {
            return h4Var2.f1831a.f14636f;
        }
        return j10;
    }

    public static m4.u0 g(m4.u0 u0Var, m4.u0 u0Var2) {
        if (u0Var != null) {
            m4.o oVar = u0Var.f14593a;
            if (u0Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < oVar.f14437a.size(); i10++) {
                    if (u0Var2.a(oVar.b(i10))) {
                        int iB = oVar.b(i10);
                        p4.c.i(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                p4.c.i(!false);
                return new m4.u0(new m4.o(sparseBooleanArray));
            }
        }
        return m4.u0.f14591b;
    }

    public static Pair h(v3 v3Var, t3 t3Var, v3 v3Var2, t3 t3Var2, m4.u0 u0Var) {
        boolean z10 = t3Var2.f2105a;
        boolean z11 = t3Var2.f2106b;
        if (z10 && u0Var.a(17) && !t3Var.f2105a) {
            v3Var2 = v3Var2.f(v3Var.f2143j);
            t3Var2 = new t3(false, z11);
        }
        if (z11 && u0Var.a(30) && !t3Var.f2106b) {
            v3Var2 = v3Var2.a(v3Var.D);
            t3Var2 = new t3(t3Var2.f2105a, false);
        }
        return new Pair(v3Var2, t3Var2);
    }

    public static void i(m4.y0 y0Var, u1 u1Var) {
        int i10 = u1Var.f2109b;
        long j10 = u1Var.f2110c;
        ya.i0 i0Var = u1Var.f2108a;
        if (i10 == -1) {
            if (y0Var.B0(20)) {
                y0Var.A0(i0Var);
                return;
            } else {
                if (i0Var.isEmpty()) {
                    return;
                }
                y0Var.z((m4.i0) i0Var.get(0));
                return;
            }
        }
        if (y0Var.B0(20)) {
            y0Var.K(u1Var.f2109b, j10, i0Var);
        } else {
            if (i0Var.isEmpty()) {
                return;
            }
            y0Var.t((m4.i0) i0Var.get(0), j10);
        }
    }
}
