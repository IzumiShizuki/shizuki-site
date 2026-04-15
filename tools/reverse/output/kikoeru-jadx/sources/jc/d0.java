package jc;

import j2.h0;
import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements pc.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.d f10824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10825b;

    public d0(pc.d dVar, List list) {
        l.e(dVar, "classifier");
        l.e(list, "arguments");
        this.f10824a = dVar;
        this.f10825b = list;
    }

    @Override // pc.v
    public final boolean a() {
        return false;
    }

    @Override // pc.v
    public final List b() {
        return this.f10825b;
    }

    @Override // pc.v
    public final pc.d c() {
        return this.f10824a;
    }

    public final String d(boolean z10) {
        String name;
        pc.d dVar = this.f10824a;
        pc.c cVar = dVar instanceof pc.c ? (pc.c) dVar : null;
        Class clsD = cVar != null ? g8.a.D(cVar) : null;
        if (clsD == null) {
            name = dVar.toString();
        } else if (clsD.isArray()) {
            name = clsD.equals(boolean[].class) ? "kotlin.BooleanArray" : clsD.equals(char[].class) ? "kotlin.CharArray" : clsD.equals(byte[].class) ? "kotlin.ByteArray" : clsD.equals(short[].class) ? "kotlin.ShortArray" : clsD.equals(int[].class) ? "kotlin.IntArray" : clsD.equals(float[].class) ? "kotlin.FloatArray" : clsD.equals(long[].class) ? "kotlin.LongArray" : clsD.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z10 && clsD.isPrimitive()) {
            l.c(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = g8.a.E((pc.c) dVar).getName();
        } else {
            name = clsD.getName();
        }
        List list = this.f10825b;
        return h0.k(name, list.isEmpty() ? "" : vb.m.f0(list, ", ", "<", ">", new e7.y(8, this), 24), "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return l.a(this.f10824a, d0Var.f10824a) && l.a(this.f10825b, d0Var.f10825b);
    }

    public final int hashCode() {
        return t0.z(this.f10824a.hashCode() * 31, 31, this.f10825b);
    }

    public final String toString() {
        return d(false) + " (Kotlin reflection is not available)";
    }
}
