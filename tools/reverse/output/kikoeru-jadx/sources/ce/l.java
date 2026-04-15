package ce;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f3950b = j.f3945c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3951c;

    public final void f(m mVar) {
        c0 c0Var;
        if (!this.f3951c) {
            this.f3950b = this.f3950b.clone();
            this.f3951c = true;
        }
        j jVar = this.f3950b;
        j jVar2 = mVar.f3953a;
        jVar.getClass();
        int i10 = 0;
        while (true) {
            c0Var = jVar2.f3946a;
            if (i10 >= c0Var.f3905b.size()) {
                break;
            }
            jVar.g((Map.Entry) c0Var.f3905b.get(i10));
            i10++;
        }
        Iterator it = c0Var.c().iterator();
        while (it.hasNext()) {
            jVar.g((Map.Entry) it.next());
        }
    }
}
