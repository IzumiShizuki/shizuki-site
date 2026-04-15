package n6;

import java.util.List;
import r5.d0;
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
    public final /* synthetic */ int f15393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f15394b;

    public a(int i10) {
        this.f15393a = i10;
        switch (i10) {
            case 1:
                this.f15394b = new d0(16973, 2, "image/bmp");
                break;
            default:
                this.f15394b = new d0(35152, 2, "image/png");
                break;
        }
    }

    @Override // r5.n
    public final void a() {
        int i10 = this.f15393a;
    }

    @Override // r5.n
    public final n c() {
        int i10 = this.f15393a;
        return this;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        switch (this.f15393a) {
        }
        return this.f15394b.f(oVar);
    }

    @Override // r5.n
    public final int g(o oVar, b0.a aVar) {
        switch (this.f15393a) {
        }
        return this.f15394b.g(oVar, aVar);
    }

    @Override // r5.n
    public final void h(q qVar) {
        switch (this.f15393a) {
            case 0:
                this.f15394b.h(qVar);
                break;
            default:
                this.f15394b.h(qVar);
                break;
        }
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        switch (this.f15393a) {
            case 0:
                this.f15394b.i(j10, j11);
                break;
            default:
                this.f15394b.i(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r5.n
    public final List j() {
        switch (this.f15393a) {
        }
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    private final void b() {
    }

    private final void d() {
    }
}
