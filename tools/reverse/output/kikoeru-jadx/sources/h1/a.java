package h1;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f7978b;

    public /* synthetic */ a(ic.k kVar, int i10) {
        this.f7977a = i10;
        this.f7978b = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long j10;
        int iE;
        switch (this.f7977a) {
            case 0:
                k kVar = (k) obj;
                synchronized (n.f8051c) {
                    j10 = n.f8053e;
                    n.f8053e = ((long) 1) + j10;
                }
                return new f(j10, kVar, this.f7978b);
            case 1:
                KeyEvent keyEvent = ((a2.b) obj).f188a;
                jc.l.e(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-it$0");
                boolean z10 = true;
                if (a2.c.O(keyEvent) == 1 && ((iE = (int) (g8.a.e(keyEvent.getKeyCode()) >> 32)) == 23 || iE == 66 || iE == 160)) {
                    this.f7978b.a(new p1.b(0L));
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                ic.k kVar2 = this.f7978b;
                se.w wVar = (se.w) obj;
                jc.l.b(wVar);
                return kVar2.a(wVar).toString();
        }
    }
}
