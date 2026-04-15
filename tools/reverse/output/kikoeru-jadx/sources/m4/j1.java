package m4;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14303g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q[] f14307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14308e;

    static {
        int i10 = p4.c0.f16548a;
        f14302f = Integer.toString(0, 36);
        f14303g = Integer.toString(1, 36);
    }

    public j1(String str, q... qVarArr) {
        p4.c.c(qVarArr.length > 0);
        this.f14305b = str;
        this.f14307d = qVarArr;
        this.f14304a = qVarArr.length;
        int i10 = o0.i(qVarArr[0].f14544n);
        this.f14306c = i10 == -1 ? o0.i(qVarArr[0].f14543m) : i10;
        String str2 = qVarArr[0].f14534d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i11 = qVarArr[0].f14536f | 16384;
        for (int i12 = 1; i12 < qVarArr.length; i12++) {
            String str3 = qVarArr[i12].f14534d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c(i12, "languages", qVarArr[0].f14534d, qVarArr[i12].f14534d);
                return;
            } else {
                if (i11 != (qVarArr[i12].f14536f | 16384)) {
                    c(i12, "role flags", Integer.toBinaryString(qVarArr[0].f14536f), Integer.toBinaryString(qVarArr[i12].f14536f));
                    return;
                }
            }
        }
    }

    public static j1 a(Bundle bundle) {
        ya.a1 a1VarP;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f14302f);
        if (parcelableArrayList == null) {
            ya.g0 g0Var = ya.i0.f25998b;
            a1VarP = ya.a1.f25946e;
        } else {
            a1VarP = p4.c.p(parcelableArrayList, new d1(1));
        }
        return new j1(bundle.getString(f14303g, ""), (q[]) a1VarP.toArray(new q[0]));
    }

    public static void c(int i10, String str, String str2, String str3) {
        p4.c.o("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final int b(q qVar) {
        int i10 = 0;
        while (true) {
            q[] qVarArr = this.f14307d;
            if (i10 >= qVarArr.length) {
                return -1;
            }
            if (qVar == qVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        q[] qVarArr = this.f14307d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qVarArr.length);
        for (q qVar : qVarArr) {
            List list = qVar.f14547q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(q.P, qVar.f14531a);
            bundle2.putString(q.Q, qVar.f14532b);
            String str = q.f14528u0;
            ya.i0<u> i0Var = qVar.f14533c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            for (u uVar : i0Var) {
                uVar.getClass();
                Bundle bundle3 = new Bundle();
                String str2 = uVar.f14589a;
                if (str2 != null) {
                    bundle3.putString(u.f14587c, str2);
                }
                bundle3.putString(u.f14588d, uVar.f14590b);
                arrayList2.add(bundle3);
            }
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(q.R, qVar.f14534d);
            bundle2.putInt(q.S, qVar.f14535e);
            bundle2.putInt(q.T, qVar.f14536f);
            int i10 = qVar.f14537g;
            if (i10 != q.O.f14537g) {
                bundle2.putInt(q.f14529v0, i10);
            }
            bundle2.putInt(q.U, qVar.f14538h);
            bundle2.putInt(q.V, qVar.f14539i);
            bundle2.putString(q.W, qVar.f14541k);
            bundle2.putString(q.X, qVar.f14543m);
            bundle2.putString(q.Y, qVar.f14544n);
            bundle2.putInt(q.Z, qVar.f14545o);
            for (int i11 = 0; i11 < list.size(); i11++) {
                bundle2.putByteArray(q.f14513a0 + "_" + Integer.toString(i11, 36), (byte[]) list.get(i11));
            }
            bundle2.putParcelable(q.f14514b0, qVar.f14548r);
            bundle2.putLong(q.f14515c0, qVar.f14549s);
            bundle2.putInt(q.f14516d0, qVar.f14551u);
            bundle2.putInt(q.f14517e0, qVar.f14552v);
            bundle2.putFloat(q.f14518f0, qVar.f14553w);
            bundle2.putInt(q.f14519g0, qVar.f14554x);
            bundle2.putFloat(q.f14520h0, qVar.f14555y);
            bundle2.putByteArray(q.f14521i0, qVar.f14556z);
            bundle2.putInt(q.f14522j0, qVar.A);
            h hVar = qVar.B;
            if (hVar != null) {
                String str3 = q.f14523k0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(h.f14225i, hVar.f14231a);
                bundle4.putInt(h.f14226j, hVar.f14232b);
                bundle4.putInt(h.f14227k, hVar.f14233c);
                bundle4.putByteArray(h.f14228l, hVar.f14234d);
                bundle4.putInt(h.f14229m, hVar.f14235e);
                bundle4.putInt(h.f14230n, hVar.f14236f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(q.f14530w0, qVar.C);
            bundle2.putInt(q.f14524l0, qVar.D);
            bundle2.putInt(q.f14525m0, qVar.E);
            bundle2.putInt(q.n0, qVar.F);
            bundle2.putInt(q.o0, qVar.G);
            bundle2.putInt(q.p0, qVar.H);
            bundle2.putInt(q.q0, qVar.I);
            bundle2.putInt(q.f14526s0, qVar.K);
            bundle2.putInt(q.f14527t0, qVar.L);
            bundle2.putInt(q.r0, qVar.M);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f14302f, arrayList);
        bundle.putString(f14303g, this.f14305b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f14305b.equals(j1Var.f14305b) && Arrays.equals(this.f14307d, j1Var.f14307d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14308e == 0) {
            this.f14308e = Arrays.hashCode(this.f14307d) + j2.h0.e(527, 31, this.f14305b);
        }
        return this.f14308e;
    }
}
