package y;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends u3.v implements Runnable, u3.f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f25227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u3.w0 f25230f;

    public r0(s1 s1Var) {
        super(!s1Var.f25254r ? 1 : 0);
        this.f25227c = s1Var;
    }

    @Override // u3.v
    public final void a(u3.e0 e0Var) {
        this.f25228d = false;
        this.f25229e = false;
        u3.w0 w0Var = this.f25230f;
        if (e0Var.f21286a.b() != 0 && w0Var != null) {
            u3.t0 t0Var = w0Var.f21343a;
            s1 s1Var = this.f25227c;
            s1Var.f25253q.f(d.q(t0Var.g(8)));
            s1Var.f25252p.f(d.q(t0Var.g(8)));
            s1.a(s1Var, w0Var);
        }
        this.f25230f = null;
    }

    @Override // u3.v
    public final void b() {
        this.f25228d = true;
        this.f25229e = true;
    }

    @Override // u3.f
    public final u3.w0 c(View view, u3.w0 w0Var) {
        this.f25230f = w0Var;
        s1 s1Var = this.f25227c;
        p1 p1Var = s1Var.f25252p;
        u3.t0 t0Var = w0Var.f21343a;
        p1Var.f(d.q(t0Var.g(8)));
        if (this.f25228d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f25229e) {
            s1Var.f25253q.f(d.q(t0Var.g(8)));
            s1.a(s1Var, w0Var);
        }
        return s1Var.f25254r ? u3.w0.f21342b : w0Var;
    }

    @Override // u3.v
    public final u3.w0 d(u3.w0 w0Var, List list) {
        s1 s1Var = this.f25227c;
        s1.a(s1Var, w0Var);
        return s1Var.f25254r ? u3.w0.f21342b : w0Var;
    }

    @Override // u3.v
    public final m0.w e(u3.e0 e0Var, m0.w wVar) {
        this.f25228d = false;
        return wVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25228d) {
            this.f25228d = false;
            this.f25229e = false;
            u3.w0 w0Var = this.f25230f;
            if (w0Var != null) {
                s1 s1Var = this.f25227c;
                s1Var.f25253q.f(d.q(w0Var.f21343a.g(8)));
                s1.a(s1Var, w0Var);
                this.f25230f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
