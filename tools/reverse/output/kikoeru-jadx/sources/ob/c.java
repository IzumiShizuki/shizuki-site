package ob;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.bugly.crashreport.biz.c f16304b;

    public c(com.tencent.bugly.crashreport.biz.c cVar, long j10) {
        this.f16304b = cVar;
        this.f16303a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.bugly.crashreport.biz.c cVar = this.f16304b;
        cVar.b();
        cVar.b(this.f16303a);
    }
}
