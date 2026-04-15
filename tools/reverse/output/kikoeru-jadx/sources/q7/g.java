package q7;

import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements z7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8.a f17907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17909c;

    public g(a8.a aVar, String str) {
        this.f17907a = aVar;
        this.f17908b = str;
    }

    @Override // z7.c
    public final int V() {
        return (int) getLong(0);
    }

    public final void b() {
        if (this.f17909c) {
            n.D(21, "statement is closed");
            throw null;
        }
    }

    @Override // z7.c
    public final boolean z() {
        return getLong(0) != 0;
    }
}
