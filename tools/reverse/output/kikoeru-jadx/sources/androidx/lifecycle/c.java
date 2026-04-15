package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f755b;

    public c(int i10, Method method) {
        this.f754a = i10;
        this.f755b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f754a == cVar.f754a && this.f755b.getName().equals(cVar.f755b.getName());
    }

    public final int hashCode() {
        return this.f755b.getName().hashCode() + (this.f754a * 31);
    }
}
