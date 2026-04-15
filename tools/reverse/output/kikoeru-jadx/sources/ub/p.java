package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.a f21550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21552c;

    public p(ic.a aVar) {
        jc.l.e(aVar, "initializer");
        this.f21550a = aVar;
        this.f21551b = x.f21562a;
        this.f21552c = this;
    }

    @Override // ub.h
    public final Object getValue() {
        Object objB;
        Object obj = this.f21551b;
        x xVar = x.f21562a;
        if (obj != xVar) {
            return obj;
        }
        synchronized (this.f21552c) {
            objB = this.f21551b;
            if (objB == xVar) {
                ic.a aVar = this.f21550a;
                jc.l.b(aVar);
                objB = aVar.b();
                this.f21551b = objB;
                this.f21550a = null;
            }
        }
        return objB;
    }

    public final String toString() {
        return this.f21551b != x.f21562a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
