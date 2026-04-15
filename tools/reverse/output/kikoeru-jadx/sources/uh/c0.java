package uh;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f21955e = new c0(a0.f21949b, 0.0f, i.f22007d, new b0(1, null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f21956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.m f21958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac.i f21959d;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(a0 a0Var, float f10, ic.a aVar, ic.k kVar) {
        this.f21956a = a0Var;
        this.f21957b = f10;
        this.f21958c = (jc.m) aVar;
        this.f21959d = (ac.i) kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f21956a == c0Var.f21956a && Float.compare(this.f21957b, c0Var.f21957b) == 0 && this.f21958c.equals(c0Var.f21958c) && this.f21959d.equals(c0Var.f21959d);
    }

    public final int hashCode() {
        return this.f21959d.hashCode() + ((this.f21958c.hashCode() + t0.x(this.f21957b, this.f21956a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.f21956a + ", speedMultiplier=" + this.f21957b + ", maxScrollDistanceProvider=" + this.f21958c + ", onScroll=" + this.f21959d + ')';
    }
}
