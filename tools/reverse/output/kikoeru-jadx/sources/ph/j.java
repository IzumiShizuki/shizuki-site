package ph;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f17207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17208f;

    @Override // ph.b
    public final String a() {
        switch (this.f17204b) {
            case 0:
                if (this.f17207e == null) {
                    b();
                    if (this.f17207e == null) {
                        this.f17207e = (b) this.f17206d.get(0);
                    }
                }
                break;
            default:
                if (this.f17207e == null) {
                    b();
                    if (this.f17207e == null) {
                        this.f17207e = (b) this.f17206d.get(0);
                    }
                }
                break;
        }
        return this.f17207e.a();
    }

    @Override // ph.b
    public final float b() {
        switch (this.f17204b) {
            case 0:
                int i10 = this.f17205c;
                if (i10 == 2) {
                    return 0.99f;
                }
                if (i10 == 3) {
                    return 0.01f;
                }
                float f10 = 0.0f;
                for (b bVar : this.f17206d) {
                    if (bVar.f17163a) {
                        float fB = bVar.b();
                        if (f10 < fB) {
                            this.f17207e = bVar;
                            f10 = fB;
                        }
                    }
                }
                return f10;
            default:
                int i11 = this.f17205c;
                if (i11 == 2) {
                    return 0.99f;
                }
                if (i11 == 3) {
                    return 0.01f;
                }
                float f11 = 0.0f;
                for (b bVar2 : this.f17206d) {
                    if (bVar2.f17163a) {
                        float fB2 = bVar2.b();
                        if (f11 < fB2) {
                            this.f17207e = bVar2;
                            f11 = fB2;
                        }
                    }
                }
                return f11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r8.f17207e = r10;
        r8.f17205c = 2;
     */
    @Override // ph.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(byte[] r9, int r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.j.c(byte[], int):int");
    }

    @Override // ph.b
    public final void d() {
        switch (this.f17204b) {
            case 0:
                this.f17208f = 0;
                for (b bVar : this.f17206d) {
                    bVar.d();
                    bVar.f17163a = true;
                    this.f17208f++;
                }
                this.f17207e = null;
                this.f17205c = 1;
                break;
            default:
                this.f17208f = 0;
                for (b bVar2 : this.f17206d) {
                    bVar2.d();
                    bVar2.f17163a = true;
                    this.f17208f++;
                }
                this.f17207e = null;
                this.f17205c = 1;
                break;
        }
    }
}
