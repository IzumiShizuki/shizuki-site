package yg;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f26345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26346d;

    public a(String str) {
        l.e(str, "name");
        this.f26343a = str;
        this.f26344b = true;
        this.f26346d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f26343a;
    }
}
