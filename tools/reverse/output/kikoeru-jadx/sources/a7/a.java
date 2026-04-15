package a7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p4.s;
import r5.d0;
import r5.k;
import r5.n;
import r5.o;
import r5.q;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f208c;

    public a(int i10) {
        this.f206a = i10;
        switch (i10) {
            case 1:
                this.f207b = new s(4);
                this.f208c = new d0(-1, -1, "image/avif");
                break;
            case 2:
                this.f207b = new s(4);
                this.f208c = new d0(-1, -1, "image/heif");
                break;
            default:
                this.f207b = new s(4);
                this.f208c = new d0(-1, -1, "image/webp");
                break;
        }
    }

    @Override // r5.n
    public final void a() {
        int i10 = this.f206a;
    }

    @Override // r5.n
    public final n c() {
        int i10 = this.f206a;
        return this;
    }

    @Override // r5.n
    public final boolean f(o oVar) throws EOFException, InterruptedIOException {
        switch (this.f206a) {
            case 0:
                s sVar = this.f207b;
                sVar.D(4);
                k kVar = (k) oVar;
                kVar.i(sVar.f16611a, 0, 4, false);
                if (sVar.w() == 1380533830) {
                    kVar.a(4, false);
                    sVar.D(4);
                    kVar.i(sVar.f16611a, 0, 4, false);
                    if (sVar.w() == 1464156752) {
                    }
                }
                break;
            case 1:
                k kVar2 = (k) oVar;
                kVar2.a(4, false);
                s sVar2 = this.f207b;
                sVar2.D(4);
                kVar2.i(sVar2.f16611a, 0, 4, false);
                if (sVar2.w() == 1718909296) {
                    sVar2.D(4);
                    kVar2.i(sVar2.f16611a, 0, 4, false);
                    if (sVar2.w() == 1635150182) {
                    }
                }
                break;
            default:
                k kVar3 = (k) oVar;
                kVar3.a(4, false);
                s sVar3 = this.f207b;
                sVar3.D(4);
                kVar3.i(sVar3.f16611a, 0, 4, false);
                if (sVar3.w() == 1718909296) {
                    sVar3.D(4);
                    kVar3.i(sVar3.f16611a, 0, 4, false);
                    if (sVar3.w() == 1751476579) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // r5.n
    public final int g(o oVar, b0.a aVar) {
        switch (this.f206a) {
        }
        return this.f208c.g(oVar, aVar);
    }

    @Override // r5.n
    public final void h(q qVar) {
        switch (this.f206a) {
            case 0:
                this.f208c.h(qVar);
                break;
            case 1:
                this.f208c.h(qVar);
                break;
            default:
                this.f208c.h(qVar);
                break;
        }
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        switch (this.f206a) {
            case 0:
                this.f208c.i(j10, j11);
                break;
            case 1:
                this.f208c.i(j10, j11);
                break;
            default:
                this.f208c.i(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r5.n
    public final List j() {
        switch (this.f206a) {
        }
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
