package y;

import android.view.View;
import com.cnl.kikoeru.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f25236u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25237a = o0.d(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f25239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f25240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f25241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f25242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f25243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f25244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f25245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f25246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p1 f25247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f25248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1 f25249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p1 f25250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p1 f25251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f25252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p1 f25253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f25254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f25256t;

    public s1(View view) {
        c cVarD = o0.d(128, "displayCutout");
        this.f25238b = cVarD;
        c cVarD2 = o0.d(8, "ime");
        this.f25239c = cVarD2;
        c cVarD3 = o0.d(32, "mandatorySystemGestures");
        this.f25240d = cVarD3;
        this.f25241e = o0.d(2, "navigationBars");
        this.f25242f = o0.d(1, "statusBars");
        c cVarD4 = o0.d(519, "systemBars");
        this.f25243g = cVarD4;
        c cVarD5 = o0.d(16, "systemGestures");
        this.f25244h = cVarD5;
        c cVarD6 = o0.d(64, "tappableElement");
        this.f25245i = cVarD6;
        p1 p1Var = new p1(new u0(0, 0, 0, 0), "waterfall");
        this.f25246j = p1Var;
        new n1(new n1(cVarD4, cVarD2), cVarD);
        new n1(new n1(new n1(cVarD6, cVarD3), cVarD5), p1Var);
        this.f25247k = o0.e(4, "captionBarIgnoringVisibility");
        this.f25248l = o0.e(2, "navigationBarsIgnoringVisibility");
        this.f25249m = o0.e(1, "statusBarsIgnoringVisibility");
        this.f25250n = o0.e(519, "systemBarsIgnoringVisibility");
        this.f25251o = o0.e(64, "tappableElementIgnoringVisibility");
        this.f25252p = o0.e(8, "imeAnimationTarget");
        this.f25253q = o0.e(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f25254r = bool != null ? bool.booleanValue() : true;
        this.f25256t = new r0(this);
    }

    public static void a(s1 s1Var, u3.w0 w0Var) {
        boolean z10 = false;
        s1Var.f25237a.f(w0Var, 0);
        s1Var.f25239c.f(w0Var, 0);
        s1Var.f25238b.f(w0Var, 0);
        s1Var.f25241e.f(w0Var, 0);
        s1Var.f25242f.f(w0Var, 0);
        s1Var.f25243g.f(w0Var, 0);
        s1Var.f25244h.f(w0Var, 0);
        s1Var.f25245i.f(w0Var, 0);
        s1Var.f25240d.f(w0Var, 0);
        s1Var.f25247k.f(d.q(w0Var.f21343a.h(4)));
        s1Var.f25248l.f(d.q(w0Var.f21343a.h(2)));
        s1Var.f25249m.f(d.q(w0Var.f21343a.h(1)));
        s1Var.f25250n.f(d.q(w0Var.f21343a.h(519)));
        s1Var.f25251o.f(d.q(w0Var.f21343a.h(64)));
        u3.c cVarF = w0Var.f21343a.f();
        if (cVarF != null) {
            s1Var.f25246j.f(d.q(cVarF.a()));
        }
        synchronized (h1.n.f8051c) {
            o.l0 l0Var = h1.n.f8058j.f7989h;
            if (l0Var != null) {
                if (l0Var.h()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            h1.n.a();
        }
    }
}
