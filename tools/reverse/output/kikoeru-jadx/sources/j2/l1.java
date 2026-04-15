package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.o2 f9859a = new x0.o2(m0.f9890i);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0.o2 f9860b = new x0.o2(m0.f9891j);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0.o2 f9861c = new x0.o2(m0.f9893l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x0.o2 f9862d = new x0.o2(m0.f9892k);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x0.o2 f9863e = new x0.o2(m0.f9895n);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x0.o2 f9864f = new x0.o2(m0.f9894m);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x0.o2 f9865g = new x0.o2(m0.f9901t);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x0.o2 f9866h = new x0.o2(m0.f9897p);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x0.o2 f9867i = new x0.o2(m0.f9898q);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x0.o2 f9868j = new x0.o2(m0.f9900s);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x0.o2 f9869k = new x0.o2(m0.f9899r);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x0.o2 f9870l = new x0.o2(m0.f9902u);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x0.o2 f9871m = new x0.o2(m0.f9903v);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x0.o2 f9872n = new x0.o2(m0.f9904w);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x0.o2 f9873o = new x0.o2(m0.A);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x0.o2 f9874p = new x0.o2(m0.f9907z);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x0.o2 f9875q = new x0.o2(m0.B);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x0.o2 f9876r = new x0.o2(m0.C);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x0.o2 f9877s = new x0.o2(m0.D);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x0.o2 f9878t = new x0.o2(m0.E);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x0.o2 f9879u = new x0.o2(m0.f9905x);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x0.z f9880v = new x0.z(m0.f9906y);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x0.o2 f9881w = new x0.o2(m0.f9896o);

    public static final void a(i2.p1 p1Var, w0 w0Var, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(1925803616);
        int i11 = i10 | (oVar.f(p1Var) ? 4 : 2) | (oVar.f(w0Var) ? 32 : 16) | (oVar.h(nVar) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            v vVar = (v) p1Var;
            x0.n1 n1VarA = f9859a.a(vVar.getAccessibilityManager());
            x0.n1 n1VarA2 = f9860b.a(vVar.getAutofill());
            x0.n1 n1VarA3 = f9862d.a(vVar.getAutofillManager());
            x0.n1 n1VarA4 = f9861c.a(vVar.getAutofillTree());
            x0.n1 n1VarA5 = f9863e.a(vVar.getClipboardManager());
            x0.n1 n1VarA6 = f9864f.a(vVar.getClipboard());
            x0.n1 n1VarA7 = f9866h.a(vVar.getDensity());
            x0.n1 n1VarA8 = f9867i.a(vVar.getFocusOwner());
            x0.n1 n1VarA9 = f9868j.a(vVar.getFontLoader());
            n1VarA9.f24374f = false;
            x0.n1 n1VarA10 = f9869k.a(vVar.getFontFamilyResolver());
            n1VarA10.f24374f = false;
            x0.v.b(new x0.n1[]{n1VarA, n1VarA2, n1VarA3, n1VarA4, n1VarA5, n1VarA6, n1VarA7, n1VarA8, n1VarA9, n1VarA10, f9870l.a(vVar.getHapticFeedBack()), f9871m.a(vVar.getInputModeManager()), f9872n.a(vVar.getLayoutDirection()), f9873o.a(vVar.getTextInputService()), f9874p.a(vVar.getSoftwareKeyboardController()), f9875q.a(vVar.getTextToolbar()), f9876r.a(w0Var), f9877s.a(vVar.getViewConfiguration()), f9878t.a(vVar.getWindowInfo()), f9879u.a(vVar.getPointerIconService()), f9865g.a(vVar.getGraphicsContext())}, nVar, oVar, ((i11 >> 3) & 112) | 8);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0.c(p1Var, w0Var, nVar, i10, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
