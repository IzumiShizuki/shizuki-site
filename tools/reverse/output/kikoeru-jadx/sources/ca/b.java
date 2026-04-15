package ca;

import android.content.Context;
import d.k0;
import e7.a0;
import e7.b0;
import e7.n0;
import e7.w;
import h9.d;
import java.util.Iterator;
import jc.l;
import vb.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3829b;

    public /* synthetic */ b(a0 a0Var, int i10) {
        this.f3828a = i10;
        this.f3829b = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ic.a, jc.j] */
    @Override // ic.a
    public final Object b() {
        int i10;
        switch (this.f3828a) {
            case 0:
                a0.b(this.f3829b, "PlayingScreen");
                return ub.a0.f21526a;
            case 1:
                a0 a0Var = this.f3829b;
                k0 k0Var = a0Var.f6303f;
                boolean z10 = false;
                if (a0Var.f6304g) {
                    j jVar = a0Var.f6299b.f8164f;
                    if (jVar == null || !jVar.isEmpty()) {
                        Iterator it = jVar.iterator();
                        i10 = 0;
                        while (it.hasNext()) {
                            if (!(((e7.j) it.next()).f6334b instanceof w) && (i10 = i10 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 1) {
                        z10 = true;
                    }
                }
                k0Var.f5180a = z10;
                ?? r0 = k0Var.f5182c;
                if (r0 != 0) {
                    r0.b();
                }
                return ub.a0.f21526a;
            case 2:
                a0 a0Var2 = this.f3829b;
                Context context = a0Var2.f6298a;
                n0 n0Var = a0Var2.f6299b.f8177s;
                l.e(context, "context");
                l.e(n0Var, "navigatorProvider");
                return new b0();
            case 3:
                this.f3829b.c();
                return ub.a0.f21526a;
            case 4:
                h9.b bVarG = d.g();
                if (bVarG != null) {
                    a0.b(this.f3829b, "MusicScreen/" + bVarG.f8234a);
                }
                return ub.a0.f21526a;
            case 5:
                this.f3829b.c();
                return ub.a0.f21526a;
            default:
                a0.b(this.f3829b, "LoginScreen");
                return ub.a0.f21526a;
        }
    }
}
