package androidx.media3.exoplayer.offline;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p4.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4.f f870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t4.m f873k;

    public a0(z zVar, t4.f fVar, y yVar, byte[] bArr) {
        this.f870h = fVar;
        this.f871i = yVar;
        this.f872j = bArr;
        this.f873k = new t4.m(fVar, zVar.f987b, bArr, yVar);
    }

    @Override // p4.t
    public final void c() {
        this.f873k.f20464j = true;
    }

    @Override // p4.t
    public final Object d() throws IOException {
        this.f873k.a();
        y yVar = this.f871i;
        if (yVar == null) {
            return null;
        }
        yVar.f985e++;
        yVar.f981a.b(yVar.f982b, yVar.f984d, yVar.a());
        return null;
    }
}
