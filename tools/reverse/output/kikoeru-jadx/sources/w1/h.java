package w1;

import android.graphics.Path;
import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1.m f23209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23210c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1.m f23214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f23219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1.h f23224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q1.h f23225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q1.h f23226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f23227t;

    public h() {
        int i10 = g0.f23208a;
        this.f23211d = vb.r.f22819a;
        this.f23212e = 1.0f;
        this.f23215h = 0;
        this.f23216i = 0;
        this.f23217j = 4.0f;
        this.f23219l = 1.0f;
        this.f23221n = true;
        this.f23222o = true;
        q1.h hVarA = q1.j.a();
        this.f23225r = hVarA;
        this.f23226s = hVarA;
        this.f23227t = ub.a.c(ub.i.f21541b, g.f23205c);
    }

    @Override // w1.c0
    public final void a(s1.d dVar) {
        s1.d dVar2;
        s1.h hVar;
        if (this.f23221n) {
            b.d(this.f23211d, this.f23225r);
            e();
        } else if (this.f23223p) {
            e();
        }
        this.f23221n = false;
        this.f23223p = false;
        q1.m mVar = this.f23209b;
        if (mVar != null) {
            dVar2 = dVar;
            t0.n(dVar2, this.f23226s, mVar, this.f23210c, null, 56);
        } else {
            dVar2 = dVar;
        }
        q1.m mVar2 = this.f23214g;
        if (mVar2 != null) {
            s1.h hVar2 = this.f23224q;
            if (this.f23222o || hVar2 == null) {
                s1.h hVar3 = new s1.h(this.f23213f, this.f23217j, this.f23215h, this.f23216i, 16);
                this.f23224q = hVar3;
                this.f23222o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            t0.n(dVar2, this.f23226s, mVar2, this.f23212e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ub.h] */
    public final void e() {
        float f10 = this.f23218k;
        q1.h hVar = this.f23225r;
        if (f10 == 0.0f && this.f23219l == 1.0f) {
            this.f23226s = hVar;
            return;
        }
        if (jc.l.a(this.f23226s, hVar)) {
            this.f23226s = q1.j.a();
        } else {
            int i10 = this.f23226s.f17511a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f23226s.f17511a.rewind();
            this.f23226s.e(i10);
        }
        ?? r0 = this.f23227t;
        ((q1.i) r0.getValue()).f17519a.setPath(hVar != null ? hVar.f17511a : null, false);
        float length = ((q1.i) r0.getValue()).f17519a.getLength();
        float f11 = this.f23218k;
        float f12 = this.f23220m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f23219l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((q1.i) r0.getValue()).a(f13, f14, this.f23226s);
        } else {
            ((q1.i) r0.getValue()).a(f13, length, this.f23226s);
            ((q1.i) r0.getValue()).a(0.0f, f14, this.f23226s);
        }
    }

    public final String toString() {
        return this.f23225r.toString();
    }
}
