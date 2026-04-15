package k5;

import m4.q;
import p4.c0;
import p4.s;
import q.t0;
import r5.g0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f11037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.m f11038c = new r5.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f11039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f11040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11041f;

    public c(int i10, int i11, q qVar) {
        this.f11036a = i11;
        this.f11037b = qVar;
    }

    @Override // r5.h0
    public final void a(long j10, int i10, int i11, int i12, g0 g0Var) {
        long j11 = this.f11041f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f11040e = this.f11038c;
        }
        h0 h0Var = this.f11040e;
        int i13 = c0.f16548a;
        h0Var.a(j10, i10, i11, i12, g0Var);
    }

    @Override // r5.h0
    public final void b(q qVar) {
        q qVar2 = this.f11037b;
        if (qVar2 != null) {
            qVar = qVar.d(qVar2);
        }
        this.f11039d = qVar;
        h0 h0Var = this.f11040e;
        int i10 = c0.f16548a;
        h0Var.b(qVar);
    }

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) {
        h0 h0Var = this.f11040e;
        int i11 = c0.f16548a;
        return h0Var.d(iVar, i10, z10);
    }

    @Override // r5.h0
    public final int d(m4.i iVar, int i10, boolean z10) {
        return c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final /* synthetic */ void e(int i10, s sVar) {
        t0.c(this, sVar, i10);
    }

    @Override // r5.h0
    public final void f(s sVar, int i10, int i11) {
        h0 h0Var = this.f11040e;
        int i12 = c0.f16548a;
        h0Var.e(i10, sVar);
    }
}
