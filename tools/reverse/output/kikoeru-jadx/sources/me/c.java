package me;

import jc.l;
import se.a0;
import se.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc.e f15126a;

    public c(yc.e eVar) {
        this.f15126a = eVar;
    }

    @Override // me.d
    public final w b() {
        a0 a0VarE = this.f15126a.E();
        l.d(a0VarE, "getDefaultType(...)");
        return a0VarE;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return l.a(this.f15126a, cVar != null ? cVar.f15126a : null);
    }

    public final int hashCode() {
        return this.f15126a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        a0 a0VarE = this.f15126a.E();
        l.d(a0VarE, "getDefaultType(...)");
        sb.append(a0VarE);
        sb.append('}');
        return sb.toString();
    }
}
