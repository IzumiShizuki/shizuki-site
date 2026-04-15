package ub;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21547c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ic.a f21548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21549b;

    @Override // ub.h
    public final Object getValue() {
        Object obj = this.f21549b;
        x xVar = x.f21562a;
        if (obj != xVar) {
            return obj;
        }
        ic.a aVar = this.f21548a;
        if (aVar != null) {
            Object objB = aVar.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21547c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, objB)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.f21548a = null;
            return objB;
        }
        return this.f21549b;
    }

    public final String toString() {
        return this.f21549b != x.f21562a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
