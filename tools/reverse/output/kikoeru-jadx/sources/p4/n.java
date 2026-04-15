package p4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f16589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f16590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f16591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f16592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f16593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16596i;

    public n(Looper looper, v vVar, l lVar) {
        this(new CopyOnWriteArraySet(), looper, vVar, lVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f16594g) {
            try {
                if (this.f16595h) {
                    return;
                }
                this.f16591d.add(new m(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f16593f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        x xVar = this.f16589b;
        if (!xVar.f16627a.hasMessages(1)) {
            xVar.getClass();
            w wVarB = x.b();
            Message messageObtainMessage = xVar.f16627a.obtainMessage(1);
            wVarB.f16625a = messageObtainMessage;
            Handler handler = xVar.f16627a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            wVarB.a();
        }
        ArrayDeque arrayDeque2 = this.f16592e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i10, k kVar) {
        f();
        this.f16593f.add(new b5.n(new CopyOnWriteArraySet(this.f16591d), i10, kVar, 4));
    }

    public final void d() {
        f();
        synchronized (this.f16594g) {
            this.f16595h = true;
        }
        for (m mVar : this.f16591d) {
            l lVar = this.f16590c;
            mVar.f16587d = true;
            if (mVar.f16586c) {
                mVar.f16586c = false;
                lVar.g(mVar.f16584a, mVar.f16585b.d());
            }
        }
        this.f16591d.clear();
    }

    public final void e(int i10, k kVar) {
        c(i10, kVar);
        b();
    }

    public final void f() {
        if (this.f16596i) {
            c.i(Thread.currentThread() == this.f16589b.f16627a.getLooper().getThread());
        }
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, v vVar, l lVar, boolean z10) {
        this.f16588a = vVar;
        this.f16591d = copyOnWriteArraySet;
        this.f16590c = lVar;
        this.f16594g = new Object();
        this.f16592e = new ArrayDeque();
        this.f16593f = new ArrayDeque();
        this.f16589b = vVar.a(looper, new androidx.media3.exoplayer.offline.f(3, this));
        this.f16596i = z10;
    }
}
