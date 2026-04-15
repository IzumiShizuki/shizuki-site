package j5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f10298c;

    public h1(j1 j1Var) {
        this.f10298c = j1Var;
    }

    @Override // j5.c1
    public final boolean a() {
        return this.f10298c.f10322l;
    }

    @Override // j5.c1
    public final void b() throws IOException {
        j1 j1Var = this.f10298c;
        if (j1Var.f10321k) {
            return;
        }
        j1Var.f10319i.b();
    }

    public final void c() {
        if (this.f10297b) {
            return;
        }
        j1 j1Var = this.f10298c;
        j1Var.f10315e.j(m4.o0.i(j1Var.f10320j.f14544n), j1Var.f10320j, 0, null, 0L);
        this.f10297b = true;
    }

    @Override // j5.c1
    public final int j(long j10) {
        c();
        if (j10 <= 0 || this.f10296a == 2) {
            return 0;
        }
        this.f10296a = 2;
        return 1;
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        c();
        j1 j1Var = this.f10298c;
        boolean z10 = j1Var.f10322l;
        if (z10 && j1Var.f10323m == null) {
            this.f10296a = 2;
        }
        int i11 = this.f10296a;
        if (i11 == 2) {
            fVar.b(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            eVar.f22365c = j1Var.f10320j;
            this.f10296a = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        j1Var.f10323m.getClass();
        fVar.b(1);
        fVar.f21384g = 0L;
        if ((i10 & 4) == 0) {
            fVar.j(j1Var.f10324n);
            fVar.f21382e.put(j1Var.f10323m, 0, j1Var.f10324n);
        }
        if ((i10 & 1) == 0) {
            this.f10296a = 2;
        }
        return -4;
    }
}
