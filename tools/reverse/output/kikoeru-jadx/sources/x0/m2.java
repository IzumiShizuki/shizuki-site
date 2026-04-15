package x0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24359c;

    public m2(a2 a2Var, int i10, k0 k0Var, b bVar) {
        this.f24357a = a2Var;
        this.f24358b = i10;
        this.f24359c = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this.f24357a, this.f24358b, null, this.f24359c);
    }
}
