package s4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xa.i f19423c = ua.l.U(new p5.m(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb.z f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19425b;

    public i(Context context) {
        cb.z zVar = (cb.z) f19423c.get();
        p4.c.j(zVar);
        new m0.w(context);
        this.f19424a = zVar;
        this.f19425b = -1;
    }

    @Override // p4.b
    public final cb.y B0(byte[] bArr) {
        return ((cb.a0) this.f19424a).b(new k9.a(this, bArr));
    }
}
