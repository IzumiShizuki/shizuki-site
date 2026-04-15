package androidx.compose.ui.layout;

import g2.n1;
import g2.v1;
import g2.w;
import g2.w1;
import g2.x;
import g2.x1;
import i2.o0;
import j1.q;
import o.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1[] f717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f718c;

    static {
        y yVar = new y(8);
        w1.f7309a.getClass();
        x1 x1Var = v1.f7299g;
        yVar.h(1, x1Var);
        x1 x1Var2 = v1.f7298f;
        yVar.h(2, x1Var2);
        x1 x1Var3 = v1.f7294b;
        yVar.h(4, x1Var3);
        x1 x1Var4 = v1.f7296d;
        yVar.h(8, x1Var4);
        x1 x1Var5 = v1.f7300h;
        yVar.h(16, x1Var5);
        x1 x1Var6 = v1.f7297e;
        yVar.h(32, x1Var6);
        x1 x1Var7 = v1.f7301i;
        yVar.h(64, x1Var7);
        f716a = yVar;
        f717b = new w1[]{x1Var, x1Var2, x1Var3, x1Var7, x1Var5, x1Var6, x1Var4, v1.f7302j, v1.f7295c};
        y yVar2 = new y(7);
        yVar2.h(1, x1Var);
        yVar2.h(2, x1Var2);
        yVar2.h(4, x1Var3);
        yVar2.h(16, x1Var5);
        yVar2.h(64, x1Var7);
        yVar2.h(32, x1Var6);
        yVar2.h(8, x1Var4);
        f718c = yVar2;
    }

    public static final void a(o0 o0Var, w wVar, long j10, int i10, int i11) {
        if (n1.h(j10, -1L)) {
            return;
        }
        o0Var.b(wVar.b(), (int) ((j10 >>> 48) & 65535));
        o0Var.b(wVar.d(), (int) ((j10 >>> 32) & 65535));
        o0Var.b(wVar.c(), i10 - ((int) ((j10 >>> 16) & 65535)));
        o0Var.b(wVar.a(), i11 - ((int) (j10 & 65535)));
    }

    public static final q b(x xVar) {
        return new RulerProviderModifierElement(xVar);
    }
}
