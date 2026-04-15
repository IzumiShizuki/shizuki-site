package u0;

import a0.n;
import a0.v;
import android.view.ViewGroup;
import i2.l0;
import java.util.LinkedHashMap;
import m0.w;
import q1.o;
import q1.q;
import s.n0;
import x0.e1;
import x0.u1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u1, h, n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f21159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f21161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f21162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f21163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f21164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f21165g = x0.v.v(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f21166h = x0.v.v(Boolean.TRUE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21167i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21168j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r2.a f21169k = new r2.a(8, this);

    public a(float f10, w0 w0Var, w0 w0Var2, ViewGroup viewGroup) {
        this.f21159a = new v(false, new n(w0Var2, 4));
        this.f21160b = f10;
        this.f21161c = w0Var;
        this.f21162d = w0Var2;
        this.f21163e = viewGroup;
    }

    @Override // u0.h
    public final void C() {
        this.f21165g.setValue(null);
    }

    @Override // x0.u1
    public final void a() throws InterruptedException {
        g gVar = this.f21164f;
        if (gVar != null) {
            C();
            w wVar = gVar.f21193d;
            i iVar = (i) ((LinkedHashMap) wVar.f13782b).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f13782b;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f21192c.add(iVar);
            }
        }
    }

    @Override // s.n0
    public final void b(l0 l0Var) throws InterruptedException {
        s1.b bVar = l0Var.f8782a;
        this.f21167i = bVar.f19346b.D();
        float f10 = this.f21160b;
        this.f21168j = Float.isNaN(f10) ? lc.b.R(f.a(l0Var, false, bVar.f19346b.D())) : l0Var.a0(f10);
        long j10 = ((q) this.f21161c.getValue()).f17577a;
        float f11 = ((e) this.f21162d.getValue()).f21188d;
        l0Var.b();
        this.f21159a.k(l0Var, Float.isNaN(f10) ? f.a(l0Var, false, l0Var.e()) : l0Var.Q(f10), j10);
        o oVarZ = bVar.f19346b.z();
        ((Boolean) this.f21166h.getValue()).booleanValue();
        i iVar = (i) this.f21165g.getValue();
        if (iVar != null) {
            iVar.e(bVar.f19346b.D(), this.f21168j, j10, f11);
            iVar.draw(q1.c.a(oVarZ));
        }
    }

    @Override // x0.u1
    public final void c() throws InterruptedException {
        g gVar = this.f21164f;
        if (gVar != null) {
            C();
            w wVar = gVar.f21193d;
            i iVar = (i) ((LinkedHashMap) wVar.f13782b).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f13782b;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f21192c.add(iVar);
            }
        }
    }

    @Override // x0.u1
    public final void d() {
    }
}
