package q9;

import com.cnl.kikoeru.R;
import i7.i1;
import i7.j1;
import m0.l2;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.lifecycle.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f18053b = x0.v.v(i7.u.a(new i7.o0(new i1(0, new i9.f(29), null), 1, new j1(20)).f9240f, androidx.lifecycle.m0.h(this)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bg.p f18054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f18055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.f f18056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fg.f f18057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f18058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wb.b f18059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e1 f18060i;

    public o() {
        Boolean bool = Boolean.FALSE;
        this.f18055d = x0.v.v(bool);
        this.f18056e = lc.b.G("favReviewOrder", bg.p0.f2950a, gg.c.a(), false, jc.z.a(bg.p0.class));
        this.f18057f = lc.b.G("favQuerySort", bg.u.f2974a, gg.c.a(), false, jc.z.a(bg.u.class));
        this.f18058g = x0.v.v(null);
        wb.b bVarL = ud.b.l();
        bVarL.add(new ub.k(null, na.q.g(R.string.all_state)));
        vb.m.P(bVarL, na.o.f15731d);
        this.f18059h = ud.b.g(bVarL);
        this.f18060i = x0.v.v(bool);
    }

    public final void w(bg.p pVar, boolean z10) {
        if (!jc.l.a(pVar, this.f18054c) || z10) {
            this.f18054c = pVar;
            i7.o0 o0Var = new i7.o0(new i1(0, new l2(this, z10, pVar), null), 1, new j1(20));
            this.f18053b.setValue(i7.u.a(o0Var.f9240f, androidx.lifecycle.m0.h(this)));
        }
    }

    public final boolean x(bg.p pVar) {
        hg.b bVarP = pc.f0.P(gg.c.a(), "invalidatePlaylistCache", "", jc.z.a(String.class));
        if (!((Boolean) a9.i.d().getValue()).booleanValue()) {
            if (!jc.l.a(bVarP.a(), pVar != null ? pVar.f2937a : null)) {
                return false;
            }
        }
        a9.i.d().setValue(Boolean.FALSE);
        bVarP.d("");
        w(pVar, true);
        return true;
    }
}
