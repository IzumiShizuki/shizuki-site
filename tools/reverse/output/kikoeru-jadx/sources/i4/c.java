package i4;

import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import ic.k;
import java.util.Arrays;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f9003a;

    public c(f... fVarArr) {
        l.e(fVarArr, "initializers");
        this.f9003a = fVarArr;
    }

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(pc.c cVar, e eVar) {
        l.e(cVar, "modelClass");
        return c(g8.a.D(cVar), eVar);
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(Class cls, e eVar) {
        s0 s0Var;
        f fVar;
        k kVar;
        pc.c cVarH = g8.a.H(cls);
        f[] fVarArr = this.f9003a;
        f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        l.e(fVarArr2, "initializers");
        int length = fVarArr2.length;
        int i10 = 0;
        while (true) {
            s0Var = null;
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr2[i10];
            if (l.a(fVar.f9005a, cVarH)) {
                break;
            }
            i10++;
        }
        if (fVar != null && (kVar = fVar.f9006b) != null) {
            s0Var = (s0) kVar.a(eVar);
        }
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + cVarH.x()).toString());
    }
}
