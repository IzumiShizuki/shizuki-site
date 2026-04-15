package d;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5181b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jc.j f5182c;

    public b0(boolean z10) {
        this.f5180a = z10;
    }

    public abstract void b();

    public void c(c cVar) {
        jc.l.e(cVar, "backEvent");
    }

    public void d(c cVar) {
        jc.l.e(cVar, "backEvent");
    }

    public void a() {
    }
}
