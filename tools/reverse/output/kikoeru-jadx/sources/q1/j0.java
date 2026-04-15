package q1;

import android.graphics.Paint;
import android.graphics.Shader;
import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f17539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17540b = 9205357640488583168L;

    @Override // q1.m
    public final void a(float f10, long j10, p4.p pVar) {
        p2 p2Var = this.f17539a;
        if (p2Var == null || !p1.e.a(this.f17540b, j10)) {
            if (p1.e.e(j10)) {
                this.f17539a = null;
                this.f17540b = 9205357640488583168L;
                p2Var = null;
            } else {
                p2Var = this.f17539a;
                if (p2Var == null) {
                    p2Var = new p2();
                    this.f17539a = p2Var;
                }
                p2Var.f9258a = b(j10);
                this.f17539a = p2Var;
                this.f17540b = j10;
            }
        }
        long jC = h0.c(((Paint) pVar.f16600b).getColor());
        long j11 = q.f17569b;
        if (!q.c(jC, j11)) {
            pVar.i(j11);
        }
        if (!jc.l.a((Shader) pVar.f16601c, p2Var != null ? (Shader) p2Var.f9258a : null)) {
            pVar.l(p2Var != null ? (Shader) p2Var.f9258a : null);
        }
        if (r8.getAlpha() / 255.0f == f10) {
            return;
        }
        pVar.g(f10);
    }

    public abstract Shader b(long j10);
}
