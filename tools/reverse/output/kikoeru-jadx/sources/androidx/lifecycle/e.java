package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f760b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f759a = i10;
        this.f760b = obj;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        switch (this.f759a) {
            case 0:
                new HashMap();
                j[] jVarArr = (j[]) this.f760b;
                if (jVarArr.length > 0) {
                    j jVar = jVarArr[0];
                    throw null;
                }
                if (jVarArr.length <= 0) {
                    return;
                }
                j jVar2 = jVarArr[0];
                throw null;
            default:
                if (oVar == o.ON_CREATE) {
                    xVar.f().q1(this);
                    ((o0) this.f760b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oVar).toString());
                }
        }
    }
}
