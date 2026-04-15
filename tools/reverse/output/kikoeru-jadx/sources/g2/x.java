package g2;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends u3.v implements Runnable, u3.f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u3.w0 f7312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o.k0 f7313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.b1 f7314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o.g0 f7315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1.s f7316i;

    public x() {
        super(1);
        o.k0 k0Var = new o.k0(9);
        w1.f7309a.getClass();
        k0Var.m(v1.f7294b, new y1("caption bar"));
        k0Var.m(v1.f7295c, new y1("display cutout"));
        k0Var.m(v1.f7296d, new y1("ime"));
        k0Var.m(v1.f7297e, new y1("mandatory system gestures"));
        k0Var.m(v1.f7298f, new y1("navigation bars"));
        k0Var.m(v1.f7299g, new y1("status bars"));
        k0Var.m(v1.f7300h, new y1("system gestures"));
        k0Var.m(v1.f7301i, new y1("tappable element"));
        k0Var.m(v1.f7302j, new y1("waterfall"));
        this.f7313f = k0Var;
        this.f7314g = new x0.b1(0);
        this.f7315h = new o.g0(4);
        this.f7316i = new h1.s();
    }

    @Override // u3.v
    public final void a(u3.e0 e0Var) {
        boolean z10 = false;
        this.f7310c = false;
        int iD = e0Var.f21286a.d();
        this.f7311d &= ~iD;
        this.f7312e = null;
        w1 w1Var = (w1) androidx.compose.ui.layout.b.f718c.b(iD);
        if (w1Var != null) {
            Object objG = this.f7313f.g(w1Var);
            jc.l.b(objG);
            y1 y1Var = (y1) objG;
            y1Var.f7325c.f(0.0f);
            y1Var.f7327e.f(1.0f);
            y1Var.f7326d.e(0L);
            y1Var.f7325c.f(0.0f);
            y1Var.f7324b.setValue(Boolean.FALSE);
            y1Var.f7332j = -1L;
            y1Var.f7333k = -1L;
            x0.b1 b1Var = this.f7314g;
            b1Var.f(b1Var.e() + 1);
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

    @Override // u3.v
    public final void b() {
        this.f7310c = true;
    }

    @Override // u3.f
    public final u3.w0 c(View view, u3.w0 w0Var) {
        if (this.f7310c) {
            this.f7312e = w0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return w0Var;
            }
        } else if (this.f7311d == 0) {
            f(w0Var);
        }
        return w0Var;
    }

    @Override // u3.v
    public final u3.w0 d(u3.w0 w0Var, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u3.e0 e0Var = (u3.e0) list.get(i10);
            w1 w1Var = (w1) androidx.compose.ui.layout.b.f718c.b(e0Var.f21286a.d());
            if (w1Var != null) {
                Object objG = this.f7313f.g(w1Var);
                jc.l.b(objG);
                y1 y1Var = (y1) objG;
                if (((Boolean) y1Var.f7324b.getValue()).booleanValue()) {
                    u3.d0 d0Var = e0Var.f21286a;
                    y1Var.f7325c.f(d0Var.c());
                    y1Var.f7327e.f(d0Var.a());
                    y1Var.f7326d.e(d0Var.b());
                }
            }
        }
        f(w0Var);
        return w0Var;
    }

    @Override // u3.v
    public final m0.w e(u3.e0 e0Var, m0.w wVar) {
        u3.w0 w0Var = this.f7312e;
        boolean z10 = false;
        this.f7310c = false;
        this.f7312e = null;
        if (e0Var.f21286a.b() > 0 && w0Var != null) {
            int iD = e0Var.f21286a.d();
            this.f7311d |= iD;
            w1 w1Var = (w1) androidx.compose.ui.layout.b.f718c.b(iD);
            if (w1Var != null) {
                Object objG = this.f7313f.g(w1Var);
                jc.l.b(objG);
                y1 y1Var = (y1) objG;
                p3.b bVarG = w0Var.f21343a.g(iD);
                long j10 = (((long) bVarG.f16525a) << 48) | (((long) bVarG.f16526b) << 32) | (((long) bVarG.f16527c) << 16) | ((long) bVarG.f16528d);
                long j11 = y1Var.f7330h;
                if (!n1.h(j10, j11)) {
                    y1Var.f7332j = j11;
                    y1Var.f7333k = j10;
                    y1Var.f7324b.setValue(Boolean.TRUE);
                    u3.d0 d0Var = e0Var.f21286a;
                    y1Var.f7325c.f(d0Var.c());
                    y1Var.f7327e.f(d0Var.a());
                    y1Var.f7326d.e(d0Var.b());
                    x0.b1 b1Var = this.f7314g;
                    b1Var.f(b1Var.e() + 1);
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
                        return wVar;
                    }
                }
            }
        }
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(u3.w0 r34) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x.f(u3.w0):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = u3.s.f21328a;
        u3.l.c(view, this);
        u3.s.c(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = u3.s.f21328a;
        u3.l.c(view, null);
        u3.s.c(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7310c) {
            this.f7311d = 0;
            this.f7310c = false;
            u3.w0 w0Var = this.f7312e;
            if (w0Var != null) {
                f(w0Var);
                this.f7312e = null;
            }
        }
    }
}
