package cb;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, p pVar, long j10, o oVar, o oVar2) {
        while (!unsafe.compareAndSwapObject(pVar, j10, oVar, oVar2)) {
            if (unsafe.getObject(pVar, j10) != oVar) {
                return false;
            }
        }
        return true;
    }
}
