package w1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f23203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f23204j;

    public f0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f23195a = str;
        this.f23196b = f10;
        this.f23197c = f11;
        this.f23198d = f12;
        this.f23199e = f13;
        this.f23200f = f14;
        this.f23201g = f15;
        this.f23202h = f16;
        this.f23203i = list;
        this.f23204j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            return jc.l.a(this.f23195a, f0Var.f23195a) && this.f23196b == f0Var.f23196b && this.f23197c == f0Var.f23197c && this.f23198d == f0Var.f23198d && this.f23199e == f0Var.f23199e && this.f23200f == f0Var.f23200f && this.f23201g == f0Var.f23201g && this.f23202h == f0Var.f23202h && jc.l.a(this.f23203i, f0Var.f23203i) && jc.l.a(this.f23204j, f0Var.f23204j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23204j.hashCode() + t0.z(t0.x(this.f23202h, t0.x(this.f23201g, t0.x(this.f23200f, t0.x(this.f23199e, t0.x(this.f23198d, t0.x(this.f23197c, t0.x(this.f23196b, this.f23195a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f23203i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bf.h(this);
    }
}
