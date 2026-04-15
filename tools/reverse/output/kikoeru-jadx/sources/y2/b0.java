package y2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t2.i0;
import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc.b0 f25368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.e0 f25369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc.m f25371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ic.k f25372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f25373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f25374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f25376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f25377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f25378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z0.e f25379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a9.m f25380n;

    public b0(View view, j2.v vVar) {
        tc.b0 b0Var = new tc.b0(view);
        b7.e0 e0Var = new b7.e0(2, Choreographer.getInstance());
        this.f25367a = view;
        this.f25368b = b0Var;
        this.f25369c = e0Var;
        this.f25371e = b.f25362e;
        this.f25372f = b.f25363f;
        this.f25373g = new y(k0.f20356b, "", 4);
        this.f25374h = j.f25409g;
        this.f25375i = new ArrayList();
        this.f25376j = ub.a.c(ub.i.f21541b, new r2.a(14, this));
        this.f25378l = new c(vVar, b0Var);
        this.f25379m = new z0.e(new a0[16]);
    }

    @Override // y2.t
    public final void a() {
        i(a0.f25355a);
    }

    @Override // y2.t
    public final void b() {
        i(a0.f25357c);
    }

    @Override // y2.t
    public final void c() {
        this.f25370d = false;
        this.f25371e = b.f25364g;
        this.f25372f = b.f25365h;
        this.f25377k = null;
        i(a0.f25356b);
    }

    @Override // y2.t
    public final void d(y yVar, j jVar, cg.b bVar, h0.x xVar) {
        this.f25370d = true;
        this.f25373g = yVar;
        this.f25374h = jVar;
        this.f25371e = bVar;
        this.f25372f = xVar;
        i(a0.f25355a);
    }

    @Override // y2.t
    public final void e(y yVar, r rVar, i0 i0Var, a0.f0 f0Var, p1.c cVar, p1.c cVar2) {
        c cVar3 = this.f25378l;
        synchronized (cVar3.f25383c) {
            try {
                cVar3.f25390j = yVar;
                cVar3.f25392l = rVar;
                cVar3.f25391k = i0Var;
                cVar3.f25393m = f0Var;
                cVar3.f25394n = cVar;
                cVar3.f25395o = cVar2;
                if (cVar3.f25385e || cVar3.f25384d) {
                    cVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y2.t
    public final void f() {
        i(a0.f25358d);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ub.h] */
    @Override // y2.t
    public final void g(y yVar, y yVar2) {
        boolean z10 = (k0.a(this.f25373g.f25435b, yVar2.f25435b) && jc.l.a(this.f25373g.f25436c, yVar2.f25436c)) ? false : true;
        this.f25373g = yVar2;
        int size = this.f25375i.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) ((WeakReference) this.f25375i.get(i10)).get();
            if (uVar != null) {
                uVar.f25423d = yVar2;
            }
        }
        c cVar = this.f25378l;
        synchronized (cVar.f25383c) {
            cVar.f25390j = null;
            cVar.f25392l = null;
            cVar.f25391k = null;
            cVar.f25393m = b.f25360c;
            cVar.f25394n = null;
            cVar.f25395o = null;
        }
        if (jc.l.a(yVar, yVar2)) {
            if (z10) {
                tc.b0 b0Var = this.f25368b;
                int iE = k0.e(yVar2.f25435b);
                int iD = k0.d(yVar2.f25435b);
                k0 k0Var = this.f25373g.f25436c;
                int iE2 = k0Var != null ? k0.e(k0Var.f20358a) : -1;
                k0 k0Var2 = this.f25373g.f25436c;
                ((InputMethodManager) b0Var.f20619c.getValue()).updateSelection((View) b0Var.f20618b, iE, iD, iE2, k0Var2 != null ? k0.d(k0Var2.f20358a) : -1);
                return;
            }
            return;
        }
        if (yVar != null && (!jc.l.a(yVar.f25434a.f20320b, yVar2.f25434a.f20320b) || (k0.a(yVar.f25435b, yVar2.f25435b) && !jc.l.a(yVar.f25436c, yVar2.f25436c)))) {
            tc.b0 b0Var2 = this.f25368b;
            ((InputMethodManager) b0Var2.f20619c.getValue()).restartInput((View) b0Var2.f20618b);
            return;
        }
        int size2 = this.f25375i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u uVar2 = (u) ((WeakReference) this.f25375i.get(i11)).get();
            if (uVar2 != null) {
                y yVar3 = this.f25373g;
                tc.b0 b0Var3 = this.f25368b;
                if (uVar2.f25427h) {
                    uVar2.f25423d = yVar3;
                    if (uVar2.f25425f) {
                        ((InputMethodManager) b0Var3.f20619c.getValue()).updateExtractedText((View) b0Var3.f20618b, uVar2.f25424e, ud.b.I(yVar3));
                    }
                    k0 k0Var3 = yVar3.f25436c;
                    long j10 = yVar3.f25435b;
                    int iE3 = k0Var3 != null ? k0.e(k0Var3.f20358a) : -1;
                    k0 k0Var4 = yVar3.f25436c;
                    ((InputMethodManager) b0Var3.f20619c.getValue()).updateSelection((View) b0Var3.f20618b, k0.e(j10), k0.d(j10), iE3, k0Var4 != null ? k0.d(k0Var4.f20358a) : -1);
                }
            }
        }
    }

    @Override // y2.t
    public final void h(p1.c cVar) {
        Rect rect;
        this.f25377k = new Rect(lc.b.R(cVar.f16483a), lc.b.R(cVar.f16484b), lc.b.R(cVar.f16485c), lc.b.R(cVar.f16486d));
        if (!this.f25375i.isEmpty() || (rect = this.f25377k) == null) {
            return;
        }
        this.f25367a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(a0 a0Var) {
        this.f25379m.b(a0Var);
        if (this.f25380n == null) {
            a9.m mVar = new a9.m(24, this);
            this.f25369c.execute(mVar);
            this.f25380n = mVar;
        }
    }
}
