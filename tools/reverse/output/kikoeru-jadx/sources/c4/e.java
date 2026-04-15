package c4;

import android.os.Build;
import b0.w1;
import c7.e1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f3363e;

    public e(f fVar) {
        super(5);
        this.f3363e = fVar;
    }

    @Override // android.support.v4.media.session.b
    public final void N(Throwable th2) {
        this.f3363e.f3364a.f(th2);
    }

    @Override // android.support.v4.media.session.b
    public final void O(w1 w1Var) {
        f fVar = this.f3363e;
        fVar.f3366c = w1Var;
        w1 w1Var2 = fVar.f3366c;
        k kVar = fVar.f3364a;
        fVar.f3365b = new e1(w1Var2, kVar.f3381g, kVar.f3383i, Build.VERSION.SDK_INT >= 34 ? p.a() : g8.a.C());
        k kVar2 = fVar.f3364a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f3375a.writeLock().lock();
        try {
            kVar2.f3377c = 1;
            arrayList.addAll(kVar2.f3376b);
            kVar2.f3376b.clear();
            kVar2.f3375a.writeLock().unlock();
            kVar2.f3378d.post(new i(arrayList, kVar2.f3377c, null));
        } catch (Throwable th2) {
            kVar2.f3375a.writeLock().unlock();
            throw th2;
        }
    }
}
