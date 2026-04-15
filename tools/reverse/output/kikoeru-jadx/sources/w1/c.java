package w1;

import c7.e1;
import java.util.ArrayList;
import java.util.List;
import q.t0;
import q1.n0;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f23129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23130c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23131d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23132e = q1.q.f17575h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q1.h f23135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ic.k f23136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q.a0 f23137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f23138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f23139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f23142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f23143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23146s;

    public c() {
        int i10 = g0.f23208a;
        this.f23133f = vb.r.f22819a;
        this.f23134g = true;
        this.f23137j = new q.a0(16, this);
        this.f23138k = "";
        this.f23142o = 1.0f;
        this.f23143p = 1.0f;
        this.f23146s = true;
    }

    @Override // w1.c0
    public final void a(s1.d dVar) {
        if (this.f23146s) {
            float[] fArrA = this.f23129b;
            if (fArrA == null) {
                fArrA = q1.a0.a();
                this.f23129b = fArrA;
            } else {
                q1.a0.d(fArrA);
            }
            q1.a0.f(fArrA, this.f23144q + this.f23140m, this.f23145r + this.f23141n);
            float f10 = this.f23139l;
            if (fArrA.length >= 16) {
                double d10 = ((double) f10) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrA[1];
                float f17 = fArrA[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrA[2];
                float f21 = fArrA[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrA[3];
                float f25 = fArrA[7];
                float f26 = (fSin * f25) + (fCos * f24);
                fArrA[0] = f13;
                fArrA[1] = f18;
                fArrA[2] = f22;
                fArrA[3] = f26;
                fArrA[4] = f15;
                fArrA[5] = f19;
                fArrA[6] = f23;
                fArrA[7] = (fCos * f25) + (f14 * f24);
            }
            float f27 = this.f23142o;
            float f28 = this.f23143p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f27;
                fArrA[1] = fArrA[1] * f27;
                fArrA[2] = fArrA[2] * f27;
                fArrA[3] = fArrA[3] * f27;
                fArrA[4] = fArrA[4] * f28;
                fArrA[5] = fArrA[5] * f28;
                fArrA[6] = fArrA[6] * f28;
                fArrA[7] = fArrA[7] * f28;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            q1.a0.f(fArrA, -this.f23140m, -this.f23141n);
            this.f23146s = false;
        }
        if (this.f23134g) {
            if (!this.f23133f.isEmpty()) {
                q1.h hVarA = this.f23135h;
                if (hVarA == null) {
                    hVarA = q1.j.a();
                    this.f23135h = hVarA;
                }
                b.d(this.f23133f, hVarA);
            }
            this.f23134g = false;
        }
        e1 e1VarS = dVar.S();
        long jD = e1VarS.D();
        e1VarS.z().f();
        try {
            e1 e1Var = (e1) ((y1) e1VarS.f3618b).f18634b;
            float[] fArr = this.f23129b;
            if (fArr != null) {
                e1Var.z().k(fArr);
            }
            q1.h hVar = this.f23135h;
            if (!this.f23133f.isEmpty() && hVar != null) {
                e1Var.z().n(hVar);
            }
            ArrayList arrayList = this.f23130c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) arrayList.get(i10)).a(dVar);
            }
        } finally {
            t0.L(e1VarS, jD);
        }
    }

    @Override // w1.c0
    public final ic.k b() {
        return this.f23136i;
    }

    @Override // w1.c0
    public final void d(q.a0 a0Var) {
        this.f23136i = a0Var;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f23130c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f23137j);
        c();
    }

    public final void f(long j10) {
        if (this.f23131d && j10 != 16) {
            long j11 = this.f23132e;
            if (j11 == 16) {
                this.f23132e = j10;
                return;
            }
            int i10 = g0.f23208a;
            if (q1.q.h(j11) == q1.q.h(j10) && q1.q.g(j11) == q1.q.g(j10) && q1.q.e(j11) == q1.q.e(j10)) {
                return;
            }
            this.f23131d = false;
            this.f23132e = q1.q.f17575h;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f23131d && this.f23131d) {
                    f(cVar.f23132e);
                    return;
                } else {
                    this.f23131d = false;
                    this.f23132e = q1.q.f17575h;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        q1.m mVar = hVar.f23209b;
        if (this.f23131d && mVar != null) {
            if (mVar instanceof n0) {
                f(((n0) mVar).f17562a);
            } else {
                this.f23131d = false;
                this.f23132e = q1.q.f17575h;
            }
        }
        q1.m mVar2 = hVar.f23214g;
        if (this.f23131d && mVar2 != null) {
            if (mVar2 instanceof n0) {
                f(((n0) mVar2).f17562a);
            } else {
                this.f23131d = false;
                this.f23132e = q1.q.f17575h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f23138k);
        ArrayList arrayList = this.f23130c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb.append("\t");
            sb.append(c0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
