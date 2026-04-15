package zg;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends yg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f26861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y4.i f26862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, s sVar, y4.i iVar) {
        super(str);
        this.f26861e = sVar;
        this.f26862f = iVar;
    }

    @Override // yg.a
    public final long a() throws InterruptedException {
        r rVar;
        s sVar = this.f26861e;
        try {
            rVar = sVar.d();
        } catch (Throwable th2) {
            rVar = new r(sVar, th2, 2);
        }
        y4.i iVar = this.f26862f;
        if (!((CopyOnWriteArrayList) iVar.f25511e).contains(sVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) iVar.f25512f).put(rVar);
        return -1L;
    }
}
