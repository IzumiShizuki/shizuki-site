package m5;

import java.util.Objects;
import m4.q1;
import p4.c0;
import v4.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0[] f14762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f14763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f14764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14765e;

    public u(z0[] z0VarArr, r[] rVarArr, q1 q1Var, Object obj) {
        p4.c.c(z0VarArr.length == rVarArr.length);
        this.f14762b = z0VarArr;
        this.f14763c = (r[]) rVarArr.clone();
        this.f14764d = q1Var;
        this.f14765e = obj;
        this.f14761a = z0VarArr.length;
    }

    public final boolean a(u uVar, int i10) {
        if (uVar == null) {
            return false;
        }
        z0 z0Var = this.f14762b[i10];
        z0 z0Var2 = uVar.f14762b[i10];
        int i11 = c0.f16548a;
        return Objects.equals(z0Var, z0Var2) && Objects.equals(this.f14763c[i10], uVar.f14763c[i10]);
    }

    public final boolean b(int i10) {
        return this.f14762b[i10] != null;
    }
}
