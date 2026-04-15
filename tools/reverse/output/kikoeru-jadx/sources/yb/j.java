package yb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c, ac.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f26089b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f26090a;
    private volatile Object result;

    public j(c cVar) {
        zb.a aVar = zb.a.f26667a;
        this.f26090a = cVar;
        this.result = aVar;
    }

    @Override // ac.d
    public final ac.d f() {
        c cVar = this.f26090a;
        if (cVar instanceof ac.d) {
            return (ac.d) cVar;
        }
        return null;
    }

    @Override // yb.c
    public final void h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            zb.a aVar = zb.a.f26668b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26089b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            zb.a aVar2 = zb.a.f26667a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f26089b;
            zb.a aVar3 = zb.a.f26669c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f26090a.h(obj);
            return;
        }
    }

    @Override // yb.c
    public final h s() {
        return this.f26090a.s();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f26090a;
    }
}
