package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5224a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f5225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f5227d;

    public l(n nVar) {
        this.f5227d = nVar;
    }

    public final void a(View view) {
        if (this.f5226c) {
            return;
        }
        this.f5226c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jc.l.e(runnable, "runnable");
        this.f5225b = runnable;
        View decorView = this.f5227d.getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        if (!this.f5226c) {
            decorView.postOnAnimation(new a9.m(12, this));
        } else if (jc.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f5225b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f5224a) {
                this.f5226c = false;
                this.f5227d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f5225b = null;
        w wVar = (w) this.f5227d.f5243g.getValue();
        synchronized (wVar.f5258a) {
            z10 = wVar.f5259b;
        }
        if (z10) {
            this.f5226c = false;
            this.f5227d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5227d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
