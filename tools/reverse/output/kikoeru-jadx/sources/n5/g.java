package n5;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15333a;

    public final void a(int i10) {
        i iVar = this.f15333a;
        synchronized (iVar) {
            int i11 = iVar.f15358m;
            if (i11 == 0 || iVar.f15349d) {
                if (i11 == i10) {
                    return;
                }
                iVar.f15358m = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    iVar.f15356k = iVar.b(i10);
                    iVar.f15348c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iVar.c(iVar.f15351f > 0 ? (int) (jElapsedRealtime - iVar.f15352g) : 0, iVar.f15353h, iVar.f15356k);
                    iVar.f15352g = jElapsedRealtime;
                    iVar.f15353h = 0L;
                    iVar.f15355j = 0L;
                    iVar.f15354i = 0L;
                    t tVar = iVar.f15350e;
                    tVar.f15387b.clear();
                    tVar.f15389d = -1;
                    tVar.f15390e = 0;
                    tVar.f15391f = 0;
                }
            }
        }
    }
}
