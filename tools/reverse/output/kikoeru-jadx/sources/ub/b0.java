package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.a f21530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21531b;

    @Override // ub.h
    public final Object getValue() {
        if (this.f21531b == x.f21562a) {
            ic.a aVar = this.f21530a;
            jc.l.b(aVar);
            this.f21531b = aVar.b();
            this.f21530a = null;
        }
        return this.f21531b;
    }

    public final String toString() {
        return this.f21531b != x.f21562a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
