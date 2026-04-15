package k5;

import android.util.SparseArray;
import androidx.media3.exoplayer.offline.u;
import r5.b0;
import r5.h0;
import r5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0.a f11045j = new b0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5.n f11046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.q f11048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f11049d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f11051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f11053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m4.q[] f11054i;

    public e(r5.n nVar, int i10, m4.q qVar) {
        this.f11046a = nVar;
        this.f11047b = i10;
        this.f11048c = qVar;
    }

    @Override // r5.q
    public final void a(b0 b0Var) {
        this.f11053h = b0Var;
    }

    public final void b(u uVar, long j10, long j11) {
        this.f11051f = uVar;
        this.f11052g = j11;
        boolean z10 = this.f11050e;
        r5.n nVar = this.f11046a;
        if (!z10) {
            nVar.h(this);
            if (j10 != -9223372036854775807L) {
                nVar.i(0L, j10);
            }
            this.f11050e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        nVar.i(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f11049d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (uVar == null) {
                cVar.f11040e = cVar.f11038c;
            } else {
                cVar.f11041f = j11;
                h0 h0VarD1 = uVar.d1(cVar.f11036a);
                cVar.f11040e = h0VarD1;
                m4.q qVar = cVar.f11039d;
                if (qVar != null) {
                    h0VarD1.b(qVar);
                }
            }
            i10++;
        }
    }

    @Override // r5.q
    public final void n() {
        SparseArray sparseArray = this.f11049d;
        m4.q[] qVarArr = new m4.q[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            m4.q qVar = ((c) sparseArray.valueAt(i10)).f11039d;
            p4.c.j(qVar);
            qVarArr[i10] = qVar;
        }
        this.f11054i = qVarArr;
    }

    @Override // r5.q
    public final h0 u(int i10, int i11) {
        SparseArray sparseArray = this.f11049d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            p4.c.i(this.f11054i == null);
            cVar = new c(i10, i11, i11 == this.f11047b ? this.f11048c : null);
            u uVar = this.f11051f;
            long j10 = this.f11052g;
            if (uVar == null) {
                cVar.f11040e = cVar.f11038c;
            } else {
                cVar.f11041f = j10;
                h0 h0VarD1 = uVar.d1(i11);
                cVar.f11040e = h0VarD1;
                m4.q qVar = cVar.f11039d;
                if (qVar != null) {
                    h0VarD1.b(qVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
